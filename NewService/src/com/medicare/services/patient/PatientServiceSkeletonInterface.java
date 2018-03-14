
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
	 * @throws RegisterFault
	 *             :
	 */

	public com.medicare.types.PatientE register(com.medicare.types.PersonE person) throws RegisterFault;

	/**
	 * Auto generated method signature
	 * 
	 * @param notify
	 * @throws NotifyFault
	 *             :
	 */

	public void notify(com.medicare.services.patient.Notify notify) throws NotifyFault;

	/**
	 * Auto generated method signature
	 * 
	 * @throws GetAllFault
	 *             :
	 */

	public com.medicare.types.Patients getAll(

	) throws GetAllFault;

	/**
	 * Auto generated method signature
	 * 
	 * @param patientId
	 * @throws GetFault
	 *             :
	 */

	public com.medicare.types.PatientE get(com.medicare.services.patient.PatientId patientId) throws GetFault;

	/**
	 * Auto generated method signature
	 * 
	 * @param patientName
	 * @throws FindFault
	 *             :
	 */

	public com.medicare.types.Patients find(com.medicare.services.patient.PatientName patientName) throws FindFault;

}
