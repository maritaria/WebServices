
/**
 * PatientServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package nl.mcl.client.test;

import org.apache.tomcat.dbcp.pool2.impl.SecurityManagerCallStack;

import nl.mcl.client.*;

/*
 *  PatientServiceTest Junit test case
*/

public class PatientServiceTest extends junit.framework.TestCase {

	/**
	 * Auto generated test method
	 */
	public void testsendMessage() throws java.lang.Exception {

		PatientServiceStub stub = new PatientServiceStub();

		PatientServiceStub.SendMessage request = (PatientServiceStub.SendMessage) getTestObject(
				PatientServiceStub.SendMessage.class);

		request.setPatientNumber("101");
		request.setMessage("Hello World");
		request.setImportance("high");
		
		PatientServiceStub.SendMessageResponse response = stub.sendMessage(request);
		
		assertNotNull(response);

	}

	// Create an ADBBean and provide it as the test object
	public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception {
		return (org.apache.axis2.databinding.ADBBean) type.newInstance();
	}

}
