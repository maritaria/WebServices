
/**
 * SendMessageFaultException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */

package nl.mcl.services;

public class SendMessageFaultException extends java.lang.Exception {

	private static final long serialVersionUID = 1520587828393L;

	private nl.mcl.services.SendMessageFault faultMessage;

	public SendMessageFaultException() {
		super("SendMessageFaultException");
	}

	public SendMessageFaultException(java.lang.String s) {
		super(s);
	}

	public SendMessageFaultException(java.lang.String s, java.lang.Throwable ex) {
		super(s, ex);
	}

	public SendMessageFaultException(java.lang.Throwable cause) {
		super(cause);
	}

	public void setFaultMessage(nl.mcl.services.SendMessageFault msg) {
		faultMessage = msg;
	}

	public nl.mcl.services.SendMessageFault getFaultMessage() {
		return faultMessage;
	}
}
