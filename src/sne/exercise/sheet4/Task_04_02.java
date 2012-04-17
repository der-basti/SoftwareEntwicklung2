package sne.exercise.sheet4;

import java.awt.Point;

/**
 * Exercise sheet: 04 task: 02 <br />
 * Description:<br />
 * Erstellen Sie mehrere Varianten des Datentyps „Rectangle“ für die
 * Repräsentation eines Rechteckes. Implementieren Sie jeweils einen
 * Konstruktor mit Parametern, die toString-Methode, eine Methode zur Berechnung
 * der Fläche und Methoden zur Berechnung der X- bzw. Y-Koordinaten der
 * Eckpunkte. Verwenden Sie jeweils die gleichen Methodensignaturen.
 * 
 * a) Definieren Sie das Rechteck über zwei Eckpunkte.
 * 
 * b) Definieren Sie das Rechteck über den unteren rechten Punkt in Verbindung
 * mit Höhe und Breite.
 * 
 * c) Definieren Sie das Rechteck über den Mittelpunkt in Verbindung mit Höhe
 * und Breite.
 * 
 * Testen Sie Ihre Datentypen anhand eine kleines Beispielprogrammes.
 */
public class Task_04_02 {

	public static void main(String[] args) {

		/*Rectangle a = new Rectangle(new Point(-1, -1), new Point(1, 1));
		System.out.println(a.toString());
		System.out.println(a.size());*/

		Rectangle b = new Rectangle(1, 1, new Point(0, 0));
		System.out.println(b.toString());
		System.out.println(b.size());

		Rectangle c = new Rectangle(new Point(5, 5), 2, 2);
		System.out.println(c.toString());
		System.out.println(c.size());
	}
}
