
/**
 * PatientServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package com.medicare.services.patient;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import com.medicare.database.ConnectionFactory;
import com.medicare.database.PatientRecord;
import com.medicare.database.Storage;
import com.medicare.types.Patient;
import com.medicare.types.PatientE;
import com.medicare.types.Patients;


/**
 * PatientServiceSkeleton java skeleton for the axisService
 */
public class PatientServiceSkeleton implements PatientServiceSkeletonInterface {

	/**
	 * Auto generated method signature
	 * 
	 * @param person2
	 * @return patient3
	 * @throws RegisterFault
	 */

	public com.medicare.types.PatientE register(com.medicare.types.PersonE person2) throws RegisterFault {
		PatientRecord newPatient = new PatientRecord(person2.getPerson());
		try (ConnectionSource conn = ConnectionFactory.create())
		{
			Storage.getPatients(conn).create(newPatient);
			PatientE result = new PatientE();
			result.setPatient(newPatient.toSoap());
			return result;
		} catch (SQLException e) {
			throw new RegisterFault("SQL error", e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RegisterFault("IO error", e);
		}
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param notify4
	 * @return param5
	 * @throws NotifyFaultException
	 */

	public void notify(com.medicare.services.patient.Notify notify4) throws NotifyFaultException {
		// TODO : fill this with the necessary business logic
	}

	/**
	 * Auto generated method signature
	 * 
	 * @return patients7
	 */

	public com.medicare.types.Patients getAll() {
		Patients results = new Patients();
		try (ConnectionSource conn = ConnectionFactory.create())
		{
			for(PatientRecord patientData : Storage.getPatients(conn).queryForAll()) {
				results.addPatient(patientData.toSoap());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Error("IO error: " + e.toString());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Error("SQL error: " + e.toString());
		}
		return results;
	}

}
