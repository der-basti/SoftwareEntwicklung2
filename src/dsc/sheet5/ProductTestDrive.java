package dsc.sheet5;

public class ProductTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Product ballantines = new Product("SC120-C", "BALLANTINES", 8, 2);
		Product duffy = new Product("SC123-F", "DUFFY MALT Whisky", 10, 6);
		Product glen = new Product("SC347-A", "GLEN MORANGIE MALT Whisky", 55, 15);
		SpecialItem laphroig18 = new SpecialItem("SP018-L", "LAPHROIG 18 YEARS", 31, 9);
		SpecialItem laphroig25 = new SpecialItem("SP025-L", "LAPHROIG 25 YEARS", 137, 15);
		
		ballantines.print();
		duffy.print();
		glen.print();
		System.out.println();
		laphroig18.print();
		laphroig25.print();
	}
}