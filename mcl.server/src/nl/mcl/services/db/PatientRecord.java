package nl.mcl.services.db;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "patients")
public class PatientRecord {
	@DatabaseField(id=true)
	public String id;
	@DatabaseField
	public String name;
	@DatabaseField
	public String phonenumber;
	@DatabaseField
	public String email;
	@DatabaseField
	public String address;
}
