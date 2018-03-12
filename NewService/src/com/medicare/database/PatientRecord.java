package com.medicare.database;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import com.medicare.types.Patient;
import com.medicare.types.Person;

@DatabaseTable
public class PatientRecord {
	@DatabaseField(generatedId = true)
	private int id;
	@DatabaseField
	public String name;
    @DatabaseField
    public String address;
    @DatabaseField
    public String email;
    @DatabaseField
    public String phonenumber;
	
	public PatientRecord() {
        // ORMLite needs a no-arg constructor 
	}
	
	public PatientRecord(Person person) {
		name = person.getName();
		address = person.getAddress();
		phonenumber = person.getPhonenumber();
		email = person.getEmail();
	}
    
    public int getId() {
    	return id;
    }
    
    public Patient toSoap() {
    	Patient result = new Patient();
    	result.setId(Integer.toString(id));
    	result.setName(name);
    	result.setAddress(address);
    	result.setPhonenumber(phonenumber);
    	result.setEmail(email);
    	return result;
    }
}
