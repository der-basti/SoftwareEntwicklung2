package sne.exercise.sheet2;

import org.junit.Assert;

/**
 * Exercise sheet: 02 task: 03 <br />
 * Description:<br />
 * Schreiben Sie einen Datentyp „Year“ zur Repräsentation eines Kalenderjahres
 * mit der Funktionalität zu ermitteln, ob das betreffende Jahr ein Schaltjahr
 * ist. Erstellen Sie danach einen Datentyp „Date“ zur Darstellung eines Datums.
 * Sie sollten in der Lage sein, eine neue Date-Instanz zu schaffen, indem Sie
 * den Monat, den Tag und das Jahr als ganze Zahlen angeben. Weiterhin soll das
 * Objekt Methoden besitzen, um die Nummer des Tages im aktuellen Jahr sowie die
 * Anzahl der Tage zwischen zwei Datumsangaben zu berechnen. Testen Sie Ihre
 * Klassen mit einer kleinen Beispielanwendung.
 */
public class Task_02_03 {

	public static void main(String[] args) {

		Year year = new Year();
		System.out.println("2011 is leap year: " + year.isLeapyear(2011));
		System.out.println("current is leap year: " + year.isLeapyear());
		
		System.out.println();
		
		Date date1 = new Date();
		Date date2 = new Date(12,24,2011);
		Date date3 = new Date(12,24,2012);
		System.out.println("current days: " + date1.getDayOfYear());
		System.out.println("12-24-2011: " + date2.getDayOfYear());
		System.out.println("12-24-2012: " + date3.getDayOfYear());
		System.out.println("current - 12-24-2011: " + date1.getDayDifference(date2));
		System.out.println("12-24-2011 - 12-24-2012: " + date2.getDayDifference(date3));
	}
}
