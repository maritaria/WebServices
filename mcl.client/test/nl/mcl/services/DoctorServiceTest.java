
/**
 * DoctorServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package nl.mcl.services;

/*
 *  DoctorServiceTest Junit test case
*/

public class DoctorServiceTest extends junit.framework.TestCase {

	/**
	 * Auto generated test method
	 */
	public void testfindDoctor() throws java.lang.Exception {

		DoctorServiceStub stub = new DoctorServiceStub();// the default implementation
																							// should point to the right
																							// endpoint

		DoctorServiceStub.FindDoctor request = (DoctorServiceStub.FindDoctor) getTestObject(
				DoctorServiceStub.FindDoctor.class);

		request.setRequiredSkill(new String[] {"legs"});
		DoctorServiceStub.FindDoctorResponse response =stub.findDoctor(request);
		
		assertNotNull(response);
		assertNotNull(response.getCandidate());
		assertTrue(response.getCandidate().length > 0);
	}

	// Create an ADBBean and provide it as the test object
	public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception {
		return (org.apache.axis2.databinding.ADBBean) type.newInstance();
	}

}
