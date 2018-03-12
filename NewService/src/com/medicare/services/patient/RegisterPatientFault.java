
/**
 * RegisterPatientFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */

package com.medicare.services.patient;

public class RegisterPatientFault extends java.lang.Exception {

	private static final long serialVersionUID = 1520844622350L;

	private com.medicare.types.Error faultMessage;

	public RegisterPatientFault() {
		super("RegisterPatientFault");
	}

	public RegisterPatientFault(java.lang.String s) {
		super(s);
	}

	public RegisterPatientFault(java.lang.String s, java.lang.Throwable ex) {
		super(s, ex);
	}

	public RegisterPatientFault(java.lang.Throwable cause) {
		super(cause);
	}

	public void setFaultMessage(com.medicare.types.Error msg) {
		faultMessage = msg;
	}

	public com.medicare.types.Error getFaultMessage() {
		return faultMessage;
	}
}
