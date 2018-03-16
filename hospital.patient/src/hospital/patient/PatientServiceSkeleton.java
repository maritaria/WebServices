
/**
 * PatientServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package hospital.patient;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

/**
 * PatientServiceSkeleton java skeleton for the axisService
 */
public class PatientServiceSkeleton implements PatientServiceSkeletonInterface {
	
	private OutputStream handle;
	

	/**
	 * Auto generated method signature
	 * 
	 * @param notification0
	 * @return
	 */

	public void notify(hospital.patient.Notification notification) {
		if (handle == null) return;
		
		byte[] patientID = notification.getPatientID().getBytes(StandardCharsets.UTF_8);
		byte[] message = notification.getMessage().getBytes(StandardCharsets.UTF_8);
		
		try {
			handle.write(patientID.length);
			handle.write(patientID);
			handle.write(message.length);
			handle.write(message);
			handle.flush();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void setHandle(OutputStream handle) {
		this.handle = Objects.requireNonNull(handle);
	}

}
