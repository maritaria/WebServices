
/**
 * RoomServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */

package com.medicare.services.room;

/**
 * RoomServiceCallbackHandler Callback class, Users can extend this class and
 * implement their own receiveResult and receiveError methods.
 */
public abstract class RoomServiceCallbackHandler {

	protected Object clientData;

	/**
	 * User can pass in any object that needs to be accessed once the NonBlocking
	 * Web service call is finished and appropriate method of this CallBack is
	 * called.
	 * 
	 * @param clientData
	 *            Object mechanism by which the user can pass in user data that will
	 *            be avilable at the time this callback is called.
	 */
	public RoomServiceCallbackHandler(Object clientData) {
		this.clientData = clientData;
	}

	/**
	 * Please use this constructor if you don't want to set any clientData
	 */
	public RoomServiceCallbackHandler() {
		this.clientData = null;
	}

	/**
	 * Get the client data
	 */

	public Object getClientData() {
		return clientData;
	}

	/**
	 * auto generated Axis2 call back method for get method override this method for
	 * handling normal response from get operation
	 */
	public void receiveResultget(com.medicare.types.RoomE result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from get operation
	 */
	public void receiveErrorget(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for getAll method override this method
	 * for handling normal response from getAll operation
	 */
	public void receiveResultgetAll(com.medicare.services.room.RoomArrayResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from getAll operation
	 */
	public void receiveErrorgetAll(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for register method override this
	 * method for handling normal response from register operation
	 */
	public void receiveResultregister(com.medicare.types.RoomE result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from register operation
	 */
	public void receiveErrorregister(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for reserve method override this method
	 * for handling normal response from reserve operation
	 */
	public void receiveResultreserve() {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from reserve operation
	 */
	public void receiveErrorreserve(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for find method override this method
	 * for handling normal response from find operation
	 */
	public void receiveResultfind(com.medicare.services.room.RoomArrayResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from find operation
	 */
	public void receiveErrorfind(java.lang.Exception e) {
	}

}
