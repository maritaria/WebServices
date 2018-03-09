
/**
 * ScheduleTreatment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:04:10 GMT)
 */

package nl.mcl.services;

/**
 * ScheduleTreatment bean class
 */
@SuppressWarnings({ "unchecked", "unused" })

public class ScheduleTreatment implements org.apache.axis2.databinding.ADBBean {

	public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://services.mcl.nl/",
			"ScheduleTreatment", "ns2");

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
	 * field for Doctors This was an Array!
	 */

	protected nl.mcl.services.Doctor[] localDoctors;

	/*
	 * This tracker boolean wil be used to detect whether the user called the set
	 * method for this attribute. It will be used to determine whether to include
	 * this field in the serialized XML
	 */
	protected boolean localDoctorsTracker = false;

	public boolean isDoctorsSpecified() {
		return localDoctorsTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return nl.mcl.services.Doctor[]
	 */
	public nl.mcl.services.Doctor[] getDoctors() {
		return localDoctors;
	}

	/**
	 * validate the array for Doctors
	 */
	protected void validateDoctors(nl.mcl.services.Doctor[] param) {

	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Doctors
	 */
	public void setDoctors(nl.mcl.services.Doctor[] param) {

		validateDoctors(param);

		localDoctorsTracker = param != null;

		this.localDoctors = param;
	}

	/**
	 * Auto generated add method for the array for convenience
	 * 
	 * @param param
	 *            nl.mcl.services.Doctor
	 */
	public void addDoctors(nl.mcl.services.Doctor param) {
		if (localDoctors == null) {
			localDoctors = new nl.mcl.services.Doctor[] {};
		}

		// update the setting tracker
		localDoctorsTracker = true;

		java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localDoctors);
		list.add(param);
		this.localDoctors = (nl.mcl.services.Doctor[]) list.toArray(new nl.mcl.services.Doctor[list.size()]);

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
	 * field for IsEmergency
	 */

	protected boolean localIsEmergency;

	/**
	 * Auto generated getter method
	 * 
	 * @return boolean
	 */
	public boolean getIsEmergency() {
		return localIsEmergency;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            IsEmergency
	 */
	public void setIsEmergency(boolean param) {

		this.localIsEmergency = param;

	}

	/**
	 * field for IsFixed
	 */

	protected boolean localIsFixed;

	/**
	 * Auto generated getter method
	 * 
	 * @return boolean
	 */
	public boolean getIsFixed() {
		return localIsFixed;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            IsFixed
	 */
	public void setIsFixed(boolean param) {

		this.localIsFixed = param;

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

			java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://services.mcl.nl/");
			if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
						namespacePrefix + ":ScheduleTreatment", xmlWriter);
			} else {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "ScheduleTreatment",
						xmlWriter);
			}

		}

		if (localTreatment == null) {
			throw new org.apache.axis2.databinding.ADBException("treatment cannot be null!!");
		}
		localTreatment.serialize(new javax.xml.namespace.QName("", "treatment"), xmlWriter);
		if (localDoctorsTracker) {
			if (localDoctors != null) {
				for (int i = 0; i < localDoctors.length; i++) {
					if (localDoctors[i] != null) {
						localDoctors[i].serialize(new javax.xml.namespace.QName("", "doctors"), xmlWriter);
					} else {

						// we don't have to do any thing since minOccures is zero

					}

				}
			} else {

				throw new org.apache.axis2.databinding.ADBException("doctors cannot be null!!");

			}
		}
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

		namespace = "";
		writeStartElement(null, namespace, "isEmergency", xmlWriter);

		if (false) {

			throw new org.apache.axis2.databinding.ADBException("isEmergency cannot be null!!");

		} else {
			xmlWriter.writeCharacters(
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsEmergency));
		}

		xmlWriter.writeEndElement();

		namespace = "";
		writeStartElement(null, namespace, "isFixed", xmlWriter);

		if (false) {

			throw new org.apache.axis2.databinding.ADBException("isFixed cannot be null!!");

		} else {
			xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsFixed));
		}

		xmlWriter.writeEndElement();

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

		elementList.add(new javax.xml.namespace.QName("", "treatment"));

		if (localTreatment == null) {
			throw new org.apache.axis2.databinding.ADBException("treatment cannot be null!!");
		}
		elementList.add(localTreatment);
		if (localDoctorsTracker) {
			if (localDoctors != null) {
				for (int i = 0; i < localDoctors.length; i++) {

					if (localDoctors[i] != null) {
						elementList.add(new javax.xml.namespace.QName("", "doctors"));
						elementList.add(localDoctors[i]);
					} else {

						// nothing to do

					}

				}
			} else {

				throw new org.apache.axis2.databinding.ADBException("doctors cannot be null!!");

			}

		}
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

		elementList.add(new javax.xml.namespace.QName("", "isEmergency"));

		elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsEmergency));

		elementList.add(new javax.xml.namespace.QName("", "isFixed"));

		elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsFixed));

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
		public static ScheduleTreatment parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
			ScheduleTreatment object = new ScheduleTreatment();

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

						if (!"ScheduleTreatment".equals(type)) {
							// find namespace for the prefix
							java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
							return (ScheduleTreatment) nl.mcl.services.ExtensionMapper.getTypeObject(nsUri, type,
									reader);
						}

					}

				}

				// Note all attributes that were handled. Used to differ normal attributes
				// from anyAttributes.
				java.util.Vector handledAttributes = new java.util.Vector();

				reader.next();

				java.util.ArrayList list2 = new java.util.ArrayList();

				java.util.ArrayList list3 = new java.util.ArrayList();

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

				if (reader.isStartElement() && new javax.xml.namespace.QName("", "doctors").equals(reader.getName())) {

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
							if (new javax.xml.namespace.QName("", "doctors").equals(reader.getName())) {
								list2.add(nl.mcl.services.Doctor.Factory.parse(reader));

							} else {
								loopDone2 = true;
							}
						}
					}
					// call the converter utility to convert and set the array

					object.setDoctors((nl.mcl.services.Doctor[]) org.apache.axis2.databinding.utils.ConverterUtil
							.convertToArray(nl.mcl.services.Doctor.class, list2));

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("", "patients").equals(reader.getName())) {

					// Process the array and step past its final element's end.
					list3.add(nl.mcl.services.Patient.Factory.parse(reader));

					// loop until we find a start element that is not part of this array
					boolean loopDone3 = false;
					while (!loopDone3) {
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
							loopDone3 = true;
						} else {
							if (new javax.xml.namespace.QName("", "patients").equals(reader.getName())) {
								list3.add(nl.mcl.services.Patient.Factory.parse(reader));

							} else {
								loopDone3 = true;
							}
						}
					}
					// call the converter utility to convert and set the array

					object.setPatients((nl.mcl.services.Patient[]) org.apache.axis2.databinding.utils.ConverterUtil
							.convertToArray(nl.mcl.services.Patient.class, list3));

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid parameter was
					// passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("", "isEmergency").equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "isEmergency" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setIsEmergency(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid parameter was
					// passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("", "isFixed").equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "isFixed" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setIsFixed(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

					reader.next();

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
