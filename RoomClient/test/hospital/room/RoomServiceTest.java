
/**
 * RoomServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package hospital.room;

import java.util.Arrays;

import hospital.room.RoomServiceStub.Items;
import hospital.room.RoomServiceStub.Items_type0;
import hospital.room.RoomServiceStub.RoomIDs;

/*
 *  RoomServiceTest Junit test case
*/

public class RoomServiceTest extends junit.framework.TestCase {

	/*at this point of development, rooms are hardcoded in the skeleton
	 * since there are no CRUD operations for rooms (yet).
	 */
	
	public void testFindNoRoom() throws java.lang.Exception {
		hospital.room.RoomServiceStub stub = new hospital.room.RoomServiceStub();
		RoomIDs roomIds = stub.findRoom(createItems("heart-pump"));
		assertNotNull(roomIds);
		
		//there is no room with a heart-pump
		assertTrue(!roomIds.getRoomIDs().isRoomIDSpecified());
	}
	
	public void testFindOneRoom() throws Exception {
		hospital.room.RoomServiceStub stub = new hospital.room.RoomServiceStub();
		RoomIDs roomIds = stub.findRoom(createItems("mri"));
		assertNotNull(roomIds);
		
		//there is at least one room with mri
		assertTrue(roomIds.getRoomIDs().isRoomIDSpecified());
		//there is exactly one room with mri
		assertTrue(roomIds.getRoomIDs().getRoomID().length == 1);
		//the room we epect is room 2
		assertEquals("2", roomIds.getRoomIDs().getRoomID()[0]);
	}
	
	public void testFindMultipleRooms() throws Exception {
		hospital.room.RoomServiceStub stub = new hospital.room.RoomServiceStub();
		RoomIDs foundRooms = stub.findRoom(createItems("hammer"));
		assertNotNull(foundRooms);
		
		//there is at least one room with a hammer
		assertTrue(foundRooms.getRoomIDs().isRoomIDSpecified());
		//there is exactly one room with a hammer
		assertTrue(foundRooms.getRoomIDs().getRoomID().length == 2);
		//the rooms we expect are 1 and 2
		String[] roomIds = foundRooms.getRoomIDs().getRoomID();
		Arrays.sort(roomIds);
		assertEquals(Arrays.asList("1", "2"), Arrays.asList(roomIds));
	}
	
	private static Items createItems(String... names) {
		Items items = new Items();
		Items_type0 itemz = new Items_type0();
		itemz.setItem(names);
		items.setItems(itemz);
		return items;
	}

}
