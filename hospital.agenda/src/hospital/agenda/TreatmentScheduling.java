
/**
 * TreatmentScheduling.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:04:10 GMT)
 */

package hospital.agenda;

/**
 * TreatmentScheduling bean class
 */
@SuppressWarnings({ "unchecked", "unused" })

public class TreatmentScheduling implements org.apache.axis2.databinding.ADBBean {

	public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://hospital/agenda/",
			"TreatmentScheduling", "ns3");

	/**
	 * field for Duration
	 */

	protected org.apache.axis2.databinding.types.Duration localDuration;

	public TreatmentScheduling() {
	}
	
	public TreatmentScheduling(TreatmentPlan treatmentPlan) {
		setDoctorID(treatmentPlan.getDoctorID());
		setDuration(treatmentPlan.getDuration());
		setPatientID(treatmentPlan.getPatientID());
		setRoomID(treatmentPlan.getRoomID());
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return org.apache.axis2.databinding.types.Duration
	 */
	public org.apache.axis2.databinding.types.Duration getDuration() {
		return localDuration;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Duration
	 */
	public void setDuration(org.apache.axis2.databinding.types.Duration param) {

		this.localDuration = param;

	}

	/**
	 * field for DoctorID
	 */

	protected java.lang.String localDoctorID;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDoctorID() {
		return localDoctorID;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            DoctorID
	 */
	public void setDoctorID(java.lang.String param) {

		this.localDoctorID = param;

	}

	/**
	 * field for PatientID
	 */

	protected java.lang.String localPatientID;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getPatientID() {
		return localPatientID;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            PatientID
	 */
	public void setPatientID(java.lang.String param) {

		this.localPatientID = param;

	}

	/**
	 * field for RoomID
	 */

	protected java.lang.String localRoomID;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getRoomID() {
		return localRoomID;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            RoomID
	 */
	public void setRoomID(java.lang.String param) {

		this.localRoomID = param;

	}

	/**
	 * field for When
	 */

	protected java.util.Calendar localWhen;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.util.Calendar
	 */
	public java.util.Calendar getWhen() {
		return localWhen;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            When
	 */
	public void setWhen(java.util.Calendar param) {

		this.localWhen = param;

	}

	/**
	 * field for WhenOriginally
	 */

	protected java.util.Calendar localWhenOriginally;

	/*
	 * This tracker boolean wil be used to detect whether the user called the set
	 * method for this attribute. It will be used to determine whether to include
	 * this field in the serialized XML
	 */
	protected boolean localWhenOriginallyTracker = false;

	public boolean isWhenOriginallySpecified() {
		return localWhenOriginallyTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.util.Calendar
	 */
	public java.util.Calendar getWhenOriginally() {
		return localWhenOriginally;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            WhenOriginally
	 */
	public void setWhenOriginally(java.util.Calendar param) {
		localWhenOriginallyTracker = param != null;

		this.localWhenOriginally = param;

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

			java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://hospital/agenda/");
			if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
						namespacePrefix + ":TreatmentScheduling", xmlWriter);
			} else {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "TreatmentScheduling",
						xmlWriter);
			}

		}

		namespace = "";
		writeStartElement(null, namespace, "Duration", xmlWriter);

		if (localDuration == null) {
			// write the nil attribute

			throw new org.apache.axis2.databinding.ADBException("Duration cannot be null!!");

		} else {

			xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDuration));

		}

		xmlWriter.writeEndElement();

		namespace = "http://hospital/agenda/";
		writeStartElement(null, namespace, "DoctorID", xmlWriter);

		if (localDoctorID == null) {
			// write the nil attribute

			throw new org.apache.axis2.databinding.ADBException("DoctorID cannot be null!!");

		} else {

			xmlWriter.writeCharacters(localDoctorID);

		}

		xmlWriter.writeEndElement();

		namespace = "http://hospital/agenda/";
		writeStartElement(null, namespace, "PatientID", xmlWriter);

		if (localPatientID == null) {
			// write the nil attribute

			throw new org.apache.axis2.databinding.ADBException("PatientID cannot be null!!");

		} else {

			xmlWriter.writeCharacters(localPatientID);

		}

		xmlWriter.writeEndElement();

		namespace = "http://hospital/agenda/";
		writeStartElement(null, namespace, "RoomID", xmlWriter);

		if (localRoomID == null) {
			// write the nil attribute

			throw new org.apache.axis2.databinding.ADBException("RoomID cannot be null!!");

		} else {

			xmlWriter.writeCharacters(localRoomID);

		}

		xmlWriter.writeEndElement();

		namespace = "";
		writeStartElement(null, namespace, "When", xmlWriter);

		if (localWhen == null) {
			// write the nil attribute

			throw new org.apache.axis2.databinding.ADBException("When cannot be null!!");

		} else {

			xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWhen));

		}

		xmlWriter.writeEndElement();
		if (localWhenOriginallyTracker) {
			namespace = "";
			writeStartElement(null, namespace, "WhenOriginally", xmlWriter);

			if (localWhenOriginally == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException("WhenOriginally cannot be null!!");

			} else {

				xmlWriter.writeCharacters(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWhenOriginally));

			}

			xmlWriter.writeEndElement();
		}
		xmlWriter.writeEndElement();

	}

	private static java.lang.String generatePrefix(java.lang.String namespace) {
		if (namespace.equals("http://hospital/agenda/")) {
			return "ns3";
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

		elementList.add(new javax.xml.namespace.QName("", "Duration"));

		if (localDuration != null) {
			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDuration));
		} else {
			throw new org.apache.axis2.databinding.ADBException("Duration cannot be null!!");
		}

		elementList.add(new javax.xml.namespace.QName("http://hospital/agenda/", "DoctorID"));

		if (localDoctorID != null) {
			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDoctorID));
		} else {
			throw new org.apache.axis2.databinding.ADBException("DoctorID cannot be null!!");
		}

		elementList.add(new javax.xml.namespace.QName("http://hospital/agenda/", "PatientID"));

		if (localPatientID != null) {
			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPatientID));
		} else {
			throw new org.apache.axis2.databinding.ADBException("PatientID cannot be null!!");
		}

		elementList.add(new javax.xml.namespace.QName("http://hospital/agenda/", "RoomID"));

		if (localRoomID != null) {
			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomID));
		} else {
			throw new org.apache.axis2.databinding.ADBException("RoomID cannot be null!!");
		}

		elementList.add(new javax.xml.namespace.QName("", "When"));

		if (localWhen != null) {
			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWhen));
		} else {
			throw new org.apache.axis2.databinding.ADBException("When cannot be null!!");
		}
		if (localWhenOriginallyTracker) {
			elementList.add(new javax.xml.namespace.QName("", "WhenOriginally"));

			if (localWhenOriginally != null) {
				elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWhenOriginally));
			} else {
				throw new org.apache.axis2.databinding.ADBException("WhenOriginally cannot be null!!");
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
		public static TreatmentScheduling parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
			TreatmentScheduling object = new TreatmentScheduling();

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

						if (!"TreatmentScheduling".equals(type)) {
							// find namespace for the prefix
							java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
							return (TreatmentScheduling) hospital.agenda.ExtensionMapper.getTypeObject(nsUri, type,
									reader);
						}

					}

				}

				// Note all attributes that were handled. Used to differ normal attributes
				// from anyAttributes.
				java.util.Vector handledAttributes = new java.util.Vector();

				reader.next();

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("", "Duration").equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "Duration" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setDuration(org.apache.axis2.databinding.utils.ConverterUtil.convertToDuration(content));

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid parameter was
					// passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("http://hospital/agenda/", "DoctorID")
						.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "DoctorID" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setDoctorID(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid parameter was
					// passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("http://hospital/agenda/", "PatientID")
						.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "PatientID" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setPatientID(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid parameter was
					// passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("http://hospital/agenda/", "RoomID")
						.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "RoomID" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setRoomID(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid parameter was
					// passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("", "When").equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "When" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setWhen(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

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
						&& new javax.xml.namespace.QName("", "WhenOriginally").equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "WhenOriginally" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setWhenOriginally(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

					reader.next();

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
