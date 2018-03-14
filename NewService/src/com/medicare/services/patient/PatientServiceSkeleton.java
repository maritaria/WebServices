
/**
 * PatientServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package com.medicare.services.patient;

/**
 * PatientServiceSkeleton java skeleton for the axisService
 */
public class PatientServiceSkeleton implements PatientServiceSkeletonInterface {

	/**
	 * Auto generated method signature
	 * 
	 * @param person4
	 * @return patient5
	 * @throws RegisterFault
	 */

	public com.medicare.types.PatientE register(com.medicare.types.PersonE person4) throws RegisterFault {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#register");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param notify6
	 * @return param7
	 * @throws NotifyFault
	 */

	public void notify(com.medicare.services.patient.Notify notify6) throws NotifyFault {
		// TODO : fill this with the necessary business logic

	}

	/**
	 * Auto generated method signature
	 * 
	 * @return patients9
	 * @throws GetAllFault
	 */

	public com.medicare.types.Patients getAll(

	) throws GetAllFault {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#getAll");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param patientId10
	 * @return patient11
	 * @throws GetFault
	 */

	public com.medicare.types.PatientE get(com.medicare.services.patient.PatientId patientId10) throws GetFault {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#get");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param patientName12
	 * @return patients13
	 * @throws FindFault
	 */

	public com.medicare.types.Patients find(com.medicare.services.patient.PatientName patientName12) throws FindFault {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#find");
	}

}
