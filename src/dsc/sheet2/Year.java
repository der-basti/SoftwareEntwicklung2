package dsc.sheet2;

public class Year {
	
	private final int year;
	
//	public Year(int whichYear) {
//		year = whichYear;
//	}
	
	public Year(int year) {
		this.year = year;
	}
	
	public boolean isLeapYear() {
		if  (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
		return true;	
		}
		else return false;
	}

}
