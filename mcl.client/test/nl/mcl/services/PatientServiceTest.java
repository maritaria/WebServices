
/**
 * PatientServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package nl.mcl.services;

/*
 *  PatientServiceTest Junit test case
*/

public class PatientServiceTest extends junit.framework.TestCase {

	/**
	 * Auto generated test method
	 */
	public void testsendMessage() throws java.lang.Exception {

		nl.mcl.services.PatientServiceStub stub = new nl.mcl.services.PatientServiceStub();// the default implementation
																							// should point to the right
																							// endpoint

		nl.mcl.services.PatientServiceStub.SendMessage sendMessage2 = (nl.mcl.services.PatientServiceStub.SendMessage) getTestObject(
				nl.mcl.services.PatientServiceStub.SendMessage.class);
		// TODO : Fill in the sendMessage2 here

		assertNotNull(stub.sendMessage(sendMessage2));

	}

	// Create an ADBBean and provide it as the test object
	public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception {
		return (org.apache.axis2.databinding.ADBBean) type.newInstance();
	}

}
