
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
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.axis2.databinding.types.Duration;

/**
 * AgendaServiceSkeleton java skeleton for the axisService
 */
public class AgendaServiceSkeleton implements AgendaServiceSkeletonInterface {

	private final List<TreatmentScheduling> schedule = new ArrayList<>();

	public IAgendaCallbackService callbackService;
	public IDateProvider dateProvider = new DefaultDateProvider();

	public AgendaServiceSkeleton() {
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param treatmentPlan0
	 * @return treatmentScheduling1
	 */

	public TreatmentScheduling scheduleTreatment(TreatmentPlan planRequest) {
		if (planRequest.getHighPriority()) {
			return scheduleFirstPossibleTreatment(planRequest);
		} else {
			return scheduleNormally(planRequest);
		}
	}

	private TreatmentScheduling scheduleFirstPossibleTreatment(TreatmentPlan planRequest) {
		TreatmentScheduling result = new TreatmentScheduling(planRequest);

		// Find the first time that the room is stopped using
		Calendar timeRoomEmpty = getRoomEmptyTime(planRequest.getRoomID());
		// For all planned treatments that use the same doctor, find the first slot time
		// that is possible
		Calendar timeDoctorFree = getDoctorFreeTime(planRequest.getDoctorID(), timeRoomEmpty);
		// Force the treatment in the given room at the found possible time
		result.setWhen(timeDoctorFree);
		schedule.add(result);

		// Reschedule the planned treatment(s) in the timeslot
		List<TreatmentScheduling> existingPlans = getPlannedItems(planRequest.getRoomID(), timeDoctorFree,
				planRequest.getDuration());
		for (TreatmentScheduling existingPlan : existingPlans) {
			if (existingPlan != result) {
				rescheduleExisting(existingPlan);
			}
		}

		return result;
	}

	private Calendar getRoomEmptyTime(String roomID) {
		Calendar firstPossible = dateProvider.getNow();
		for (TreatmentScheduling plan : schedule) {
			if (plan.getRoomID() == roomID) {
				if (plan.getWhen().before(firstPossible)) {
					Calendar endTime = getEndTime(plan);
					if (endTime.after(firstPossible)) {
						firstPossible = endTime;
					}
				}
			}
		}
		return firstPossible;
	}

	private Calendar getDoctorFreeTime(String doctorID, Calendar firstPossible) {
		for (TreatmentScheduling plan : schedule) {
			if (plan.getRoomID() == doctorID) {
				if (plan.getWhen().before(firstPossible)) {
					Calendar endTime = getEndTime(plan);
					if (endTime.after(firstPossible)) {
						firstPossible = endTime;
					}
				}
			}
		}
		return firstPossible;
	}

	private List<TreatmentScheduling> getPlannedItems(String roomID, Calendar timeDoctorFree, Duration duration) {
		List<TreatmentScheduling> result = new ArrayList<>();
		Calendar slotBegin = timeDoctorFree;
		Calendar slotEnd = getEndTime(slotBegin, duration);
		for (TreatmentScheduling item : schedule) {
			if (!item.getRoomID().equals(roomID)) {
				continue;
			}
			Calendar planBegin = item.getWhen();
			Calendar planEnd = getEndTime(item);
			if (planEnd.after(slotBegin) && slotEnd.after(planBegin)) {
				result.add(item);
			}
		}
		return result;
	}

	private void rescheduleExisting(TreatmentScheduling existingPlan) {
		existingPlan.setWhenOriginally(existingPlan.getWhen());

		schedule.remove(existingPlan);
		scheduleAlgo(existingPlan);
		schedule.add(existingPlan);

		try {
			callbackService.receiveCallback(existingPlan);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private TreatmentScheduling scheduleNormally(TreatmentPlan planRequest) {
		TreatmentScheduling result = new TreatmentScheduling(planRequest);
		scheduleAlgo(result);
		schedule.add(result);
		return result;
	}

	private void scheduleAlgo(TreatmentScheduling result) {
		// Start with now
		Calendar plannedTime = dateProvider.getNow();
		while (true) {
			Calendar plannedEndTime = getEndTime(plannedTime, result.getDuration());
			TreatmentScheduling overlap = getOverlap(result, plannedTime, plannedEndTime);

			if (overlap == null) {
				// No overlap so the treatment plan is possible
				break;
			}
			// There is an overlap and we know what overlap there is
			// So we update the proposed time to the endtime of that operation
			plannedTime = getEndTime(overlap);
		}

		result.setWhen(plannedTime);
	}

	private TreatmentScheduling getOverlap(TreatmentScheduling check, Calendar slotBegin, Calendar slotEnd) {
		for (TreatmentScheduling plan : schedule) {
			if (!doTreatmentEntitiesOverlap(check, plan)) {
				continue;
			}
			Calendar planBegin = plan.getWhen();
			Calendar planEnd = getEndTime(plan);
			// x1 <= y2 && y1 <= x2
			// !(y2 < x1) && !(x2 < y1)
			if (slotBegin.before(planEnd) && planBegin.before(slotEnd)) {
				return plan;
			}
		}
		return null;
	}

	private Calendar getEndTime(TreatmentScheduling item) {
		return getEndTime(item.getWhen(), item.getDuration());
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

	private boolean doTreatmentEntitiesOverlap(TreatmentScheduling a, TreatmentScheduling b) {
		return a.getDoctorID() == b.getDoctorID() || a.getRoomID() == b.getRoomID();
	}

}
