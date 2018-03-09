
/**
 * AgendaServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package nl.mcl.services;

/**
 * AgendaServiceSkeletonInterface java skeleton interface for the axisService
 */
public interface AgendaServiceSkeletonInterface {

	/**
	 * Auto generated method signature
	 * 
	 * @param getFreeSlots
	 */

	public nl.mcl.services.GetFreeSlotsResponse getFreeSlots(nl.mcl.services.GetFreeSlots getFreeSlots);

	/**
	 * Auto generated method signature
	 * 
	 * @param adjustAgenda
	 * @throws AdjustAgendaFaultException
	 *             :
	 */

	public nl.mcl.services.AdjustAgendaResponse adjustAgenda(nl.mcl.services.AdjustAgenda adjustAgenda)
			throws AdjustAgendaFaultException;

}
