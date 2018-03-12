
/**
 * PatientServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package com.medicare.services.patient;

/**
 * PatientServiceSkeletonInterface java skeleton interface for the axisService
 */
public interface PatientServiceSkeletonInterface {

	/**
	 * Auto generated method signature
	 * 
	 * @param person
	 * @throws RegisterPatientFault
	 *             :
	 */

	public com.medicare.types.PatientE registerPatient(com.medicare.types.PersonE person) throws RegisterPatientFault;

	/**
	 * Auto generated method signature
	 * 
	 */

	public com.medicare.types.Patients getAll();

}
