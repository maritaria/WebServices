
/**
 * DoctorServiceMessageReceiverInOnly.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package hospital.doctor;

/**
 * DoctorServiceMessageReceiverInOnly message receiver
 */

public class DoctorServiceMessageReceiverInOnly extends org.apache.axis2.receivers.AbstractInMessageReceiver {

	public void invokeBusinessLogic(org.apache.axis2.context.MessageContext inMessage)
			throws org.apache.axis2.AxisFault {

		try {

			// get the implementation class for the Web Service
			Object obj = getTheImplementationObject(inMessage);

			DoctorServiceSkeletonInterface skel = (DoctorServiceSkeletonInterface) obj;
			// Out Envelop
			org.apache.axiom.soap.SOAPEnvelope envelope = null;
			// Find the axisOperation that has been set by the Dispatch phase.
			org.apache.axis2.description.AxisOperation op = inMessage.getOperationContext().getAxisOperation();
			if (op == null) {
				throw new org.apache.axis2.AxisFault(
						"Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
			}

			java.lang.String methodName;
			if ((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils
					.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)) {

				if ("notify".equals(methodName)) {

					hospital.schema.NotificationRequest wrappedParam = (hospital.schema.NotificationRequest) fromOM(
							inMessage.getEnvelope().getBody().getFirstElement(),
							hospital.schema.NotificationRequest.class, getEnvelopeNamespaces(inMessage.getEnvelope()));

					skel.notify(wrappedParam);
				} else if ("notifyReschedule".equals(methodName)) {

					hospital.schema.AgendaCallback wrappedParam = (hospital.schema.AgendaCallback) fromOM(
							inMessage.getEnvelope().getBody().getFirstElement(), hospital.schema.AgendaCallback.class,
							getEnvelopeNamespaces(inMessage.getEnvelope()));

					skel.notifyReschedule(wrappedParam);

				} else {
					throw new java.lang.RuntimeException("method not found");
				}

			}
		} catch (java.lang.Exception e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	//
	private org.apache.axiom.om.OMElement toOM(hospital.schema.NotificationRequest param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(hospital.schema.NotificationRequest.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(hospital.schema.AgendaCallback param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(hospital.schema.AgendaCallback.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(hospital.schema.Skills param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(hospital.schema.Skills.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(hospital.schema.DoctorIDs param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(hospital.schema.DoctorIDs.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			hospital.schema.DoctorIDs param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

			emptyEnvelope.getBody().addChild(param.getOMElement(hospital.schema.DoctorIDs.MY_QNAME, factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private hospital.schema.DoctorIDs wrapfindDoctor() {
		hospital.schema.DoctorIDs wrappedElement = new hospital.schema.DoctorIDs();
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

			if (hospital.schema.AgendaCallback.class.equals(type)) {

				return hospital.schema.AgendaCallback.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (hospital.schema.DoctorIDs.class.equals(type)) {

				return hospital.schema.DoctorIDs.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (hospital.schema.NotificationRequest.class.equals(type)) {

				return hospital.schema.NotificationRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (hospital.schema.Skills.class.equals(type)) {

				return hospital.schema.Skills.Factory.parse(param.getXMLStreamReaderWithoutCaching());

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

}// end of class
