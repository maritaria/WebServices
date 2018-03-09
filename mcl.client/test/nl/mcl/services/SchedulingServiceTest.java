
/**
 * SchedulingServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package nl.mcl.services;

/*
 *  SchedulingServiceTest Junit test case
*/

public class SchedulingServiceTest extends junit.framework.TestCase {

	/**
	 * Auto generated test method
	 */
	public void testscheduleTreatment() throws java.lang.Exception {

		nl.mcl.services.SchedulingServiceStub stub = new nl.mcl.services.SchedulingServiceStub();// the default
																									// implementation
																									// should point to
																									// the right
																									// endpoint

		nl.mcl.services.SchedulingServiceStub.ScheduleTreatment scheduleTreatment2 = (nl.mcl.services.SchedulingServiceStub.ScheduleTreatment) getTestObject(
				nl.mcl.services.SchedulingServiceStub.ScheduleTreatment.class);
		// TODO : Fill in the scheduleTreatment2 here

		assertNotNull(stub.scheduleTreatment(scheduleTreatment2));

	}

	// Create an ADBBean and provide it as the test object
	public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception {
		return (org.apache.axis2.databinding.ADBBean) type.newInstance();
	}

}
