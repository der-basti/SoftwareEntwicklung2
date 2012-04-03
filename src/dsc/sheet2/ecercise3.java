package dsc.sheet2;

import StdLib.StdOut;

public class ecercise3 {

	/**
	 * Schreiben Sie einen Datentyp „Year“ zur Repräsentation eines
	 * Kalenderjahres mit der Funktionalität zu ermitteln, ob das betreffende
	 * Jahr ein Schaltjahr ist. Erstellen Sie danach einen Datentyp „Date“ zur
	 * Darstellung eines Datums. Sie sollten in der Lage sein, eine neue
	 * Date-Instanz zu schaffen, indem Sie den Monat, den Tag und das Jahr als
	 * ganze Zahlen angeben. Weiterhin soll das Objekt Methoden besitzen, um die
	 * Nummer des Tages im aktuellen Jahr sowie die Anzahl der Tage zwischen
	 * zwei Datumsangaben zu berechnen.
	 * 
	 * Testen Sie Ihre Klassen mit einer kleinen Beispielanwendung.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Year year = new Year(2012);
		
		StdOut.println(year.isLeapYear());
		
		Date date = new Date(31, 01, 2012);
		
		StdOut.println(date.toString());
		StdOut.println(date.dayOfTheYear());

	}

}
