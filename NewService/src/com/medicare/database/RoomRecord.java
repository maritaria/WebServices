package com.medicare.database;

import java.util.ArrayList;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import com.medicare.types.Room;

@DatabaseTable
public class RoomRecord {
	@DatabaseField(generatedId = true)
	private int id;
	@DatabaseField
	public String name;
	@DatabaseField(dataType = DataType.SERIALIZABLE)
	public ArrayList<String> equipment;

	public RoomRecord() {
		// ORMLite needs a no-arg constructor
		equipment = new ArrayList<String>();
	}

	public RoomRecord(Room soapRoom) {
		this();
		name = soapRoom.getName();
		if (soapRoom.isEquipmentSpecified()) {
			for (String s : soapRoom.getEquipment()) {
				equipment.add(s);
			}
		}
	}

	public int getId() {
		return id;
	}

	public Room toSoap() {
		Room result = new Room();
		result.setId(id);
		result.setName(name);
		for (String s : equipment) {
			result.addEquipment(s);
		}
		return result;
	}
}
