package dsc.sheet2;

public class Date {

	private final int day, month, year;

	public Date(int dd, int mm, int yyyy) {
		day = dd;
		month = mm;
		year = yyyy;
	}

	public int dayOfTheYear() {
		Year y = new Year(year);
		int thirtyDays;
		int thirtyOneDays = (month / 2) * 31;
		
		if (month <= 2) {
			thirtyDays = 28;
		}
		else if ((month <= 2) && (y.isLeapYear() == true)) {
			thirtyDays = 29;
		}
		else if (month < 8) {
			thirtyDays = ((month / 2) - 1) * 30;
		}
		else {
			thirtyDays = ((month / 2) - 2) * 30;
		}
	
		return day + thirtyOneDays + thirtyDays;
	}

	@Override
	public String toString() {
		return day + "." + month + "." + year;
	}

}
