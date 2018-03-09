
/**
 * AdjustAgendaFaultException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */

package nl.mcl.services;

public class AdjustAgendaFaultException extends java.lang.Exception {

	private static final long serialVersionUID = 1520588655558L;

	private nl.mcl.services.AdjustAgendaFault faultMessage;

	public AdjustAgendaFaultException() {
		super("AdjustAgendaFaultException");
	}

	public AdjustAgendaFaultException(java.lang.String s) {
		super(s);
	}

	public AdjustAgendaFaultException(java.lang.String s, java.lang.Throwable ex) {
		super(s, ex);
	}

	public AdjustAgendaFaultException(java.lang.Throwable cause) {
		super(cause);
	}

	public void setFaultMessage(nl.mcl.services.AdjustAgendaFault msg) {
		faultMessage = msg;
	}

	public nl.mcl.services.AdjustAgendaFault getFaultMessage() {
		return faultMessage;
	}
}
