
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:04:10 GMT)
 */

package com.medicare.types;

/**
 * ExtensionMapper class
 */
@SuppressWarnings({ "unchecked", "unused" })

public class ExtensionMapper {

	public static java.lang.Object getTypeObject(java.lang.String namespaceURI, java.lang.String typeName,
			javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {

		if ("http://medicare.com/Types".equals(namespaceURI) && "Treatment".equals(typeName)) {

			return com.medicare.types.Treatment.Factory.parse(reader);

		}

		if ("http://medicare.com/Types".equals(namespaceURI) && "ScheduledTreatment".equals(typeName)) {

			return com.medicare.types.ScheduledTreatment.Factory.parse(reader);

		}

		if ("http://medicare.com/Types".equals(namespaceURI) && "Doctor".equals(typeName)) {

			return com.medicare.types.Doctor.Factory.parse(reader);

		}

		if ("http://medicare.com/Types".equals(namespaceURI) && "Patient".equals(typeName)) {

			return com.medicare.types.Patient.Factory.parse(reader);

		}

		if ("http://medicare.com/Types".equals(namespaceURI) && "Person".equals(typeName)) {

			return com.medicare.types.Person.Factory.parse(reader);

		}

		if ("http://medicare.com/Types".equals(namespaceURI) && "Timeslot".equals(typeName)) {

			return com.medicare.types.Timeslot.Factory.parse(reader);

		}

		if ("http://medicare.com/Types".equals(namespaceURI) && "requirements_type0".equals(typeName)) {

			return com.medicare.types.Requirements_type0.Factory.parse(reader);

		}

		if ("http://medicare.com/Types".equals(namespaceURI) && "Room".equals(typeName)) {

			return com.medicare.types.Room.Factory.parse(reader);

		}

		throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
	}

}
