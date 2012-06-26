package sne.exercise.sheet02;

/**
 * Exercise sheet: 02 task: 01 <br />
 * Description:<br />
 * Implementieren Sie einen Datentyp “Dice” zur Abbildung eines Würfels mit 6
 * Seiten. Fügen Sie dem Datentyp Methoden zum Würfeln (zufällige Auswahl
 * einer Seite) und der Ermittlung des aktuellen Wertes des Würfels (oben
 * liegende Seite) hinzu. Schreiben Sie ein Programm, welches 30 Würfel mit
 * einem Mal wirft und die Gesamtzahl der gewürfelten Punkte auf dem Bildschirm
 * ausgibt.
 */
public class Task_02_01 {
	
	public static void main(String[] args) {

		Dice dice = new Dice();
		dice.roll();
		System.out.println(dice.toString());
		
		dice.roll(30);
		System.out.println(dice.toString());
	}
}
