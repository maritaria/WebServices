
/**
 * FindFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */

package com.medicare.services.room;

public class FindFault extends java.lang.Exception {

	private static final long serialVersionUID = 1521024625688L;

	private com.medicare.types.Error faultMessage;

	public FindFault() {
		super("FindFault");
	}

	public FindFault(java.lang.String s) {
		super(s);
	}

	public FindFault(java.lang.String s, java.lang.Throwable ex) {
		super(s, ex);
	}

	public FindFault(java.lang.Throwable cause) {
		super(cause);
	}

	public void setFaultMessage(com.medicare.types.Error msg) {
		faultMessage = msg;
	}

	public com.medicare.types.Error getFaultMessage() {
		return faultMessage;
	}
}
