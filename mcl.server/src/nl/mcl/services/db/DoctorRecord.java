package nl.mcl.services.db;

import java.util.ArrayList;
import java.util.List;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "doctors")
public class DoctorRecord {
	
	@DatabaseField(id = true)
	private String id;
	
	@DatabaseField(dataType = DataType.SERIALIZABLE)
	private ArrayList<String> skills;
	
	@DatabaseField
	private String fullName;
	
	public DoctorRecord() {}
	
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<String> getSkills() {
		return new ArrayList<>(skills);
	}

	public void setSkils(List<String> skills) {
		this.skills = new ArrayList<>(skills);
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public void setFullname(String fullName) {
		this.fullName = fullName;
	}

}
