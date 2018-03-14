
/**
 * RoomServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package com.medicare.services.room;

/**
 * RoomServiceSkeletonInterface java skeleton interface for the axisService
 */
public interface RoomServiceSkeletonInterface {

	/**
	 * Auto generated method signature
	 * 
	 * @param roomId
	 * @throws GetFault
	 *             :
	 */

	public com.medicare.types.RoomE get(com.medicare.services.room.RoomId roomId) throws GetFault;

	/**
	 * Auto generated method signature
	 * 
	 * @throws GetAllFault
	 *             :
	 */

	public com.medicare.services.room.RoomArrayResponse getAll(

	) throws GetAllFault;

	/**
	 * Auto generated method signature
	 * 
	 * @param room1
	 * @throws RegisterFault
	 *             :
	 */

	public com.medicare.types.RoomE register(com.medicare.types.RoomE room1) throws RegisterFault;

	/**
	 * Auto generated method signature
	 * 
	 * @param reserve
	 * @throws ReserveFault
	 *             :
	 */

	public void reserve(com.medicare.services.room.Reserve reserve) throws ReserveFault;

	/**
	 * Auto generated method signature
	 * 
	 * @param findFilter
	 * @throws FindFault
	 *             :
	 */

	public com.medicare.services.room.RoomArrayResponse find(com.medicare.services.room.FindFilter findFilter)
			throws FindFault;

}
