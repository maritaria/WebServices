
/**
 * RoomServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package com.medicare.services.room;

/**
 * RoomServiceMessageReceiverInOut message receiver
 */

public class RoomServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver {

	public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext,
			org.apache.axis2.context.MessageContext newMsgContext) throws org.apache.axis2.AxisFault {

		try {

			// get the implementation class for the Web Service
			Object obj = getTheImplementationObject(msgContext);

			RoomServiceSkeletonInterface skel = (RoomServiceSkeletonInterface) obj;
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

				if ("getAll".equals(methodName)) {

					com.medicare.services.room.RoomArrayResponse roomArrayResponse30 = null;
					roomArrayResponse30 =

							skel.getAll();

					envelope = toEnvelope(getSOAPFactory(msgContext), roomArrayResponse30, false,
							new javax.xml.namespace.QName("http://medicare.com/Services/Room", "getAll"));
				} else

				if ("init".equals(methodName)) {

					com.medicare.services.room.RoomArrayResponse roomArrayResponse32 = null;
					roomArrayResponse32 =

							skel.init();

					envelope = toEnvelope(getSOAPFactory(msgContext), roomArrayResponse32, false,
							new javax.xml.namespace.QName("http://medicare.com/Services/Room", "init"));
				} else

				if ("reservate".equals(methodName)) {

					com.medicare.services.room.Reservate wrappedParam = (com.medicare.services.room.Reservate) fromOM(
							msgContext.getEnvelope().getBody().getFirstElement(),
							com.medicare.services.room.Reservate.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					skel.reservate(wrappedParam);

					envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
				} else

				if ("find".equals(methodName)) {

					com.medicare.services.room.RoomArrayResponse roomArrayResponse36 = null;
					com.medicare.services.room.FindFilter wrappedParam = (com.medicare.services.room.FindFilter) fromOM(
							msgContext.getEnvelope().getBody().getFirstElement(),
							com.medicare.services.room.FindFilter.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					roomArrayResponse36 =

							skel.find(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext), roomArrayResponse36, false,
							new javax.xml.namespace.QName("http://medicare.com/Services/Room", "find"));

				} else {
					throw new java.lang.RuntimeException("method not found");
				}

				newMsgContext.setEnvelope(envelope);
			}
		} catch (java.lang.Exception e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	//
	private org.apache.axiom.om.OMElement toOM(com.medicare.services.room.RoomArrayResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(com.medicare.services.room.RoomArrayResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(com.medicare.services.room.Reservate param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(com.medicare.services.room.Reservate.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(com.medicare.services.room.FindFilter param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(com.medicare.services.room.FindFilter.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			com.medicare.services.room.RoomArrayResponse param, boolean optimizeContent,
			javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

			emptyEnvelope.getBody()
					.addChild(param.getOMElement(com.medicare.services.room.RoomArrayResponse.MY_QNAME, factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.medicare.services.room.RoomArrayResponse wrapGetAll() {
		com.medicare.services.room.RoomArrayResponse wrappedElement = new com.medicare.services.room.RoomArrayResponse();
		return wrappedElement;
	}

	private com.medicare.services.room.RoomArrayResponse wrapInit() {
		com.medicare.services.room.RoomArrayResponse wrappedElement = new com.medicare.services.room.RoomArrayResponse();
		return wrappedElement;
	}

	private com.medicare.services.room.RoomArrayResponse wrapFind() {
		com.medicare.services.room.RoomArrayResponse wrappedElement = new com.medicare.services.room.RoomArrayResponse();
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

			if (com.medicare.services.room.FindFilter.class.equals(type)) {

				return com.medicare.services.room.FindFilter.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.medicare.services.room.Reservate.class.equals(type)) {

				return com.medicare.services.room.Reservate.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.medicare.services.room.RoomArrayResponse.class.equals(type)) {

				return com.medicare.services.room.RoomArrayResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

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
