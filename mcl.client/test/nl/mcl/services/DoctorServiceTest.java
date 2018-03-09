
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

		nl.mcl.services.DoctorServiceStub stub = new nl.mcl.services.DoctorServiceStub();// the default implementation
																							// should point to the right
																							// endpoint

		nl.mcl.services.DoctorServiceStub.FindDoctor findDoctor2 = (nl.mcl.services.DoctorServiceStub.FindDoctor) getTestObject(
				nl.mcl.services.DoctorServiceStub.FindDoctor.class);
		// TODO : Fill in the findDoctor2 here

		assertNotNull(stub.findDoctor(findDoctor2));

	}

	// Create an ADBBean and provide it as the test object
	public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception {
		return (org.apache.axis2.databinding.ADBBean) type.newInstance();
	}

}
