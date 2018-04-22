
/**
 * AgendaServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package hospital.agenda;

import org.apache.axis2.databinding.types.Duration;

import hospital.agenda.AgendaServiceStub.DoctorIDs_type0;
import hospital.agenda.AgendaServiceStub.Items_type0;
import hospital.agenda.AgendaServiceStub.RoomIDs_type0;
import hospital.agenda.AgendaServiceStub.SchedulingRequest_type0;
import hospital.agenda.AgendaServiceStub.Skills_type0;

/*
 *  AgendaServiceTest Junit test case
*/

public class AgendaServiceTest extends junit.framework.TestCase {

	/**
	 * Auto generated test method
	 */
	public void testscheduleTreatment() throws java.lang.Exception {

		hospital.agenda.AgendaServiceStub stub = new hospital.agenda.AgendaServiceStub();// the default implementation
																							// should point to the right
																							// endpoint
		hospital.agenda.AgendaServiceStub.AgendaRequest agendaRequest2 = (hospital.agenda.AgendaServiceStub.AgendaRequest) getTestObject(
				hospital.agenda.AgendaServiceStub.AgendaRequest.class);

		DoctorIDs_type0 doctorIdsType = new DoctorIDs_type0();
		doctorIdsType.setDoctorID(new String[] {"patrick star"});
		agendaRequest2.setDoctorIDs(doctorIdsType);
		
		RoomIDs_type0 roomIdsType = new RoomIDs_type0();
		roomIdsType.setRoomID(new String[] {"1"});
		agendaRequest2.setRoomIDs(roomIdsType);
		
		SchedulingRequest_type0 schedulingRequestType = new SchedulingRequest_type0();
		Duration duration = new Duration();
		duration.setHours(1);
		schedulingRequestType.setDuration(duration);
		schedulingRequestType.setHighPriority(false);
		
		Items_type0 items = new Items_type0();
		items.setItem(new String[0]);
		schedulingRequestType.setItems(items);
		
		schedulingRequestType.setPatientID("pietje");
		
		Skills_type0 skills = new Skills_type0();
		skills.setSkill(new String[0]);
		schedulingRequestType.setSkills(skills);
		

		schedulingRequestType.setRequestID("0");
		
		agendaRequest2.setSchedulingRequest(schedulingRequestType);
		
		// There is no output to be tested!
		stub.scheduleTreatment(agendaRequest2);

	}
	
	public void testEmergencyTreatment() throws java.lang.Exception {

		hospital.agenda.AgendaServiceStub stub = new hospital.agenda.AgendaServiceStub();// the default implementation
																							// should point to the right
																							// endpoint
		hospital.agenda.AgendaServiceStub.AgendaRequest agendaRequest2 = (hospital.agenda.AgendaServiceStub.AgendaRequest) getTestObject(
				hospital.agenda.AgendaServiceStub.AgendaRequest.class);

		DoctorIDs_type0 doctorIdsType = new DoctorIDs_type0();
		doctorIdsType.setDoctorID(new String[] {"patrick star"});
		agendaRequest2.setDoctorIDs(doctorIdsType);
		
		RoomIDs_type0 roomIdsType = new RoomIDs_type0();
		roomIdsType.setRoomID(new String[] {"1"});
		agendaRequest2.setRoomIDs(roomIdsType);
		
		SchedulingRequest_type0 schedulingRequestType = new SchedulingRequest_type0();
		Duration duration = new Duration();
		duration.setHours(1);
		schedulingRequestType.setDuration(duration);
		
		schedulingRequestType.setHighPriority(true); //emergency
		
		Items_type0 items = new Items_type0();
		items.setItem(new String[0]);
		schedulingRequestType.setItems(items);
		
		schedulingRequestType.setPatientID("pietje");
		
		Skills_type0 skills = new Skills_type0();
		skills.setSkill(new String[0]);
		schedulingRequestType.setSkills(skills);
		
		schedulingRequestType.setRequestID("0");
		
		agendaRequest2.setSchedulingRequest(schedulingRequestType);
		
		// There is no output to be tested!
		stub.scheduleTreatment(agendaRequest2);

	}

	// Create an ADBBean and provide it as the test object
	public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception {
		return (org.apache.axis2.databinding.ADBBean) type.newInstance();
	}

}
