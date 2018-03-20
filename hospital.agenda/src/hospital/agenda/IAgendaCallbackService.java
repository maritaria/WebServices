package hospital.agenda;

public interface IAgendaCallbackService {
	public void receiveCallback(TreatmentScheduling rescheduledTreatment) throws java.rmi.RemoteException;
}
