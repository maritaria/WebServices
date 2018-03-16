package test.hospital.patient;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.nio.charset.StandardCharsets;

import org.junit.Assert;
import org.junit.Test;

import hospital.patient.Notification;
import hospital.patient.PatientServiceSkeleton;

public class PatientTest {
	
	private PatientServiceSkeleton patientService = new PatientServiceSkeleton();
	private PipedInputStream inputStream = new PipedInputStream();
	
	public PatientTest() throws IOException {
		patientService.setHandle(new PipedOutputStream(inputStream));
	}
	
	@Test
	public void testNoData() throws IOException {
		Assert.assertEquals(0, inputStream.available());
	}
	
	@Test
	public void testNotification() throws IOException {
		final String patientId = "Pietje";
		final String message = "Hello, World!";
		
		Notification n = new Notification(patientId, message);
		patientService.notify(n);
		
		final int idLength = inputStream.read();
		final byte[] idBytes = new byte[idLength];
		inputStream.read(idBytes, 0, idLength);
		
		final int messageLength = inputStream.read();
		final byte[] messageBytes = new byte[messageLength];
		inputStream.read(messageBytes, 0, messageLength);
		
		final String decodedPatientId = new String(idBytes, StandardCharsets.UTF_8);
		final String decodedMessage = new String(messageBytes, StandardCharsets.UTF_8);
		
		Assert.assertEquals(patientId, decodedPatientId);
		Assert.assertEquals(message, decodedMessage);
		
		Assert.assertEquals(0, inputStream.available());
	}

}
