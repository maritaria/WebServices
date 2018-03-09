
/**
 * DoctorServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package nl.mcl.services;

import java.util.ArrayList;

/**
 * DoctorServiceSkeleton java skeleton for the axisService
 */
public class DoctorServiceSkeleton implements DoctorServiceSkeletonInterface {

	private ArrayList<Doctor> doctors = new ArrayList<>();
	
	public DoctorServiceSkeleton()
	{
		doctors.add(new Doctor("1", "Patrick Star", new String[] {"stomache"}));
		doctors.add(new Doctor("1", "Eugene Krabs", new String[] {"eyes", "nose"}));
		doctors.add(new Doctor("1", "Sandy Cheeks", new String[] {"brain", "eyes"}));
		doctors.add(new Doctor("1", "Sheldon Plankton", new String[] {"brain"}));
		doctors.add(new Doctor("1", "Larry Lobster", new String[] {"legs", "arms"}));
	}
	
	/**
	 * Auto generated method signature
	 * 
	 * @param findDoctor0
	 * @return findDoctorResponse1
	 */

	public nl.mcl.services.FindDoctorResponse findDoctor(nl.mcl.services.FindDoctor findDoctor0) {
		// TODO : fill this with the necessary business logic
		FindDoctorResponse response = new FindDoctorResponse();
		for (Doctor doc : doctors)
		{
			if (doc.hasSkills(findDoctor0.getRequiredSkill()))
			{
				response.addCandidate(doc);
			}
		}
		return response;
	}

}
