package sne.exercise.sheet2;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Only exercise! Since 1582.
 */
class Date {

	private Calendar cal;

	/**
	 * Current date.
	 */
	public Date() {
		this.cal = new GregorianCalendar();
	}

	public Date(int month, int dayOfMonth, int year) {
		if (month < 1 || month > 12)
			throw new IllegalArgumentException("Wrong month (between 1-12).");
		if (dayOfMonth < 1 || dayOfMonth > 31)
			throw new IllegalArgumentException("Wrong day (between 1-31).");
		if (year < 1582)
			throw new IllegalArgumentException("Wrong year (as of 1582).");

//		this.cal = new GregorianCalendar(year, month, dayOfMonth);
		this.cal = new GregorianCalendar();
		this.cal.set(year, month, dayOfMonth);
	}

	public int getDayOfYear() {
		return this.cal.get(Calendar.DAY_OF_YEAR);
	}

	public long getDayDifference(Date date) {
		GregorianCalendar tmp = new GregorianCalendar(date.getYear(),
				date.getMonth(), date.getDayOfMonth());
		return Math.abs(this.cal.getTimeInMillis() - tmp.getTimeInMillis())
				/ (1000 * 60 * 60 * 24);
		// ms, s, min, h
		// return Math.abs(getDayOfYear() - date.getDayOfYear());
	}

	public int getMonth() {
		return this.cal.get(Calendar.MONTH);
	}

	public int getDayOfMonth() {
		return this.cal.get(Calendar.DAY_OF_MONTH);
	}

	public int getYear() {
		return this.cal.get(Calendar.YEAR);
	}
}
