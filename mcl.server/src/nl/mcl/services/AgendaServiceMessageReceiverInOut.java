
/**
 * AgendaServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package nl.mcl.services;

/**
 * AgendaServiceMessageReceiverInOut message receiver
 */

public class AgendaServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver {

	public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext,
			org.apache.axis2.context.MessageContext newMsgContext) throws org.apache.axis2.AxisFault {

		try {

			// get the implementation class for the Web Service
			Object obj = getTheImplementationObject(msgContext);

			AgendaServiceSkeletonInterface skel = (AgendaServiceSkeletonInterface) obj;
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

				if ("getFreeSlots".equals(methodName)) {

					nl.mcl.services.GetFreeSlotsResponse getFreeSlotsResponse13 = null;
					nl.mcl.services.GetFreeSlots wrappedParam = (nl.mcl.services.GetFreeSlots) fromOM(
							msgContext.getEnvelope().getBody().getFirstElement(), nl.mcl.services.GetFreeSlots.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					getFreeSlotsResponse13 =

							skel.getFreeSlots(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext), getFreeSlotsResponse13, false,
							new javax.xml.namespace.QName("http://services.mcl.nl/", "getFreeSlots"));
				} else

				if ("adjustAgenda".equals(methodName)) {

					nl.mcl.services.AdjustAgendaResponse adjustAgendaResponse15 = null;
					nl.mcl.services.AdjustAgenda wrappedParam = (nl.mcl.services.AdjustAgenda) fromOM(
							msgContext.getEnvelope().getBody().getFirstElement(), nl.mcl.services.AdjustAgenda.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					adjustAgendaResponse15 =

							skel.adjustAgenda(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext), adjustAgendaResponse15, false,
							new javax.xml.namespace.QName("http://services.mcl.nl/", "adjustAgenda"));

				} else {
					throw new java.lang.RuntimeException("method not found");
				}

				newMsgContext.setEnvelope(envelope);
			}
		} catch (AdjustAgendaFaultException e) {

			msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME, "AdjustAgendaFault");
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
	private org.apache.axiom.om.OMElement toOM(nl.mcl.services.GetFreeSlots param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(nl.mcl.services.GetFreeSlots.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(nl.mcl.services.GetFreeSlotsResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(nl.mcl.services.GetFreeSlotsResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(nl.mcl.services.AdjustAgenda param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(nl.mcl.services.AdjustAgenda.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(nl.mcl.services.AdjustAgendaResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(nl.mcl.services.AdjustAgendaResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(nl.mcl.services.AdjustAgendaFault param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(nl.mcl.services.AdjustAgendaFault.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			nl.mcl.services.GetFreeSlotsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

			emptyEnvelope.getBody()
					.addChild(param.getOMElement(nl.mcl.services.GetFreeSlotsResponse.MY_QNAME, factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private nl.mcl.services.GetFreeSlotsResponse wrapGetFreeSlots() {
		nl.mcl.services.GetFreeSlotsResponse wrappedElement = new nl.mcl.services.GetFreeSlotsResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			nl.mcl.services.AdjustAgendaResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

			emptyEnvelope.getBody()
					.addChild(param.getOMElement(nl.mcl.services.AdjustAgendaResponse.MY_QNAME, factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private nl.mcl.services.AdjustAgendaResponse wrapAdjustAgenda() {
		nl.mcl.services.AdjustAgendaResponse wrappedElement = new nl.mcl.services.AdjustAgendaResponse();
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

			if (nl.mcl.services.AdjustAgenda.class.equals(type)) {

				return nl.mcl.services.AdjustAgenda.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (nl.mcl.services.AdjustAgendaFault.class.equals(type)) {

				return nl.mcl.services.AdjustAgendaFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (nl.mcl.services.AdjustAgendaResponse.class.equals(type)) {

				return nl.mcl.services.AdjustAgendaResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (nl.mcl.services.GetFreeSlots.class.equals(type)) {

				return nl.mcl.services.GetFreeSlots.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (nl.mcl.services.GetFreeSlotsResponse.class.equals(type)) {

				return nl.mcl.services.GetFreeSlotsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

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
