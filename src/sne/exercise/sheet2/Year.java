package sne.exercise.sheet2;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Exercise only!
 */
class Year {

	private GregorianCalendar cal;

	public Year() {
		// XXX [sne] optional locale and timezone
		this.cal = new GregorianCalendar();
	}

	public boolean isLeapyear() {
		return isLeapyear(this.cal.get(Calendar.YEAR));
	}

	public boolean isLeapyear(int year) {
		// if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
		return this.cal.isLeapYear(year);
	}

}
