
/**
 * DoctorServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package com.medicare.services.doctor;

/**
 * DoctorServiceSkeleton java skeleton for the axisService
 */
public class DoctorServiceSkeleton implements DoctorServiceSkeletonInterface {

	/**
	 * Auto generated method signature
	 * 
	 * @param findFilter5
	 * @return doctorArrayResponse6
	 * @throws FindFaultException
	 */

	public com.medicare.services.doctor.DoctorArrayResponse find(com.medicare.services.doctor.FindFilter findFilter5)
			throws FindFaultException {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#find");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @return doctorArrayResponse8
	 * @throws GetAllFaultException
	 */

	public com.medicare.services.doctor.DoctorArrayResponse getAll(

	) throws GetAllFaultException {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#getAll");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param doctorId9
	 * @return doctor10
	 * @throws GetFaultException
	 */

	public com.medicare.types.DoctorE get(com.medicare.services.doctor.DoctorId doctorId9) throws GetFaultException {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#get");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param doctor11
	 * @return doctor12
	 * @throws RegisterFaultException
	 */

	public com.medicare.types.DoctorE register(com.medicare.types.DoctorE doctor11) throws RegisterFaultException {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#register");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param notify13
	 * @return param14
	 * @throws NotifyFaultException
	 */

	public void notify(com.medicare.services.doctor.Notify notify13) throws NotifyFaultException {
		// TODO : fill this with the necessary business logic

	}

}
