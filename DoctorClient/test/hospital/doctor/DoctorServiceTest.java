
/**
 * DoctorServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package hospital.doctor;

import java.util.Arrays;
import java.util.Calendar;

import hospital.doctor.DoctorServiceStub.DoctorIDs;
import hospital.doctor.DoctorServiceStub.ScheduleInfo_type0;
import hospital.doctor.DoctorServiceStub.Skills;
import hospital.doctor.DoctorServiceStub.Skills_type0;

/*
 *  DoctorServiceTest Junit test case
*/

public class DoctorServiceTest extends junit.framework.TestCase {
	
	// at this point of developement the doctors we find are hardcoded into the
	// skeleton since there are no CRUD operations

	public void testnotify() throws java.lang.Exception {

		hospital.doctor.DoctorServiceStub stub = new hospital.doctor.DoctorServiceStub();// the default implementation
																							// should point to the right
																							// endpoint
		hospital.doctor.DoctorServiceStub.AgendaCallback agendaCallback3 = (hospital.doctor.DoctorServiceStub.AgendaCallback) getTestObject(
				hospital.doctor.DoctorServiceStub.AgendaCallback.class);

		ScheduleInfo_type0 info = new ScheduleInfo_type0();
		info.setDoctorID("Alice");
		info.setPatientID("Bob");
		info.setRoomID("ChamberOfSecrets");
		Calendar calendar = Calendar.getInstance();
		info.setWhen(calendar);

		agendaCallback3.setScheduleInfo(info);

		// There is no output to be tested
		stub.notify(agendaCallback3);
	}

	public void testFindNoDoctor() throws Exception {
		DoctorServiceStub stub = new hospital.doctor.DoctorServiceStub();
		DoctorIDs foundDoctors = stub.findDoctor(createSkills("saw", "bore"));
		
		assertNotNull(foundDoctors);
		// there should be no doctor that can saw and bore
		assertTrue(!foundDoctors.getDoctorIDs().isDoctorIDSpecified());
	}
	
	public void testFindSingleDoctor() throws java.lang.Exception {
		DoctorServiceStub stub = new hospital.doctor.DoctorServiceStub();
		DoctorIDs foundDoctors = stub.findDoctor(createSkills("saw", "bore"));

		foundDoctors = stub.findDoctor(createSkills("heart-surgery"));
		assertNotNull(foundDoctors);
		// there should be at least one doctor
		assertTrue(foundDoctors.getDoctorIDs().isDoctorIDSpecified());
		// there should be only one doctor
		assertTrue(foundDoctors.getDoctorIDs().getDoctorID().length == 1);
		// the doctor we expect is patrick star
		assertEquals("patrick star", foundDoctors.getDoctorIDs().getDoctorID()[0]);

		// test for multiple doctors (squidward and spongebob)
	}
	
	public void testMultipleDoctors() throws Exception {
		DoctorServiceStub stub = new hospital.doctor.DoctorServiceStub();
		DoctorIDs foundDoctors = stub.findDoctor(createSkills("saw", "bore"));
		
		foundDoctors = stub.findDoctor(createSkills("brain-surgery"));
		assertNotNull(foundDoctors);
		// there should be at least one doctor
		assertTrue(foundDoctors.getDoctorIDs().isDoctorIDSpecified());
		// there should be exactly two doctors
		assertTrue(foundDoctors.getDoctorIDs().getDoctorID().length == 2);
		// the doctors we expect are spongebob squarepants and squidward tentacles
		String[] doctorIds = foundDoctors.getDoctorIDs().getDoctorID();
		// sort because the order in which doctors are returned is not specified
		Arrays.sort(doctorIds);
		// use lists instead of arrays because Object#equals on arrays doesn't work the way we want
		assertEquals(Arrays.asList("spongebob squarepants", "squidward tentacles"), Arrays.asList(doctorIds));
	}
	

	private Skills_type0 createSkillsType(String... skills) {
		Skills_type0 skillsType = new Skills_type0();
		skillsType.setSkill(skills);
		return skillsType;
	}

	private Skills createSkills(String... names) {
		Skills skills = new Skills();
		skills.setSkills(createSkillsType(names));
		return skills;
	}

	private <T extends org.apache.axis2.databinding.ADBBean> T getTestObject(Class<T> clazz)
			throws java.lang.Exception {
		return clazz.newInstance();
	}

}
