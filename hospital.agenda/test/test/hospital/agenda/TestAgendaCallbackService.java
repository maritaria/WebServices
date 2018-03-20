package test.hospital.agenda;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import hospital.agenda.IAgendaCallbackService;
import hospital.agenda.TreatmentScheduling;

public class TestAgendaCallbackService implements IAgendaCallbackService {

	public List<TreatmentScheduling> invokes = new ArrayList<>();
	
	@Override
	public void receiveCallback(TreatmentScheduling rescheduledTreatment) throws RemoteException {
		invokes.add(rescheduledTreatment);
	}

}
