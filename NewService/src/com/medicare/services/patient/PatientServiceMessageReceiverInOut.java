
/**
 * PatientServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package com.medicare.services.patient;

/**
 * PatientServiceMessageReceiverInOut message receiver
 */

public class PatientServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver {

	public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext,
			org.apache.axis2.context.MessageContext newMsgContext) throws org.apache.axis2.AxisFault {

		try {

			// get the implementation class for the Web Service
			Object obj = getTheImplementationObject(msgContext);

			PatientServiceSkeletonInterface skel = (PatientServiceSkeletonInterface) obj;
			// Out Envelop
			org.apache.axiom.soap.SOAPEnvelope envelope = null;
			// Find the axisOperation that has been set by the Dispatch phase.
			org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
			if (op == null) {
				throw new org.apache.axis2.AxisFault(
						"Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
			}

			java.lang.String methodName;
			if ((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils
					.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)) {

				if ("register".equals(methodName)) {

					com.medicare.types.PatientE patient21 = null;
					com.medicare.types.PersonE wrappedParam = (com.medicare.types.PersonE) fromOM(
							msgContext.getEnvelope().getBody().getFirstElement(), com.medicare.types.PersonE.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					patient21 =

							skel.register(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext), patient21, false,
							new javax.xml.namespace.QName("http://medicare.com/Services/Patient", "register"));
				} else

				if ("notify".equals(methodName)) {

					com.medicare.services.patient.Notify wrappedParam = (com.medicare.services.patient.Notify) fromOM(
							msgContext.getEnvelope().getBody().getFirstElement(),
							com.medicare.services.patient.Notify.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					skel.notify(wrappedParam);

					envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
				} else

				if ("getAll".equals(methodName)) {

					com.medicare.types.Patients patients25 = null;
					patients25 =

							skel.getAll();

					envelope = toEnvelope(getSOAPFactory(msgContext), patients25, false,
							new javax.xml.namespace.QName("http://medicare.com/Services/Patient", "getAll"));

				} else {
					throw new java.lang.RuntimeException("method not found");
				}

				newMsgContext.setEnvelope(envelope);
			}
		} catch (RegisterFault e) {

			msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME, "error");
			org.apache.axis2.AxisFault f = createAxisFault(e);
			if (e.getFaultMessage() != null) {
				f.setDetail(toOM(e.getFaultMessage(), false));
			}
			throw f;
		} catch (NotifyFaultException e) {

			msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME, "error");
			org.apache.axis2.AxisFault f = createAxisFault(e);
			if (e.getFaultMessage() != null) {
				f.setDetail(toOM(e.getFaultMessage(), false));
			}
			throw f;
		}

		catch (java.lang.Exception e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	//
	private org.apache.axiom.om.OMElement toOM(com.medicare.types.PersonE param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(com.medicare.types.PersonE.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(com.medicare.types.PatientE param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(com.medicare.types.PatientE.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(com.medicare.types.Error param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(com.medicare.types.Error.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(com.medicare.services.patient.Notify param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(com.medicare.services.patient.Notify.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(com.medicare.types.Patients param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(com.medicare.types.Patients.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			com.medicare.types.PatientE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

			emptyEnvelope.getBody().addChild(param.getOMElement(com.medicare.types.PatientE.MY_QNAME, factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.medicare.types.PatientE wrapRegister() {
		com.medicare.types.PatientE wrappedElement = new com.medicare.types.PatientE();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			com.medicare.types.Patients param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

			emptyEnvelope.getBody().addChild(param.getOMElement(com.medicare.types.Patients.MY_QNAME, factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.medicare.types.Patients wrapGetAll() {
		com.medicare.types.Patients wrappedElement = new com.medicare.types.Patients();
		return wrappedElement;
	}

	/**
	 * get the default envelope
	 */
	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory) {
		return factory.getDefaultEnvelope();
	}

	private java.lang.Object fromOM(org.apache.axiom.om.OMElement param, java.lang.Class type,
			java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault {

		try {

			if (com.medicare.services.patient.Notify.class.equals(type)) {

				return com.medicare.services.patient.Notify.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.medicare.types.Error.class.equals(type)) {

				return com.medicare.types.Error.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.medicare.types.PatientE.class.equals(type)) {

				return com.medicare.types.PatientE.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.medicare.types.Patients.class.equals(type)) {

				return com.medicare.types.Patients.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.medicare.types.PersonE.class.equals(type)) {

				return com.medicare.types.PersonE.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

		} catch (java.lang.Exception e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
		return null;
	}

	/**
	 * A utility method that copies the namepaces from the SOAPEnvelope
	 */
	private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env) {
		java.util.Map returnMap = new java.util.HashMap();
		java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
		while (namespaceIterator.hasNext()) {
			org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
			returnMap.put(ns.getPrefix(), ns.getNamespaceURI());
		}
		return returnMap;
	}

	private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
		org.apache.axis2.AxisFault f;
		Throwable cause = e.getCause();
		if (cause != null) {
			f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
		} else {
			f = new org.apache.axis2.AxisFault(e.getMessage());
		}

		return f;
	}

}// end of class
