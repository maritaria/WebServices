
/**
 * DoctorServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package hospital.doctor;

/**
 * DoctorServiceSkeletonInterface java skeleton interface for the axisService
 */
public interface DoctorServiceSkeletonInterface {

	/**
	 * Auto generated method signature
	 * 
	 * @param agendaCallback
	 */

	public void notify(hospital.schema.AgendaCallback agendaCallback);

	/**
	 * Auto generated method signature
	 * 
	 * @param skills
	 */

	public hospital.schema.DoctorIDs findDoctor(hospital.schema.Skills skills);

}
