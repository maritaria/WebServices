
/**
 * DoctorServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package com.medicare.services.doctor;

/**
 * DoctorServiceSkeletonInterface java skeleton interface for the axisService
 */
public interface DoctorServiceSkeletonInterface {

	/**
	 * Auto generated method signature
	 * 
	 * @param findFilter
	 * @throws FindFaultException
	 *             :
	 */

	public com.medicare.services.doctor.DoctorArrayResponse find(com.medicare.services.doctor.FindFilter findFilter)
			throws FindFaultException;

	/**
	 * Auto generated method signature
	 * 
	 * @throws GetAllFaultException
	 *             :
	 */

	public com.medicare.services.doctor.DoctorArrayResponse getAll(

	) throws GetAllFaultException;

	/**
	 * Auto generated method signature
	 * 
	 * @param doctorId
	 * @throws GetFaultException
	 *             :
	 */

	public com.medicare.types.DoctorE get(com.medicare.services.doctor.DoctorId doctorId) throws GetFaultException;

	/**
	 * Auto generated method signature
	 * 
	 * @param doctor2
	 * @throws RegisterFaultException
	 *             :
	 */

	public com.medicare.types.DoctorE register(com.medicare.types.DoctorE doctor2) throws RegisterFaultException;

	/**
	 * Auto generated method signature
	 * 
	 * @param notify
	 * @throws NotifyFaultException
	 *             :
	 */

	public void notify(com.medicare.services.doctor.Notify notify) throws NotifyFaultException;

}
