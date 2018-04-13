
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:04:10 GMT)
 */

package hospital.doctor;

/**
 * ExtensionMapper class
 */
@SuppressWarnings({ "unchecked", "unused" })

public class ExtensionMapper {

	public static java.lang.Object getTypeObject(java.lang.String namespaceURI, java.lang.String typeName,
			javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {

		if ("http://hospital/schema/".equals(namespaceURI) && "AgendaResponse_type0".equals(typeName)) {

			return hospital.schema.AgendaResponse_type0.Factory.parse(reader);

		}

		if ("http://hospital/schema/".equals(namespaceURI) && "Skills_type0".equals(typeName)) {

			return hospital.schema.Skills_type0.Factory.parse(reader);

		}

		if ("http://hospital/schema/".equals(namespaceURI) && "Items_type0".equals(typeName)) {

			return hospital.schema.Items_type0.Factory.parse(reader);

		}

		if ("http://hospital/schema/".equals(namespaceURI) && "DoctorIDs_type0".equals(typeName)) {

			return hospital.schema.DoctorIDs_type0.Factory.parse(reader);

		}

		if ("http://hospital/schema/".equals(namespaceURI) && "RoomIDs_type0".equals(typeName)) {

			return hospital.schema.RoomIDs_type0.Factory.parse(reader);

		}

		throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
	}

}
