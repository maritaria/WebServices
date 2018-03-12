
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
	 */

	public com.medicare.services.room.RoomArrayResponse getAll(

	);

	/**
	 * Auto generated method signature
	 * 
	 */

	public com.medicare.services.room.RoomArrayResponse init(

	);

	/**
	 * Auto generated method signature
	 * 
	 * @param reservate
	 */

	public void reservate(com.medicare.services.room.Reservate reservate);

	/**
	 * Auto generated method signature
	 * 
	 * @param findFilter
	 */

	public com.medicare.services.room.RoomArrayResponse find(com.medicare.services.room.FindFilter findFilter);

}
