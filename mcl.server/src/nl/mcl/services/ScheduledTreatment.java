
/**
 * ScheduledTreatment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:04:10 GMT)
 */

package nl.mcl.services;

/**
 * ScheduledTreatment bean class
 */
@SuppressWarnings({ "unchecked", "unused" })

public class ScheduledTreatment implements org.apache.axis2.databinding.ADBBean {
	/*
	 * This type was generated from the piece of schema that had name =
	 * ScheduledTreatment Namespace URI = http://services.mcl.nl/ Namespace Prefix =
	 * ns2
	 */

	/**
	 * field for Id
	 */

	protected java.lang.String localId;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getId() {
		return localId;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Id
	 */
	public void setId(java.lang.String param) {

		this.localId = param;

	}

	/**
	 * field for Personnel This was an Array!
	 */

	protected nl.mcl.services.Doctor[] localPersonnel;

	/**
	 * Auto generated getter method
	 * 
	 * @return nl.mcl.services.Doctor[]
	 */
	public nl.mcl.services.Doctor[] getPersonnel() {
		return localPersonnel;
	}

	/**
	 * validate the array for Personnel
	 */
	protected void validatePersonnel(nl.mcl.services.Doctor[] param) {

		if ((param != null) && (param.length < 1)) {
			throw new java.lang.RuntimeException("Input values do not follow defined XSD restrictions");
		}

	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Personnel
	 */
	public void setPersonnel(nl.mcl.services.Doctor[] param) {

		validatePersonnel(param);

		this.localPersonnel = param;
	}

	/**
	 * Auto generated add method for the array for convenience
	 * 
	 * @param param
	 *            nl.mcl.services.Doctor
	 */
	public void addPersonnel(nl.mcl.services.Doctor param) {
		if (localPersonnel == null) {
			localPersonnel = new nl.mcl.services.Doctor[] {};
		}

		java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localPersonnel);
		list.add(param);
		this.localPersonnel = (nl.mcl.services.Doctor[]) list.toArray(new nl.mcl.services.Doctor[list.size()]);

	}

	/**
	 * field for Room
	 */

	protected nl.mcl.services.Room localRoom;

	/**
	 * Auto generated getter method
	 * 
	 * @return nl.mcl.services.Room
	 */
	public nl.mcl.services.Room getRoom() {
		return localRoom;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Room
	 */
	public void setRoom(nl.mcl.services.Room param) {

		this.localRoom = param;

	}

	/**
	 * field for Timeslot
	 */

	protected nl.mcl.services.TimeSlot localTimeslot;

	/**
	 * Auto generated getter method
	 * 
	 * @return nl.mcl.services.TimeSlot
	 */
	public nl.mcl.services.TimeSlot getTimeslot() {
		return localTimeslot;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Timeslot
	 */
	public void setTimeslot(nl.mcl.services.TimeSlot param) {

		this.localTimeslot = param;

	}

	/**
	 * field for Treatment
	 */

	protected nl.mcl.services.Treatment localTreatment;

	/**
	 * Auto generated getter method
	 * 
	 * @return nl.mcl.services.Treatment
	 */
	public nl.mcl.services.Treatment getTreatment() {
		return localTreatment;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Treatment
	 */
	public void setTreatment(nl.mcl.services.Treatment param) {

		this.localTreatment = param;

	}

	/**
	 * field for Patients This was an Array!
	 */

	protected nl.mcl.services.Patient[] localPatients;

	/**
	 * Auto generated getter method
	 * 
	 * @return nl.mcl.services.Patient[]
	 */
	public nl.mcl.services.Patient[] getPatients() {
		return localPatients;
	}

	/**
	 * validate the array for Patients
	 */
	protected void validatePatients(nl.mcl.services.Patient[] param) {

		if ((param != null) && (param.length < 1)) {
			throw new java.lang.RuntimeException("Input values do not follow defined XSD restrictions");
		}

	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Patients
	 */
	public void setPatients(nl.mcl.services.Patient[] param) {

		validatePatients(param);

		this.localPatients = param;
	}

	/**
	 * Auto generated add method for the array for convenience
	 * 
	 * @param param
	 *            nl.mcl.services.Patient
	 */
	public void addPatients(nl.mcl.services.Patient param) {
		if (localPatients == null) {
			localPatients = new nl.mcl.services.Patient[] {};
		}

		java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localPatients);
		list.add(param);
		this.localPatients = (nl.mcl.services.Patient[]) list.toArray(new nl.mcl.services.Patient[list.size()]);

	}

	/**
	 *
	 * @param parentQName
	 * @param factory
	 * @return org.apache.axiom.om.OMElement
	 */
	public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
			final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

		org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, parentQName);
		return factory.createOMElement(dataSource, parentQName);

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

			java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://services.mcl.nl/");
			if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
						namespacePrefix + ":ScheduledTreatment", xmlWriter);
			} else {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "ScheduledTreatment",
						xmlWriter);
			}

		}

		namespace = "";
		writeStartElement(null, namespace, "id", xmlWriter);

		if (localId == null) {
			// write the nil attribute

			throw new org.apache.axis2.databinding.ADBException("id cannot be null!!");

		} else {

			xmlWriter.writeCharacters(localId);

		}

		xmlWriter.writeEndElement();

		if (localPersonnel != null) {
			for (int i = 0; i < localPersonnel.length; i++) {
				if (localPersonnel[i] != null) {
					localPersonnel[i].serialize(new javax.xml.namespace.QName("", "personnel"), xmlWriter);
				} else {

					throw new org.apache.axis2.databinding.ADBException("personnel cannot be null!!");

				}

			}
		} else {

			throw new org.apache.axis2.databinding.ADBException("personnel cannot be null!!");

		}

		if (localRoom == null) {
			throw new org.apache.axis2.databinding.ADBException("room cannot be null!!");
		}
		localRoom.serialize(new javax.xml.namespace.QName("", "room"), xmlWriter);

		if (localTimeslot == null) {
			throw new org.apache.axis2.databinding.ADBException("timeslot cannot be null!!");
		}
		localTimeslot.serialize(new javax.xml.namespace.QName("", "timeslot"), xmlWriter);

		if (localTreatment == null) {
			throw new org.apache.axis2.databinding.ADBException("treatment cannot be null!!");
		}
		localTreatment.serialize(new javax.xml.namespace.QName("", "treatment"), xmlWriter);

		if (localPatients != null) {
			for (int i = 0; i < localPatients.length; i++) {
				if (localPatients[i] != null) {
					localPatients[i].serialize(new javax.xml.namespace.QName("", "patients"), xmlWriter);
				} else {

					throw new org.apache.axis2.databinding.ADBException("patients cannot be null!!");

				}

			}
		} else {

			throw new org.apache.axis2.databinding.ADBException("patients cannot be null!!");

		}

		xmlWriter.writeEndElement();

	}

	private static java.lang.String generatePrefix(java.lang.String namespace) {
		if (namespace.equals("http://services.mcl.nl/")) {
			return "ns2";
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

		elementList.add(new javax.xml.namespace.QName("", "id"));

		if (localId != null) {
			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localId));
		} else {
			throw new org.apache.axis2.databinding.ADBException("id cannot be null!!");
		}

		if (localPersonnel != null) {
			for (int i = 0; i < localPersonnel.length; i++) {

				if (localPersonnel[i] != null) {
					elementList.add(new javax.xml.namespace.QName("", "personnel"));
					elementList.add(localPersonnel[i]);
				} else {

					throw new org.apache.axis2.databinding.ADBException("personnel cannot be null !!");

				}

			}
		} else {

			throw new org.apache.axis2.databinding.ADBException("personnel cannot be null!!");

		}

		elementList.add(new javax.xml.namespace.QName("", "room"));

		if (localRoom == null) {
			throw new org.apache.axis2.databinding.ADBException("room cannot be null!!");
		}
		elementList.add(localRoom);

		elementList.add(new javax.xml.namespace.QName("", "timeslot"));

		if (localTimeslot == null) {
			throw new org.apache.axis2.databinding.ADBException("timeslot cannot be null!!");
		}
		elementList.add(localTimeslot);

		elementList.add(new javax.xml.namespace.QName("", "treatment"));

		if (localTreatment == null) {
			throw new org.apache.axis2.databinding.ADBException("treatment cannot be null!!");
		}
		elementList.add(localTreatment);

		if (localPatients != null) {
			for (int i = 0; i < localPatients.length; i++) {

				if (localPatients[i] != null) {
					elementList.add(new javax.xml.namespace.QName("", "patients"));
					elementList.add(localPatients[i]);
				} else {

					throw new org.apache.axis2.databinding.ADBException("patients cannot be null !!");

				}

			}
		} else {

			throw new org.apache.axis2.databinding.ADBException("patients cannot be null!!");

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
		public static ScheduledTreatment parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
			ScheduledTreatment object = new ScheduledTreatment();

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

						if (!"ScheduledTreatment".equals(type)) {
							// find namespace for the prefix
							java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
							return (ScheduledTreatment) nl.mcl.services.ExtensionMapper.getTypeObject(nsUri, type,
									reader);
						}

					}

				}

				// Note all attributes that were handled. Used to differ normal attributes
				// from anyAttributes.
				java.util.Vector handledAttributes = new java.util.Vector();

				reader.next();

				java.util.ArrayList list2 = new java.util.ArrayList();

				java.util.ArrayList list6 = new java.util.ArrayList();

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("", "id").equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "id" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

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
						&& new javax.xml.namespace.QName("", "personnel").equals(reader.getName())) {

					// Process the array and step past its final element's end.
					list2.add(nl.mcl.services.Doctor.Factory.parse(reader));

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
							if (new javax.xml.namespace.QName("", "personnel").equals(reader.getName())) {
								list2.add(nl.mcl.services.Doctor.Factory.parse(reader));

							} else {
								loopDone2 = true;
							}
						}
					}
					// call the converter utility to convert and set the array

					object.setPersonnel((nl.mcl.services.Doctor[]) org.apache.axis2.databinding.utils.ConverterUtil
							.convertToArray(nl.mcl.services.Doctor.class, list2));

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid parameter was
					// passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("", "room").equals(reader.getName())) {

					object.setRoom(nl.mcl.services.Room.Factory.parse(reader));

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid parameter was
					// passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("", "timeslot").equals(reader.getName())) {

					object.setTimeslot(nl.mcl.services.TimeSlot.Factory.parse(reader));

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
						&& new javax.xml.namespace.QName("", "treatment").equals(reader.getName())) {

					object.setTreatment(nl.mcl.services.Treatment.Factory.parse(reader));

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid parameter was
					// passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("", "patients").equals(reader.getName())) {

					// Process the array and step past its final element's end.
					list6.add(nl.mcl.services.Patient.Factory.parse(reader));

					// loop until we find a start element that is not part of this array
					boolean loopDone6 = false;
					while (!loopDone6) {
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
							loopDone6 = true;
						} else {
							if (new javax.xml.namespace.QName("", "patients").equals(reader.getName())) {
								list6.add(nl.mcl.services.Patient.Factory.parse(reader));

							} else {
								loopDone6 = true;
							}
						}
					}
					// call the converter utility to convert and set the array

					object.setPatients((nl.mcl.services.Patient[]) org.apache.axis2.databinding.utils.ConverterUtil
							.convertToArray(nl.mcl.services.Patient.class, list6));

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid parameter was
					// passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
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
