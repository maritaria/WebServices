package test.hospital.room;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import hospital.room.Items;
import hospital.room.RoomIDs;
import hospital.room.RoomServiceSkeleton;
import hospital.room.RoomServiceSkeleton.Room;

public class RoomTest {
	
	private RoomServiceSkeleton roomService = new RoomServiceSkeleton();
	
	@Test
	public void testNotFound() {
		RoomIDs ids = roomService.findRoom(new Items("test"));
		Assert.assertNotNull(ids);
		Assert.assertFalse(ids.isRoomIDSpecified());
	}
	
	@Test
	public void testAdd() {
		Room room = new Room("YOLO", Arrays.asList("test"));
		roomService.addRoom(room);
		
		RoomIDs ids = roomService.findRoom(new Items("test"));
		Assert.assertTrue(ids.isRoomIDSpecified());
		
		String[] idStrings = ids.getRoomID();
		Assert.assertTrue(idStrings.length == 1);
		Assert.assertEquals("YOLO", idStrings[0]);
	}

}
