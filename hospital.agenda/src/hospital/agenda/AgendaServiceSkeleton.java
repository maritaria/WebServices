
/**
 * AgendaServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package hospital.agenda;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.context.MessageContext;
import org.apache.axis2.databinding.types.Duration;
import org.apache.axis2.engine.AxisConfiguration;

import hospital.schema.*;

/**
 * AgendaServiceSkeleton java skeleton for the axisService
 */
public class AgendaServiceSkeleton implements AgendaServiceSkeletonInterface {

	public class ScheduledTreatment {
		public String patient;
		public String doctor;
		public String room;
		public Calendar when;
		public Duration duration;

		public ScheduledTreatment(AgendaRequest request) {
			patient = request.getSchedulingRequest().getPatientID();
			doctor = request.getDoctorIDs().getDoctorID()[0];
			room = request.getRoomIDs().getRoomID()[0];
			when = Calendar.getInstance();
			duration = request.getSchedulingRequest().getDuration();
		}

		public ScheduleInfo_type0 toSoap() {
			ScheduleInfo_type0 soap = new ScheduleInfo_type0();

			soap.setDoctorID(doctor);
			soap.setPatientID(patient);
			soap.setRoomID(room);
			soap.setWhen(when);

			return soap;
		}
	}

	public IDateProvider dateProvider = new DefaultDateProvider();
	private final List<ScheduledTreatment> schedule = new ArrayList<>();

	public void scheduleTreatment(AgendaRequest request) {
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(100);
					
					AgendaCallback result;
					if (request.getSchedulingRequest().getHighPriority()) {
						result = scheduleFirstPossible(request);
					} else {
						result = scheduleNormally(request);
					}
					AgendaCallbackServiceStub stub = new AgendaCallbackServiceStub();
					stub.receiveCallback(result);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					throw new java.lang.UnsupportedOperationException(e);
				}
			}
		});
		t.start();
	}

	private AgendaCallback scheduleNormally(AgendaRequest request) {
		// Schedule treatment somewhere
		ScheduledTreatment result = new ScheduledTreatment(request);
		scheduleAlgo(result);
		schedule.add(result);
		// Build result
		return new AgendaCallback(request, result);
	}

	private AgendaCallback scheduleFirstPossible(AgendaRequest planRequest) {
		ScheduledTreatment result = new ScheduledTreatment(planRequest);
		// Find the first time that the room is stopped using
		Calendar timeRoomEmpty = getRoomEmptyTime(result.room);
		// For all planned treatments that use the same doctor, find the first slot time
		// that is possible
		Calendar timeDoctorFree = getDoctorFreeTime(result.doctor, timeRoomEmpty);
		// Force the treatment in the given room at the found possible time
		result.when = timeDoctorFree;
		schedule.add(result);

		AgendaCallback callback = new AgendaCallback(planRequest, result);
		// Reschedule the planned treatment(s) in the timeslot
		List<ScheduledTreatment> existingPlans = getPlannedItems(result.room, timeDoctorFree, result.duration);
		for (ScheduledTreatment existingPlan : existingPlans) {
			if (existingPlan != result) {
				RescheduledTreatment_type0 reschedule = rescheduleExisting(existingPlan);
				callback.addRescheduledTreatment(reschedule);
			}
		}
		return callback;
	}

	private RescheduledTreatment_type0 rescheduleExisting(ScheduledTreatment existingPlan) {
		RescheduledTreatment_type0 result = new RescheduledTreatment_type0();
		result.setDoctorID(existingPlan.doctor);
		result.setPatientID(existingPlan.patient);
		result.setRoomID(existingPlan.room);
		result.setWhenOriginally(existingPlan.when);

		schedule.remove(existingPlan);
		scheduleAlgo(existingPlan);
		schedule.add(existingPlan);
		
		result.setWhen(existingPlan.when);
		return result;
	}

	private Calendar getRoomEmptyTime(String room) {
		Calendar firstPossible = dateProvider.getNow();
		for (ScheduledTreatment plan : schedule) {
			if (plan.room.equals(room)) {
				if (plan.when.before(firstPossible)) {
					Calendar endTime = getEndTime(plan);
					if (endTime.after(firstPossible)) {
						firstPossible = endTime;
					}
				}
			}
		}
		return firstPossible;
	}

	private Calendar getDoctorFreeTime(String doctor, Calendar firstPossible) {
		for (ScheduledTreatment plan : schedule) {
			if (plan.doctor.equals(doctor)) {
				if (plan.when.before(firstPossible)) {
					Calendar endTime = getEndTime(plan);
					if (endTime.after(firstPossible)) {
						firstPossible = endTime;
					}
				}
			}
		}
		return firstPossible;
	}
	
	private List<ScheduledTreatment> getPlannedItems(String roomID, Calendar timeDoctorFree, Duration duration) {
		List<ScheduledTreatment> result = new ArrayList<>();
		Calendar slotBegin = timeDoctorFree;
		Calendar slotEnd = getEndTime(slotBegin, duration);
		for (ScheduledTreatment item : schedule) {
			if (!item.room.equals(roomID)) {
				continue;
			}
			Calendar planBegin = item.when;
			Calendar planEnd = getEndTime(item);
			if (planEnd.after(slotBegin) && slotEnd.after(planBegin)) {
				result.add(item);
			}
		}
		return result;
	}

	private void scheduleAlgo(ScheduledTreatment result) {
		Calendar plannedTime = dateProvider.getNow();
		while (true) {
			Calendar plannedEndTime = getEndTime(plannedTime, result.duration);
			ScheduledTreatment overlap = getOverlap(result, plannedTime, plannedEndTime);
			if (overlap == null) {
				// No overlap so the treatment plan is possible
				break;
			}
			// There is an overlap and we know what overlap there is
			// So we update the proposed time to the endtime of that operation
			plannedTime = getEndTime(overlap);
		}
	}

	private Calendar getEndTime(ScheduledTreatment overlap) {
		return getEndTime(overlap.when, overlap.duration);
	}

	private Calendar getEndTime(Calendar startTime, Duration duration) {
		Calendar result = (Calendar) startTime.clone();
		result.add(Calendar.YEAR, duration.getYears());
		result.add(Calendar.MONTH, duration.getMonths());
		result.add(Calendar.DATE, duration.getDays());
		result.add(Calendar.HOUR, duration.getHours());
		result.add(Calendar.MINUTE, duration.getMinutes());
		result.add(Calendar.SECOND, (int) duration.getSeconds());
		return result;
	}

	private ScheduledTreatment getOverlap(ScheduledTreatment check, Calendar slotBegin, Calendar slotEnd) {
		for (ScheduledTreatment plan : schedule) {
			if (!doTreatmentEntitiesOverlap(check, plan)) {
				continue;
			}
			Calendar planBegin = plan.when;
			Calendar planEnd = getEndTime(plan);
			// x1 <= y2 && y1 <= x2
			// !(y2 < x1) && !(x2 < y1)
			if (slotBegin.before(planEnd) && planBegin.before(slotEnd)) {
				return plan;
			}
		}
		return null;
	}

	private boolean doTreatmentEntitiesOverlap(ScheduledTreatment a, ScheduledTreatment b) {
		return a.doctor.equals(b.doctor) || a.room.equals(b.room);
	}

}
