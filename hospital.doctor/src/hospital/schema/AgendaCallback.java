
/**
 * AgendaCallback.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:04:10 GMT)
 */

package hospital.schema;

/**
 * AgendaCallback bean class
 */
@SuppressWarnings({ "unchecked", "unused" })

public class AgendaCallback implements org.apache.axis2.databinding.ADBBean {

	public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://hospital/schema/",
			"AgendaCallback", "ns1");

	/**
	 * field for ScheduleInfo
	 */

	protected hospital.schema.ScheduleInfo_type0 localScheduleInfo;

	/**
	 * Auto generated getter method
	 * 
	 * @return hospital.schema.ScheduleInfo_type0
	 */
	public hospital.schema.ScheduleInfo_type0 getScheduleInfo() {
		return localScheduleInfo;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ScheduleInfo
	 */
	public void setScheduleInfo(hospital.schema.ScheduleInfo_type0 param) {

		this.localScheduleInfo = param;

	}

	/**
	 * field for RescheduledTreatment This was an Array!
	 */

	protected hospital.schema.RescheduledTreatment_type0[] localRescheduledTreatment;

	/*
	 * This tracker boolean wil be used to detect whether the user called the set
	 * method for this attribute. It will be used to determine whether to include
	 * this field in the serialized XML
	 */
	protected boolean localRescheduledTreatmentTracker = false;

	public boolean isRescheduledTreatmentSpecified() {
		return localRescheduledTreatmentTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return hospital.schema.RescheduledTreatment_type0[]
	 */
	public hospital.schema.RescheduledTreatment_type0[] getRescheduledTreatment() {
		return localRescheduledTreatment;
	}

	/**
	 * validate the array for RescheduledTreatment
	 */
	protected void validateRescheduledTreatment(hospital.schema.RescheduledTreatment_type0[] param) {

	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            RescheduledTreatment
	 */
	public void setRescheduledTreatment(hospital.schema.RescheduledTreatment_type0[] param) {

		validateRescheduledTreatment(param);

		localRescheduledTreatmentTracker = param != null;

		this.localRescheduledTreatment = param;
	}

	/**
	 * Auto generated add method for the array for convenience
	 * 
	 * @param param
	 *            hospital.schema.RescheduledTreatment_type0
	 */
	public void addRescheduledTreatment(hospital.schema.RescheduledTreatment_type0 param) {
		if (localRescheduledTreatment == null) {
			localRescheduledTreatment = new hospital.schema.RescheduledTreatment_type0[] {};
		}

		// update the setting tracker
		localRescheduledTreatmentTracker = true;

		java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localRescheduledTreatment);
		list.add(param);
		this.localRescheduledTreatment = (hospital.schema.RescheduledTreatment_type0[]) list
				.toArray(new hospital.schema.RescheduledTreatment_type0[list.size()]);

	}

	/**
	 *
	 * @param parentQName
	 * @param factory
	 * @return org.apache.axiom.om.OMElement
	 */
	public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
			final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

		org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
		return factory.createOMElement(dataSource, MY_QNAME);

	}

	public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
		serialize(parentQName, xmlWriter, false);
	}

	public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
			boolean serializeType)
			throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

		java.lang.String prefix = null;
		java.lang.String namespace = null;

		prefix = parentQName.getPrefix();
		namespace = parentQName.getNamespaceURI();
		writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

		if (serializeType) {

			java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://hospital/schema/");
			if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
						namespacePrefix + ":AgendaCallback", xmlWriter);
			} else {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "AgendaCallback", xmlWriter);
			}

		}

		if (localScheduleInfo == null) {
			throw new org.apache.axis2.databinding.ADBException("ScheduleInfo cannot be null!!");
		}
		localScheduleInfo.serialize(new javax.xml.namespace.QName("", "ScheduleInfo"), xmlWriter);
		if (localRescheduledTreatmentTracker) {
			if (localRescheduledTreatment != null) {
				for (int i = 0; i < localRescheduledTreatment.length; i++) {
					if (localRescheduledTreatment[i] != null) {
						localRescheduledTreatment[i]
								.serialize(new javax.xml.namespace.QName("", "RescheduledTreatment"), xmlWriter);
					} else {

						// we don't have to do any thing since minOccures is zero

					}

				}
			} else {

				throw new org.apache.axis2.databinding.ADBException("RescheduledTreatment cannot be null!!");

			}
		}
		xmlWriter.writeEndElement();

	}

	private static java.lang.String generatePrefix(java.lang.String namespace) {
		if (namespace.equals("http://hospital/schema/")) {
			return "ns1";
		}
		return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
	}

	/**
	 * Utility method to write an element start tag.
	 */
	private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
			javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
		java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
		if (writerPrefix != null) {
			xmlWriter.writeStartElement(namespace, localPart);
		} else {
			if (namespace.length() == 0) {
				prefix = "";
			} else if (prefix == null) {
				prefix = generatePrefix(namespace);
			}

			xmlWriter.writeStartElement(prefix, localPart, namespace);
			xmlWriter.writeNamespace(prefix, namespace);
			xmlWriter.setPrefix(prefix, namespace);
		}
	}

	/**
	 * Util method to write an attribute with the ns prefix
	 */
	private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
			java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
		if (xmlWriter.getPrefix(namespace) == null) {
			xmlWriter.writeNamespace(prefix, namespace);
			xmlWriter.setPrefix(prefix, namespace);
		}
		xmlWriter.writeAttribute(namespace, attName, attValue);
	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
			javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
		if (namespace.equals("")) {
			xmlWriter.writeAttribute(attName, attValue);
		} else {
			registerPrefix(xmlWriter, namespace);
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}
	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
			javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {

		java.lang.String attributeNamespace = qname.getNamespaceURI();
		java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
		if (attributePrefix == null) {
			attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
		}
		java.lang.String attributeValue;
		if (attributePrefix.trim().length() > 0) {
			attributeValue = attributePrefix + ":" + qname.getLocalPart();
		} else {
			attributeValue = qname.getLocalPart();
		}

		if (namespace.equals("")) {
			xmlWriter.writeAttribute(attName, attributeValue);
		} else {
			registerPrefix(xmlWriter, namespace);
			xmlWriter.writeAttribute(namespace, attName, attributeValue);
		}
	}

	/**
	 * method to handle Qnames
	 */

	private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
		java.lang.String namespaceURI = qname.getNamespaceURI();
		if (namespaceURI != null) {
			java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
			if (prefix == null) {
				prefix = generatePrefix(namespaceURI);
				xmlWriter.writeNamespace(prefix, namespaceURI);
				xmlWriter.setPrefix(prefix, namespaceURI);
			}

			if (prefix.trim().length() > 0) {
				xmlWriter.writeCharacters(
						prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			} else {
				// i.e this is the default namespace
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}

		} else {
			xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
		}
	}

	private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {

		if (qnames != null) {
			// we have to store this data until last moment since it is not possible to
			// write any
			// namespace data after writing the charactor data
			java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
			java.lang.String namespaceURI = null;
			java.lang.String prefix = null;

			for (int i = 0; i < qnames.length; i++) {
				if (i > 0) {
					stringToWrite.append(" ");
				}
				namespaceURI = qnames[i].getNamespaceURI();
				if (namespaceURI != null) {
					prefix = xmlWriter.getPrefix(namespaceURI);
					if ((prefix == null) || (prefix.length() == 0)) {
						prefix = generatePrefix(namespaceURI);
						xmlWriter.writeNamespace(prefix, namespaceURI);
						xmlWriter.setPrefix(prefix, namespaceURI);
					}

					if (prefix.trim().length() > 0) {
						stringToWrite.append(prefix).append(":")
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				} else {
					stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
				}
			}
			xmlWriter.writeCharacters(stringToWrite.toString());
		}

	}

	/**
	 * Register a namespace prefix
	 */
	private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
			throws javax.xml.stream.XMLStreamException {
		java.lang.String prefix = xmlWriter.getPrefix(namespace);
		if (prefix == null) {
			prefix = generatePrefix(namespace);
			javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
			while (true) {
				java.lang.String uri = nsContext.getNamespaceURI(prefix);
				if (uri == null || uri.length() == 0) {
					break;
				}
				prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
			}
			xmlWriter.writeNamespace(prefix, namespace);
			xmlWriter.setPrefix(prefix, namespace);
		}
		return prefix;
	}

	/**
	 * databinding method to get an XML representation of this object
	 *
	 */
	public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
			throws org.apache.axis2.databinding.ADBException {

		java.util.ArrayList elementList = new java.util.ArrayList();
		java.util.ArrayList attribList = new java.util.ArrayList();

		elementList.add(new javax.xml.namespace.QName("", "ScheduleInfo"));

		if (localScheduleInfo == null) {
			throw new org.apache.axis2.databinding.ADBException("ScheduleInfo cannot be null!!");
		}
		elementList.add(localScheduleInfo);
		if (localRescheduledTreatmentTracker) {
			if (localRescheduledTreatment != null) {
				for (int i = 0; i < localRescheduledTreatment.length; i++) {

					if (localRescheduledTreatment[i] != null) {
						elementList.add(new javax.xml.namespace.QName("", "RescheduledTreatment"));
						elementList.add(localRescheduledTreatment[i]);
					} else {

						// nothing to do

					}

				}
			} else {

				throw new org.apache.axis2.databinding.ADBException("RescheduledTreatment cannot be null!!");

			}

		}

		return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
				attribList.toArray());

	}

	/**
	 * Factory class that keeps the parse method
	 */
	public static class Factory {

		/**
		 * static method to create the object Precondition: If this object is an
		 * element, the current or next start element starts this object and any
		 * intervening reader events are ignorable If this object is not an element, it
		 * is a complex type and the reader is at the event just after the outer start
		 * element Postcondition: If this object is an element, the reader is positioned
		 * at its end element If this object is a complex type, the reader is positioned
		 * at the end element of its outer element
		 */
		public static AgendaCallback parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
			AgendaCallback object = new AgendaCallback();

			int event;
			java.lang.String nillableValue = null;
			java.lang.String prefix = "";
			java.lang.String namespaceuri = "";
			try {

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
					java.lang.String fullTypeName = reader
							.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
					if (fullTypeName != null) {
						java.lang.String nsPrefix = null;
						if (fullTypeName.indexOf(":") > -1) {
							nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
						}
						nsPrefix = nsPrefix == null ? "" : nsPrefix;

						java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

						if (!"AgendaCallback".equals(type)) {
							// find namespace for the prefix
							java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
							return (AgendaCallback) hospital.doctor.ExtensionMapper.getTypeObject(nsUri, type, reader);
						}

					}

				}

				// Note all attributes that were handled. Used to differ normal attributes
				// from anyAttributes.
				java.util.Vector handledAttributes = new java.util.Vector();

				reader.next();

				java.util.ArrayList list2 = new java.util.ArrayList();

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("", "ScheduleInfo").equals(reader.getName())) {

					object.setScheduleInfo(hospital.schema.ScheduleInfo_type0.Factory.parse(reader));

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid parameter was
					// passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("", "RescheduledTreatment").equals(reader.getName())) {

					// Process the array and step past its final element's end.
					list2.add(hospital.schema.RescheduledTreatment_type0.Factory.parse(reader));

					// loop until we find a start element that is not part of this array
					boolean loopDone2 = false;
					while (!loopDone2) {
						// We should be at the end element, but make sure
						while (!reader.isEndElement())
							reader.next();
						// Step out of this element
						reader.next();
						// Step to next element event.
						while (!reader.isStartElement() && !reader.isEndElement())
							reader.next();
						if (reader.isEndElement()) {
							// two continuous end elements means we are exiting the xml structure
							loopDone2 = true;
						} else {
							if (new javax.xml.namespace.QName("", "RescheduledTreatment").equals(reader.getName())) {
								list2.add(hospital.schema.RescheduledTreatment_type0.Factory.parse(reader));

							} else {
								loopDone2 = true;
							}
						}
					}
					// call the converter utility to convert and set the array

					object.setRescheduledTreatment(
							(hospital.schema.RescheduledTreatment_type0[]) org.apache.axis2.databinding.utils.ConverterUtil
									.convertToArray(hospital.schema.RescheduledTreatment_type0.class, list2));

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement())
					// A start element we are not expecting indicates a trailing invalid property
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());

			} catch (javax.xml.stream.XMLStreamException e) {
				throw new java.lang.Exception(e);
			}

			return object;
		}

	}// end of factory class

}
