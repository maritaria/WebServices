
/**
 * DoctorServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package com.medicare.services.doctor;

/**
 * DoctorServiceMessageReceiverInOut message receiver
 */

public class DoctorServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver {

	public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext,
			org.apache.axis2.context.MessageContext newMsgContext) throws org.apache.axis2.AxisFault {

		try {

			// get the implementation class for the Web Service
			Object obj = getTheImplementationObject(msgContext);

			DoctorServiceSkeletonInterface skel = (DoctorServiceSkeletonInterface) obj;
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

				if ("find".equals(methodName)) {

					com.medicare.services.doctor.DoctorArrayResponse doctorArrayResponse36 = null;
					com.medicare.services.doctor.FindFilter wrappedParam = (com.medicare.services.doctor.FindFilter) fromOM(
							msgContext.getEnvelope().getBody().getFirstElement(),
							com.medicare.services.doctor.FindFilter.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					doctorArrayResponse36 =

							skel.find(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext), doctorArrayResponse36, false,
							new javax.xml.namespace.QName("http://medicare.com/Services/Doctor", "find"));
				} else

				if ("getAll".equals(methodName)) {

					com.medicare.services.doctor.DoctorArrayResponse doctorArrayResponse38 = null;
					doctorArrayResponse38 =

							skel.getAll();

					envelope = toEnvelope(getSOAPFactory(msgContext), doctorArrayResponse38, false,
							new javax.xml.namespace.QName("http://medicare.com/Services/Doctor", "getAll"));
				} else

				if ("get".equals(methodName)) {

					com.medicare.types.DoctorE doctor40 = null;
					com.medicare.services.doctor.DoctorId wrappedParam = (com.medicare.services.doctor.DoctorId) fromOM(
							msgContext.getEnvelope().getBody().getFirstElement(),
							com.medicare.services.doctor.DoctorId.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					doctor40 =

							skel.get(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext), doctor40, false,
							new javax.xml.namespace.QName("http://medicare.com/Services/Doctor", "get"));
				} else

				if ("register".equals(methodName)) {

					com.medicare.types.DoctorE doctor42 = null;
					com.medicare.types.DoctorE wrappedParam = (com.medicare.types.DoctorE) fromOM(
							msgContext.getEnvelope().getBody().getFirstElement(), com.medicare.types.DoctorE.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					doctor42 =

							skel.register(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext), doctor42, false,
							new javax.xml.namespace.QName("http://medicare.com/Services/Doctor", "register"));
				} else

				if ("notify".equals(methodName)) {

					com.medicare.services.doctor.Notify wrappedParam = (com.medicare.services.doctor.Notify) fromOM(
							msgContext.getEnvelope().getBody().getFirstElement(),
							com.medicare.services.doctor.Notify.class, getEnvelopeNamespaces(msgContext.getEnvelope()));

					skel.notify(wrappedParam);

					envelope = getSOAPFactory(msgContext).getDefaultEnvelope();

				} else {
					throw new java.lang.RuntimeException("method not found");
				}

				newMsgContext.setEnvelope(envelope);
			}
		} catch (RegisterFaultException e) {

			msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME, "error");
			org.apache.axis2.AxisFault f = createAxisFault(e);
			if (e.getFaultMessage() != null) {
				f.setDetail(toOM(e.getFaultMessage(), false));
			}
			throw f;
		} catch (FindFaultException e) {

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
		} catch (GetAllFaultException e) {

			msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME, "error");
			org.apache.axis2.AxisFault f = createAxisFault(e);
			if (e.getFaultMessage() != null) {
				f.setDetail(toOM(e.getFaultMessage(), false));
			}
			throw f;
		} catch (GetFaultException e) {

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
	private org.apache.axiom.om.OMElement toOM(com.medicare.services.doctor.FindFilter param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(com.medicare.services.doctor.FindFilter.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(com.medicare.services.doctor.DoctorArrayResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(com.medicare.services.doctor.DoctorArrayResponse.MY_QNAME,
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

	private org.apache.axiom.om.OMElement toOM(com.medicare.services.doctor.DoctorId param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(com.medicare.services.doctor.DoctorId.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(com.medicare.types.DoctorE param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(com.medicare.types.DoctorE.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(com.medicare.services.doctor.Notify param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(com.medicare.services.doctor.Notify.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			com.medicare.services.doctor.DoctorArrayResponse param, boolean optimizeContent,
			javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

			emptyEnvelope.getBody()
					.addChild(param.getOMElement(com.medicare.services.doctor.DoctorArrayResponse.MY_QNAME, factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.medicare.services.doctor.DoctorArrayResponse wrapFind() {
		com.medicare.services.doctor.DoctorArrayResponse wrappedElement = new com.medicare.services.doctor.DoctorArrayResponse();
		return wrappedElement;
	}

	private com.medicare.services.doctor.DoctorArrayResponse wrapGetAll() {
		com.medicare.services.doctor.DoctorArrayResponse wrappedElement = new com.medicare.services.doctor.DoctorArrayResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			com.medicare.types.DoctorE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

			emptyEnvelope.getBody().addChild(param.getOMElement(com.medicare.types.DoctorE.MY_QNAME, factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.medicare.types.DoctorE wrapGet() {
		com.medicare.types.DoctorE wrappedElement = new com.medicare.types.DoctorE();
		return wrappedElement;
	}

	private com.medicare.types.DoctorE wrapRegister() {
		com.medicare.types.DoctorE wrappedElement = new com.medicare.types.DoctorE();
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

			if (com.medicare.services.doctor.DoctorArrayResponse.class.equals(type)) {

				return com.medicare.services.doctor.DoctorArrayResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.medicare.services.doctor.DoctorId.class.equals(type)) {

				return com.medicare.services.doctor.DoctorId.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.medicare.services.doctor.FindFilter.class.equals(type)) {

				return com.medicare.services.doctor.FindFilter.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.medicare.services.doctor.Notify.class.equals(type)) {

				return com.medicare.services.doctor.Notify.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.medicare.types.DoctorE.class.equals(type)) {

				return com.medicare.types.DoctorE.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.medicare.types.Error.class.equals(type)) {

				return com.medicare.types.Error.Factory.parse(param.getXMLStreamReaderWithoutCaching());

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
