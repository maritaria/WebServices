
/**
 * DoctorServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package hospital.doctor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

import hospital.schema.*;

/**
 * DoctorServiceSkeleton java skeleton for the axisService
 */
public class DoctorServiceSkeleton implements DoctorServiceSkeletonInterface {
	public static final int DEFAULT_DOCTOR_COUNT = 2;
	// TODO DAO as field.
	private final List<Doctor> doctors = new ArrayList<>();

	public DoctorServiceSkeleton() {
		this.doctors.add(new Doctor("patrick star", Arrays.asList("heart-surgery")));
		this.doctors.add(new Doctor("quidward tentacles", Arrays.asList("brain-surgery")));
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param skills1
	 * @return doctorIDs2
	 */

	@Override
	public DoctorIDs findDoctor(Skills skills) {
		Skills_type0 skillsArray = Objects.requireNonNull(skills).getSkills();
		DoctorIDs doctorIds = new DoctorIDs();
		DoctorIDs_type0 doctorArray = new DoctorIDs_type0();
		doctorIds.setDoctorIDs(doctorArray);
		Stream<Doctor> doctorStream = doctors.stream();
		if (skillsArray.isSkillSpecified()) {
			doctorStream = doctorStream
					.filter(doctor -> doctor.getSkills().containsAll(Arrays.asList(skillsArray.getSkill())));
		}
		doctorStream.map(Doctor::getId).forEach(doctorArray::addDoctorID);
		return doctorIds;
	}

	public void addDoctor(Doctor doctor) {
		this.doctors.add(Objects.requireNonNull(doctor));
	}

	public static class Doctor {
		private final String id;
		private final List<String> skills;

		public Doctor(String id, List<String> items) {
			this.id = Objects.requireNonNull(id);
			this.skills = new ArrayList<>(Objects.requireNonNull(items));
		}

		public String getId() {
			return id;
		}

		public List<String> getSkills() {
			return Collections.unmodifiableList(skills);
		}
	}

	@Override
	public void notify(AgendaCallback agendaCallback) {
		// TODO Auto-generated method stub
		
	}

}
