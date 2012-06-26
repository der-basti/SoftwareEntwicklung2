package sne.exercise.sheet02;

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

		this.cal = new GregorianCalendar(year, month, dayOfMonth, 23, 59, 59);
	}

	public int getDayOfYear() {
		return this.cal.get(Calendar.DAY_OF_YEAR);
	}

	/**
	 * @see #getDayDifference2(Date, Date)
	 * @param date
	 * @return difference
	 */
	public long getDayDifference(Date date) {
		GregorianCalendar tmp = createCalendar(date);
		return Math.abs(this.cal.getTimeInMillis() - tmp.getTimeInMillis())
				/ (1000 * 60 * 60 * 24) + 1;
		// ms, s, min, h XXX [sne] --> +1 ???
	}

	/**
	 * @see #getDayDifference(Date)
	 * @param startDate
	 * @param endDate
	 * @return difference
	 */
	public long getDayDifference2(Date startDate, Date endDate) {
		Calendar s = createCalendar(startDate);
		Calendar e = createCalendar(endDate);
		long daysBetween = 0;
		while (s.before(e)) {
			s.add(Calendar.DAY_OF_MONTH, 1);
			daysBetween++;
		}

		// XXX [sne] --> +1 ???
		daysBetween++;

		return daysBetween;
	}

	private GregorianCalendar createCalendar(Date date) {
		return new GregorianCalendar(date.getYear(), date.getMonth(),
				date.getDayOfMonth(), 23, 59, 59);
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
