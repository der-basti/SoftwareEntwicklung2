package sne.exercise.sheet04;

/**
 * Exercise sheet: 04 task: 03 <br />
 * Description:<br />
 * Entwerfen Sie einen Datentyp „Location“ zur Darstellung einer beliebigen
 * Position auf der Erde anhand von sphärischen Koordinaten
 * (Latitude/Longitude). Implementieren Sie einen Konstruktor mit Parametern,
 * eine Methode zur Erstellung einer zufälligen aber gültigen Erdposition,
 * eine Methode zum Parsen von Textangaben von Positionen in der Form
 * "48.858 N 2.294 E" und einer Methode zur Berechnung der Strecke zwischen zwei
 * Positionen (siehe Orthodrome, Erdumfang 40 Tkm).
 * 
 * Testen Sie Ihren Datentyp mit einem Programm zur Berechnung der Strecke
 * zwischen dem Brandenburger Tor und der oben angegebenen Position.
 */
public class Task_04_03 {

	public static void main(String[] args) {

		Location paris = new Location(48.858, 2.294);
		Location berlin = new Location(52.51624, 13.3777);
		System.out.println(paris.distance(berlin));
	}
}
