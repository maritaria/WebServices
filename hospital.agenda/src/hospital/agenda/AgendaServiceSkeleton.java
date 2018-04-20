
/**
 * AgendaServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package hospital.agenda;

import java.rmi.RemoteException;
import java.util.Calendar;

import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.context.MessageContext;
import org.apache.axis2.engine.AxisConfiguration;

import hospital.schema.*;

/**
 * AgendaServiceSkeleton java skeleton for the axisService
 */
public class AgendaServiceSkeleton implements AgendaServiceSkeletonInterface {

	/**
	 * Auto generated method signature
	 * 
	 * @param agendaRequest0
	 * @return
	 */

	public void scheduleTreatment(hospital.schema.AgendaRequest agendaRequest0) {
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(2000);
					AxisConfiguration axisConfiguration = new AxisConfiguration();
					AgendaCallbackServiceStub stub = new AgendaCallbackServiceStub();
					AgendaCallbackServiceStub.AgendaCallback agendaCallback = new AgendaCallbackServiceStub.AgendaCallback();
					agendaCallback.setRequestID("1");
					{
						AgendaCallbackServiceStub.ScheduleInfo_type0 scheduleInfo = new AgendaCallbackServiceStub.ScheduleInfo_type0();
						scheduleInfo.setPatientID(agendaRequest0.getSchedulingRequest().getPatientID());
						scheduleInfo.setRoomID(agendaRequest0.getRoomIDs().getRoomID()[0]);
						scheduleInfo.setDoctorID(agendaRequest0.getDoctorIDs().getDoctorID()[0]);
						scheduleInfo.setWhen(Calendar.getInstance());
						agendaCallback.setScheduleInfo(scheduleInfo);
					}
					agendaCallback.setRescheduledTreatment(new AgendaCallbackServiceStub.RescheduledTreatment_type0[0]);
					stub.receiveCallback(agendaCallback);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					throw new java.lang.UnsupportedOperationException(e);
				}
			}
		});
		t.start();
	}

}
