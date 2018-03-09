
/**
 * AdjustAgenda.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:04:10 GMT)
 */

package nl.mcl.services;

/**
 * AdjustAgenda bean class
 */
@SuppressWarnings({ "unchecked", "unused" })

public class AdjustAgenda implements org.apache.axis2.databinding.ADBBean {

	public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://services.mcl.nl/",
			"AdjustAgenda", "ns2");

	/**
	 * field for AgendaID
	 */

	protected java.lang.String localAgendaID;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getAgendaID() {
		return localAgendaID;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            AgendaID
	 */
	public void setAgendaID(java.lang.String param) {

		this.localAgendaID = param;

	}

	/**
	 * field for OriginalEntryID
	 */

	protected java.lang.String localOriginalEntryID;

	/*
	 * This tracker boolean wil be used to detect whether the user called the set
	 * method for this attribute. It will be used to determine whether to include
	 * this field in the serialized XML
	 */
	protected boolean localOriginalEntryIDTracker = false;

	public boolean isOriginalEntryIDSpecified() {
		return localOriginalEntryIDTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getOriginalEntryID() {
		return localOriginalEntryID;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            OriginalEntryID
	 */
	public void setOriginalEntryID(java.lang.String param) {
		localOriginalEntryIDTracker = param != null;

		this.localOriginalEntryID = param;

	}

	/**
	 * field for Begin
	 */

	protected java.util.Calendar localBegin;

	/*
	 * This tracker boolean wil be used to detect whether the user called the set
	 * method for this attribute. It will be used to determine whether to include
	 * this field in the serialized XML
	 */
	protected boolean localBeginTracker = false;

	public boolean isBeginSpecified() {
		return localBeginTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.util.Calendar
	 */
	public java.util.Calendar getBegin() {
		return localBegin;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Begin
	 */
	public void setBegin(java.util.Calendar param) {
		localBeginTracker = param != null;

		this.localBegin = param;

	}

	/**
	 * field for End
	 */

	protected java.util.Calendar localEnd;

	/*
	 * This tracker boolean wil be used to detect whether the user called the set
	 * method for this attribute. It will be used to determine whether to include
	 * this field in the serialized XML
	 */
	protected boolean localEndTracker = false;

	public boolean isEndSpecified() {
		return localEndTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.util.Calendar
	 */
	public java.util.Calendar getEnd() {
		return localEnd;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            End
	 */
	public void setEnd(java.util.Calendar param) {
		localEndTracker = param != null;

		this.localEnd = param;

	}

	/**
	 * field for Title
	 */

	protected java.lang.String localTitle;

	/*
	 * This tracker boolean wil be used to detect whether the user called the set
	 * method for this attribute. It will be used to determine whether to include
	 * this field in the serialized XML
	 */
	protected boolean localTitleTracker = false;

	public boolean isTitleSpecified() {
		return localTitleTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getTitle() {
		return localTitle;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Title
	 */
	public void setTitle(java.lang.String param) {
		localTitleTracker = param != null;

		this.localTitle = param;

	}

	/**
	 * field for Description
	 */

	protected java.lang.String localDescription;

	/*
	 * This tracker boolean wil be used to detect whether the user called the set
	 * method for this attribute. It will be used to determine whether to include
	 * this field in the serialized XML
	 */
	protected boolean localDescriptionTracker = false;

	public boolean isDescriptionSpecified() {
		return localDescriptionTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDescription() {
		return localDescription;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Description
	 */
	public void setDescription(java.lang.String param) {
		localDescriptionTracker = param != null;

		this.localDescription = param;

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
						namespacePrefix + ":AdjustAgenda", xmlWriter);
			} else {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "AdjustAgenda", xmlWriter);
			}

		}

		namespace = "";
		writeStartElement(null, namespace, "AgendaID", xmlWriter);

		if (localAgendaID == null) {
			// write the nil attribute

			throw new org.apache.axis2.databinding.ADBException("AgendaID cannot be null!!");

		} else {

			xmlWriter.writeCharacters(localAgendaID);

		}

		xmlWriter.writeEndElement();
		if (localOriginalEntryIDTracker) {
			namespace = "";
			writeStartElement(null, namespace, "OriginalEntryID", xmlWriter);

			if (localOriginalEntryID == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException("OriginalEntryID cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localOriginalEntryID);

			}

			xmlWriter.writeEndElement();
		}
		if (localBeginTracker) {
			namespace = "";
			writeStartElement(null, namespace, "Begin", xmlWriter);

			if (localBegin == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException("Begin cannot be null!!");

			} else {

				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBegin));

			}

			xmlWriter.writeEndElement();
		}
		if (localEndTracker) {
			namespace = "";
			writeStartElement(null, namespace, "End", xmlWriter);

			if (localEnd == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException("End cannot be null!!");

			} else {

				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEnd));

			}

			xmlWriter.writeEndElement();
		}
		if (localTitleTracker) {
			namespace = "";
			writeStartElement(null, namespace, "Title", xmlWriter);

			if (localTitle == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException("Title cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localTitle);

			}

			xmlWriter.writeEndElement();
		}
		if (localDescriptionTracker) {
			namespace = "";
			writeStartElement(null, namespace, "Description", xmlWriter);

			if (localDescription == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException("Description cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localDescription);

			}

			xmlWriter.writeEndElement();
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

		elementList.add(new javax.xml.namespace.QName("", "AgendaID"));

		if (localAgendaID != null) {
			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAgendaID));
		} else {
			throw new org.apache.axis2.databinding.ADBException("AgendaID cannot be null!!");
		}
		if (localOriginalEntryIDTracker) {
			elementList.add(new javax.xml.namespace.QName("", "OriginalEntryID"));

			if (localOriginalEntryID != null) {
				elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOriginalEntryID));
			} else {
				throw new org.apache.axis2.databinding.ADBException("OriginalEntryID cannot be null!!");
			}
		}
		if (localBeginTracker) {
			elementList.add(new javax.xml.namespace.QName("", "Begin"));

			if (localBegin != null) {
				elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBegin));
			} else {
				throw new org.apache.axis2.databinding.ADBException("Begin cannot be null!!");
			}
		}
		if (localEndTracker) {
			elementList.add(new javax.xml.namespace.QName("", "End"));

			if (localEnd != null) {
				elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEnd));
			} else {
				throw new org.apache.axis2.databinding.ADBException("End cannot be null!!");
			}
		}
		if (localTitleTracker) {
			elementList.add(new javax.xml.namespace.QName("", "Title"));

			if (localTitle != null) {
				elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTitle));
			} else {
				throw new org.apache.axis2.databinding.ADBException("Title cannot be null!!");
			}
		}
		if (localDescriptionTracker) {
			elementList.add(new javax.xml.namespace.QName("", "Description"));

			if (localDescription != null) {
				elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDescription));
			} else {
				throw new org.apache.axis2.databinding.ADBException("Description cannot be null!!");
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
		public static AdjustAgenda parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
			AdjustAgenda object = new AdjustAgenda();

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

						if (!"AdjustAgenda".equals(type)) {
							// find namespace for the prefix
							java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
							return (AdjustAgenda) nl.mcl.services.ExtensionMapper.getTypeObject(nsUri, type, reader);
						}

					}

				}

				// Note all attributes that were handled. Used to differ normal attributes
				// from anyAttributes.
				java.util.Vector handledAttributes = new java.util.Vector();

				reader.next();

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("", "AgendaID").equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "AgendaID" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setAgendaID(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

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
						&& new javax.xml.namespace.QName("", "OriginalEntryID").equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "OriginalEntryID" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setOriginalEntryID(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

					reader.next();

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("", "Begin").equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "Begin" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setBegin(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

					reader.next();

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("", "End").equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "End" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setEnd(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

					reader.next();

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("", "Title").equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "Title" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setTitle(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

					reader.next();

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("", "Description").equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "Description" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setDescription(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

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
