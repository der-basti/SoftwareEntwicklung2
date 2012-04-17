package dsc.sheet4;

public class LocationTestDrive {

	/**
	 * Entwerfen Sie einen Datentyp „Location“ zur Darstellung einer beliebigen
	 * Position auf der Erde anhand von sphärischen Koordinaten
	 * (Latitude/Longitude). Implementieren Sie einen Konstruktor mit
	 * Parametern, eine Methode zur Erstellung einer zufälligen aber gültigen
	 * Erdposition, eine Methode zum Parsen von Textangaben von Positionen in
	 * der Form "48.858 N 2.294 E" und einer Methode zur Berechnung der Strecke
	 * zwischen zwei Positionen (siehe Orthodrome, Erdumfang 40 Tkm). Testen Sie
	 * Ihren Datentyp mit einem Programm zur Berechnung der Strecke zwischen dem
	 * Brandenburger Tor und der oben angegebenen Position.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Location brandenburgGate = new Location(52.51624, 13.377735);
		Location eiffelTower = Location.parseLocation("48.858 N 2.294 E");
		System.out.println("The distance from The Brandenburg Gate to The Eiffel Tower is " + brandenburgGate.distanceFrom(eiffelTower) + " km.");
		
		Location randomLoc = Location.setRandomLocation();
		System.out.println(randomLoc);
		
		Location unreal = new Location(12, 30);
		System.out.println(unreal);
	}
}
