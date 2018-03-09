
/**
 * AgendaServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package nl.mcl.services;

/*
 *  AgendaServiceTest Junit test case
*/

public class AgendaServiceTest extends junit.framework.TestCase {

	/**
	 * Auto generated test method
	 */
	public void testgetFreeSlots() throws java.lang.Exception {

		AgendaServiceStub stub = new AgendaServiceStub();// the default implementation
															// should point to the right
															// endpoint

		AgendaServiceStub.GetFreeSlots getFreeSlots4 = (AgendaServiceStub.GetFreeSlots) getTestObject(
				AgendaServiceStub.GetFreeSlots.class);
		// TODO : Fill in the getFreeSlots4 here

		getFreeSlots4.setAgendaID(new String[] {"1"});
		
		assertNotNull(stub.getFreeSlots(getFreeSlots4));

	}

	/**
	 * Auto generated test method
	 */
	public void testadjustAgenda() throws java.lang.Exception {

		AgendaServiceStub stub = new AgendaServiceStub();// the default implementation
															// should point to the right
															// endpoint

		AgendaServiceStub.AdjustAgenda adjustAgenda6 = (AgendaServiceStub.AdjustAgenda) getTestObject(
				AgendaServiceStub.AdjustAgenda.class);
		// TODO : Fill in the adjustAgenda6 here

		assertNotNull(stub.adjustAgenda(adjustAgenda6));

	}

	// Create an ADBBean and provide it as the test object
	public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception {
		return (org.apache.axis2.databinding.ADBBean) type.newInstance();
	}

}
