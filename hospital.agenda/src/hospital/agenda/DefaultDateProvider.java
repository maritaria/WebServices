package hospital.agenda;

import java.util.Calendar;

public class DefaultDateProvider implements IDateProvider {

	@Override
	public Calendar getNow() {
		return Calendar.getInstance();
	}

}
