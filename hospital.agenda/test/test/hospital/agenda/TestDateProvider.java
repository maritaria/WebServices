package test.hospital.agenda;

import java.util.Calendar;
import java.util.GregorianCalendar;

import hospital.agenda.IDateProvider;

public class TestDateProvider implements IDateProvider {

	public static final int YEAR = 2018;
	public static final int MONTH = 5;
	public static final int DAY = 3;
	public static final int HOUR = 8;
	public static final int MINUTE = 0;
	
	@Override
	public Calendar getNow() {
		return new GregorianCalendar(YEAR, MONTH, DAY, HOUR, MINUTE);
	}

}
