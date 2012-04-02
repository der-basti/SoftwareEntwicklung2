package sne.exercise.sheet2;

import java.util.Random;

/**
 * Exercise sheet: 02 task: 02 <br />
 * Description:<br />
 * Erstellen Sie einen Datentyp „Point3D“ für Punkte im dreidimensionalen Raum.
 * Ergänzen Sie den Datentyp um einen Konstruktor mit drei ganzzahligen
 * Parametern für die Position des Punktes auf den Achsen X, Y und Z. Fügen
 * Sie des Weiteren drei Methoden zur Berechnung des Euklidischen Abstandes, des
 * Quadrierten Euklidischen Abstandes und der Manhattan-Metrik zwischen zwei
 * Punkten hinzu. Ermöglichen Sie es, die aktuelle Position eines Punktes
 * übersichtlich auf dem Bildschirm ausschreiben zu können.
 * 
 * Schreiben Sie ein Programm welches drei Punkte zufällig im Raum (Dimension 0
 * bis 100 in jeder Achse) verteilt und anschließend deren Position und die
 * Ergebnisse der jeweiligen Metriken für jede mögliche Kombination auf dem
 * Bildschirm ausgibt.
 */
public class Task_02_02 {

	public static void main(String[] args) {

		int size = 3;

		Random r = new Random();
		Point3D[] points = new Point3D[size];

		int dimension = 100;
		for (int i = 0; i < size; i++) {
			points[i] = new Point3D(r.nextInt(dimension), r.nextInt(dimension),
					r.nextInt(dimension));
		}

		for (int i = 0; i < size; i++) {
			if (i != ((size - 1) - i)) {
				System.out.println(points[(size - 1) - i].toString(points[i]));
			}
		}
	}
}
