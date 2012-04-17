package dsc.sheet4;

import java.awt.Point;

public class RectangleTestDrive {

	/**
	 * Erstellen Sie mehrere Varianten des Datentyps „Rectangle“ für die
	 * Repräsentation eines Rechteckes. Implementieren Sie jeweils einen
	 * Konstruktor mit Parametern, die toString-Methode, eine Methode zur
	 * Berechnung der Fläche und Methoden zur Berechnung der X- bzw.
	 * Y-Koordinaten der Eckpunkte. Verwenden Sie jeweils die gleichen
	 * Methodensignaturen.
	 * 
	 * a) Definieren Sie das Rechteck über zwei Eckpunkte. 
	 * b) Definieren Sie das Rechteck über den unteren rechten Punkt in 
	 * Verbindung mit Höhe und Breite. 
	 * c) Definieren Sie das Rechteck über den Mittelpunkt in Verbindung
	 * mit Höhe und Breite.
	 * 
	 * Testen Sie Ihre Datentypen anhand eine kleines Beispielprogrammes.
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Point lowerLeft = new Point(0, 0);
		Point upperRight = new Point(5, 5);
		Point center = new Point(0, 0);
		Point lowerRight = new Point(7, 8);
		
		Rectangle rectangleA = new Rectangle(lowerLeft, upperRight);
		Rectangle rectangleB = new Rectangle(2.0, 1.0, center);
		Rectangle rectangleC = new Rectangle(lowerRight, 3.0, 2.0);

		System.out.println("Rectangle A's area is: " + rectangleA.getSize());
		System.out.println("Rectangle B's area is: " + rectangleB.getSize());
		System.out.println("Rectangle C's area is: " + rectangleC.getSize());
		
	}

}
