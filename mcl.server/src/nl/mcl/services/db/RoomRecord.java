package nl.mcl.services.db;

import java.util.ArrayList;
import java.util.List;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "room")
public class RoomRecord {

	@DatabaseField(id = true)
	private String id;
	
	@DatabaseField(dataType = DataType.SERIALIZABLE)
	private ArrayList<String> equipment;
	
	public RoomRecord() {}
	
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<String> getEquipment() {
		return new ArrayList<>(equipment);
	}

	public void setEquipment(List<String> equipment) {
		this.equipment = new ArrayList<>(equipment);
	}

}
