
/**
 * RoomServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package nl.mcl.services;

/*
 *  RoomServiceTest Junit test case
*/

public class RoomServiceTest extends junit.framework.TestCase {

	/**
	 * Auto generated test method
	 */
	public void testreserveRoom() throws java.lang.Exception {

		nl.mcl.services.RoomServiceStub stub = new nl.mcl.services.RoomServiceStub();// the default implementation
																						// should point to the right
																						// endpoint

		nl.mcl.services.RoomServiceStub.ReserveRoom reserveRoom4 = (nl.mcl.services.RoomServiceStub.ReserveRoom) getTestObject(
				nl.mcl.services.RoomServiceStub.ReserveRoom.class);
		// TODO : Fill in the reserveRoom4 here

		assertNotNull(stub.reserveRoom(reserveRoom4));

	}

	/**
	 * Auto generated test method
	 */
	public void testfilterRooms() throws java.lang.Exception {

		nl.mcl.services.RoomServiceStub stub = new nl.mcl.services.RoomServiceStub();// the default implementation
																						// should point to the right
																						// endpoint

		nl.mcl.services.RoomServiceStub.FilterRooms filterRooms6 = (nl.mcl.services.RoomServiceStub.FilterRooms) getTestObject(
				nl.mcl.services.RoomServiceStub.FilterRooms.class);
		// TODO : Fill in the filterRooms6 here

		assertNotNull(stub.filterRooms(filterRooms6));

	}

	// Create an ADBBean and provide it as the test object
	public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception {
		return (org.apache.axis2.databinding.ADBBean) type.newInstance();
	}

}
