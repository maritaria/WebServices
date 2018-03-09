
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:04:10 GMT)
 */

package nl.mcl.services;

/**
 * ExtensionMapper class
 */
@SuppressWarnings({ "unchecked", "unused" })

public class ExtensionMapper {

	public static java.lang.Object getTypeObject(java.lang.String namespaceURI, java.lang.String typeName,
			javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {

		if ("http://services.mcl.nl/".equals(namespaceURI) && "Treatment".equals(typeName)) {

			return nl.mcl.services.Treatment.Factory.parse(reader);

		}

		if ("http://services.mcl.nl/".equals(namespaceURI) && "ScheduledTreatment".equals(typeName)) {

			return nl.mcl.services.ScheduledTreatment.Factory.parse(reader);

		}

		if ("http://services.mcl.nl/".equals(namespaceURI) && "RoomFilter".equals(typeName)) {

			return nl.mcl.services.RoomFilter.Factory.parse(reader);

		}

		if ("http://services.mcl.nl/".equals(namespaceURI) && "Doctor".equals(typeName)) {

			return nl.mcl.services.Doctor.Factory.parse(reader);

		}

		if ("http://services.mcl.nl/".equals(namespaceURI) && "Patient".equals(typeName)) {

			return nl.mcl.services.Patient.Factory.parse(reader);

		}

		if ("http://services.mcl.nl/".equals(namespaceURI) && "TimeSlot".equals(typeName)) {

			return nl.mcl.services.TimeSlot.Factory.parse(reader);

		}

		if ("http://services.mcl.nl/".equals(namespaceURI) && "Room".equals(typeName)) {

			return nl.mcl.services.Room.Factory.parse(reader);

		}

		throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
	}

}
