package test.hospital.agenda;

import org.junit.Assert;
import org.junit.Test;

import hospital.agenda.AgendaServiceSkeleton;
import hospital.agenda.AgendaServiceSkeletonInterface;
import hospital.agenda.TreatmentPlan;
import hospital.agenda.TreatmentScheduling;

import java.util.Calendar;

import org.apache.axis2.databinding.types.Duration;

public class AgendaServiceTests {

	public AgendaServiceSkeletonInterface agendaService = new AgendaServiceSkeleton();
	public TestAgendaCallbackService callbackService = new TestAgendaCallbackService();

	public AgendaServiceTests() {
		AgendaServiceSkeleton service = new AgendaServiceSkeleton();
		service.dateProvider = new TestDateProvider();
		service.callbackService = callbackService;
		agendaService = service;
	}

	public static Duration get30Minutes() {
		return new Duration(false, 0, 0, 0, 0, 30, 0);
	}

	public static Duration get20Minutes() {
		return new Duration(false, 0, 0, 0, 0, 30, 0);
	}

	@Test
	public void testSimpleScheduling() {
		TreatmentPlan plan = new TreatmentPlan("room0", "doctor0", "patient0", get30Minutes());
		TreatmentScheduling result = agendaService.scheduleTreatment(plan);

		Assert.assertNotNull(result);
		Assert.assertEquals(plan.getRoomID(), result.getRoomID());
		Assert.assertEquals(plan.getDoctorID(), result.getDoctorID());
		Assert.assertEquals(plan.getPatientID(), result.getPatientID());
		Assert.assertNotNull(result.getWhen());
		Assert.assertEquals(TestDateProvider.YEAR, result.getWhen().get(Calendar.YEAR));
		Assert.assertEquals(TestDateProvider.MONTH, result.getWhen().get(Calendar.MONTH));
		Assert.assertEquals(TestDateProvider.DAY, result.getWhen().get(Calendar.DAY_OF_MONTH));
		Assert.assertEquals(TestDateProvider.HOUR, result.getWhen().get(Calendar.HOUR));
		Assert.assertEquals(TestDateProvider.MINUTE, result.getWhen().get(Calendar.MINUTE));
		Assert.assertNull(result.getWhenOriginally());
	}

	@Test
	public void testShiftRoomScheduling() {
		// Test shifted scheduling because of the same room being used
		callbackService.invokes.clear();
		TreatmentPlan plan0 = new TreatmentPlan("room0", "doctor0", "patient0", get30Minutes());
		TreatmentPlan plan1 = new TreatmentPlan("room0", "doctor1", "patient1", get30Minutes());

		TreatmentScheduling result0 = agendaService.scheduleTreatment(plan0);

		Assert.assertNotNull(result0);
		Assert.assertEquals(plan0.getRoomID(), result0.getRoomID());
		Assert.assertEquals(plan0.getDoctorID(), result0.getDoctorID());
		Assert.assertEquals(plan0.getPatientID(), result0.getPatientID());
		Assert.assertNotNull(result0.getWhen());
		Assert.assertEquals(TestDateProvider.YEAR, result0.getWhen().get(Calendar.YEAR));
		Assert.assertEquals(TestDateProvider.MONTH, result0.getWhen().get(Calendar.MONTH));
		Assert.assertEquals(TestDateProvider.DAY, result0.getWhen().get(Calendar.DAY_OF_MONTH));
		Assert.assertEquals(TestDateProvider.HOUR, result0.getWhen().get(Calendar.HOUR));
		Assert.assertEquals(TestDateProvider.MINUTE, result0.getWhen().get(Calendar.MINUTE));
		Assert.assertNull(result0.getWhenOriginally());

		TreatmentScheduling result1 = agendaService.scheduleTreatment(plan1);
		Assert.assertNotNull(result1);
		Assert.assertEquals(plan1.getRoomID(), result1.getRoomID());
		Assert.assertEquals(plan1.getDoctorID(), result1.getDoctorID());
		Assert.assertEquals(plan1.getPatientID(), result1.getPatientID());
		Assert.assertNotNull(result1.getWhen());
		Assert.assertEquals(TestDateProvider.YEAR, result1.getWhen().get(Calendar.YEAR));
		Assert.assertEquals(TestDateProvider.MONTH, result1.getWhen().get(Calendar.MONTH));
		Assert.assertEquals(TestDateProvider.DAY, result1.getWhen().get(Calendar.DAY_OF_MONTH));
		Assert.assertEquals(TestDateProvider.HOUR, result1.getWhen().get(Calendar.HOUR));
		Assert.assertEquals(TestDateProvider.MINUTE + 30, result1.getWhen().get(Calendar.MINUTE));
		Assert.assertNull(result1.getWhenOriginally());

	}

	public void testShiftDoctorScheduling() {
		// Test shifted scheduling because of the same doctor being used
		callbackService.invokes.clear();
		TreatmentPlan plan0 = new TreatmentPlan("room0", "doctor0", "patient0", get30Minutes());
		TreatmentPlan plan1 = new TreatmentPlan("room1", "doctor0", "patient1", get30Minutes());

		TreatmentScheduling result0 = agendaService.scheduleTreatment(plan0);

		Assert.assertNotNull(result0);
		Assert.assertEquals(plan0.getRoomID(), result0.getRoomID());
		Assert.assertEquals(plan0.getDoctorID(), result0.getDoctorID());
		Assert.assertEquals(plan0.getPatientID(), result0.getPatientID());
		Assert.assertNotNull(result0.getWhen());
		Assert.assertEquals(TestDateProvider.YEAR, result0.getWhen().get(Calendar.YEAR));
		Assert.assertEquals(TestDateProvider.MONTH, result0.getWhen().get(Calendar.MONTH));
		Assert.assertEquals(TestDateProvider.DAY, result0.getWhen().get(Calendar.DAY_OF_MONTH));
		Assert.assertEquals(TestDateProvider.HOUR, result0.getWhen().get(Calendar.HOUR));
		Assert.assertEquals(TestDateProvider.MINUTE, result0.getWhen().get(Calendar.MINUTE));
		Assert.assertNull(result0.getWhenOriginally());

		TreatmentScheduling result1 = agendaService.scheduleTreatment(plan1);
		Assert.assertNotNull(result1);
		Assert.assertEquals(plan1.getRoomID(), result1.getRoomID());
		Assert.assertEquals(plan1.getDoctorID(), result1.getDoctorID());
		Assert.assertEquals(plan1.getPatientID(), result1.getPatientID());
		Assert.assertNotNull(result1.getWhen());
		Assert.assertEquals(TestDateProvider.YEAR, result1.getWhen().get(Calendar.YEAR));
		Assert.assertEquals(TestDateProvider.MONTH, result1.getWhen().get(Calendar.MONTH));
		Assert.assertEquals(TestDateProvider.DAY, result1.getWhen().get(Calendar.DAY_OF_MONTH));
		Assert.assertEquals(TestDateProvider.HOUR, result1.getWhen().get(Calendar.HOUR));
		Assert.assertEquals(TestDateProvider.MINUTE + 30, result1.getWhen().get(Calendar.MINUTE));
		Assert.assertNull(result1.getWhenOriginally());

		Assert.assertEquals(0, callbackService.invokes.size());
	}

	@Test
	public void testRescheduling() {
		callbackService.invokes.clear();
		TreatmentPlan plan0 = new TreatmentPlan("room0", "doctor0", "patient0", get30Minutes());
		TreatmentPlan plan1 = new TreatmentPlan("room0", "doctor0", "patient1", get30Minutes(), true);
		TreatmentScheduling result0 = agendaService.scheduleTreatment(plan0);
		Assert.assertNotNull(result0);
		Assert.assertEquals(TestDateProvider.MINUTE, result0.getWhen().get(Calendar.MINUTE));
		Assert.assertEquals(0, callbackService.invokes.size());
		TreatmentScheduling result1 = agendaService.scheduleTreatment(plan1);
		Assert.assertNotNull(result1);
		Assert.assertEquals(1, callbackService.invokes.size());
		TreatmentScheduling x = callbackService.invokes.get(0);
		Assert.assertEquals(result0, x);
		Assert.assertEquals(TestDateProvider.MINUTE, result1.getWhen().get(Calendar.MINUTE));
		Assert.assertEquals(TestDateProvider.MINUTE + 30, x.getWhen().get(Calendar.MINUTE));
	}
}
