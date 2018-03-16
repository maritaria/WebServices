
/**
 * RoomServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package hospital.room;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

/**
 * RoomServiceSkeleton java skeleton for the axisService
 */
public class RoomServiceSkeleton implements RoomServiceSkeletonInterface {
	
	//TODO DAO as field.
	private final List<Room> rooms = new ArrayList<>();
	
	public RoomServiceSkeleton() {
		this.rooms.add(new Room("1", Arrays.asList("hammer", "saw")));
		this.rooms.add(new Room("2", Arrays.asList("mri", "hammer")));
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param items0
	 * @return roomIDs1
	 */

	public hospital.room.RoomIDs findRoom(hospital.room.Items items) {
		RoomIDs roomIds = new RoomIDs();
		Stream<Room> rooms = this.rooms.stream();
		if (items.isItemSpecified()) {
			rooms = rooms.filter(room -> room.getItems().containsAll(Arrays.asList(items.getItem())));
		}
		rooms.map(Room::getId).forEach(roomIds::addRoomID);
		return roomIds;
	}
	
	public void addRoom(Room room) {
		this.rooms.add(Objects.requireNonNull(room));
	}
	
	
	public static class Room {
		private final String id;
		private final List<String> items;
		
		public Room(String id, List<String> items) {
			this.id = Objects.requireNonNull(id);
			this.items = new ArrayList<>(Objects.requireNonNull(items));
		}
	
		public String getId() {
			return id;
		}
		
		public List<String> getItems() {
			return Collections.unmodifiableList(items);
		}
	}

}
