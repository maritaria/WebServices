
/**
 * Patient.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:04:10 GMT)
 */

package nl.mcl.services;

/**
 * Patient bean class
 */
@SuppressWarnings({ "unchecked", "unused" })

public class Patient implements org.apache.axis2.databinding.ADBBean {
	/*
	 * This type was generated from the piece of schema that had name = Patient
	 * Namespace URI = http://services.mcl.nl/ Namespace Prefix = ns2
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
	 * field for Name
	 */

	protected java.lang.String localName;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getName() {
		return localName;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Name
	 */
	public void setName(java.lang.String param) {

		this.localName = param;

	}

	/**
	 * field for Phonenumber
	 */

	protected java.lang.String localPhonenumber;

	/*
	 * This tracker boolean wil be used to detect whether the user called the set
	 * method for this attribute. It will be used to determine whether to include
	 * this field in the serialized XML
	 */
	protected boolean localPhonenumberTracker = false;

	public boolean isPhonenumberSpecified() {
		return localPhonenumberTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getPhonenumber() {
		return localPhonenumber;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Phonenumber
	 */
	public void setPhonenumber(java.lang.String param) {
		localPhonenumberTracker = param != null;

		this.localPhonenumber = param;

	}

	/**
	 * field for Email
	 */

	protected java.lang.String localEmail;

	/*
	 * This tracker boolean wil be used to detect whether the user called the set
	 * method for this attribute. It will be used to determine whether to include
	 * this field in the serialized XML
	 */
	protected boolean localEmailTracker = false;

	public boolean isEmailSpecified() {
		return localEmailTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getEmail() {
		return localEmail;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Email
	 */
	public void setEmail(java.lang.String param) {
		localEmailTracker = param != null;

		this.localEmail = param;

	}

	/**
	 * field for Address
	 */

	protected java.lang.String localAddress;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getAddress() {
		return localAddress;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Address
	 */
	public void setAddress(java.lang.String param) {

		this.localAddress = param;

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
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":Patient",
						xmlWriter);
			} else {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "Patient", xmlWriter);
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

		namespace = "";
		writeStartElement(null, namespace, "name", xmlWriter);

		if (localName == null) {
			// write the nil attribute

			throw new org.apache.axis2.databinding.ADBException("name cannot be null!!");

		} else {

			xmlWriter.writeCharacters(localName);

		}

		xmlWriter.writeEndElement();
		if (localPhonenumberTracker) {
			namespace = "";
			writeStartElement(null, namespace, "phonenumber", xmlWriter);

			if (localPhonenumber == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException("phonenumber cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localPhonenumber);

			}

			xmlWriter.writeEndElement();
		}
		if (localEmailTracker) {
			namespace = "";
			writeStartElement(null, namespace, "email", xmlWriter);

			if (localEmail == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException("email cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localEmail);

			}

			xmlWriter.writeEndElement();
		}
		namespace = "";
		writeStartElement(null, namespace, "address", xmlWriter);

		if (localAddress == null) {
			// write the nil attribute

			throw new org.apache.axis2.databinding.ADBException("address cannot be null!!");

		} else {

			xmlWriter.writeCharacters(localAddress);

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

		elementList.add(new javax.xml.namespace.QName("", "id"));

		if (localId != null) {
			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localId));
		} else {
			throw new org.apache.axis2.databinding.ADBException("id cannot be null!!");
		}

		elementList.add(new javax.xml.namespace.QName("", "name"));

		if (localName != null) {
			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localName));
		} else {
			throw new org.apache.axis2.databinding.ADBException("name cannot be null!!");
		}
		if (localPhonenumberTracker) {
			elementList.add(new javax.xml.namespace.QName("", "phonenumber"));

			if (localPhonenumber != null) {
				elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPhonenumber));
			} else {
				throw new org.apache.axis2.databinding.ADBException("phonenumber cannot be null!!");
			}
		}
		if (localEmailTracker) {
			elementList.add(new javax.xml.namespace.QName("", "email"));

			if (localEmail != null) {
				elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmail));
			} else {
				throw new org.apache.axis2.databinding.ADBException("email cannot be null!!");
			}
		}
		elementList.add(new javax.xml.namespace.QName("", "address"));

		if (localAddress != null) {
			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAddress));
		} else {
			throw new org.apache.axis2.databinding.ADBException("address cannot be null!!");
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
		public static Patient parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
			Patient object = new Patient();

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

						if (!"Patient".equals(type)) {
							// find namespace for the prefix
							java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
							return (Patient) nl.mcl.services.ExtensionMapper.getTypeObject(nsUri, type, reader);
						}

					}

				}

				// Note all attributes that were handled. Used to differ normal attributes
				// from anyAttributes.
				java.util.Vector handledAttributes = new java.util.Vector();

				reader.next();

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

				if (reader.isStartElement() && new javax.xml.namespace.QName("", "name").equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "name" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

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
						&& new javax.xml.namespace.QName("", "phonenumber").equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "phonenumber" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setPhonenumber(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

					reader.next();

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("", "email").equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "email" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setEmail(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

					reader.next();

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("", "address").equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "address" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setAddress(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

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
