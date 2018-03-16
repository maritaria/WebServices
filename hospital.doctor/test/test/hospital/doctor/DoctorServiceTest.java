package test.hospital.doctor;

import hospital.doctor.DoctorIDs;
import hospital.doctor.DoctorServiceSkeleton;
import hospital.doctor.DoctorServiceSkeleton.Doctor;
import hospital.doctor.Skills;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class DoctorServiceTest {
	private DoctorServiceSkeleton doctorService = new DoctorServiceSkeleton();

	@Test
	public void testNotFound() {
		DoctorIDs result = doctorService.findDoctor(new Skills("test"));
		Assert.assertNotNull(result);
		Assert.assertFalse(result.isDoctorIDSpecified());
	}

	@Test
	public void testFindAll() {
		DoctorIDs result = doctorService.findDoctor(new Skills());
		Assert.assertNotNull(result);
		Assert.assertNotNull(result.getDoctorID());
		Assert.assertEquals(DoctorServiceSkeleton.DEFAULT_DOCTOR_COUNT, result.getDoctorID().length);
	}

	@Test
	public void testNewDoctor() {
		Doctor newDoc = new Doctor("eugene krabs", Arrays.asList("test"));

		DoctorIDs result = doctorService.findDoctor(new Skills("test"));
		
		Assert.assertEquals(1, result.getDoctorID().length);
		Assert.assertEquals(newDoc.getId(), result.getDoctorID()[0]);
		
	}

}
