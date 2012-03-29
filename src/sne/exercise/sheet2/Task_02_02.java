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

		Random r = new Random();
		Point3D[] points = new Point3D[3];
		points[0] = new Point3D(r.nextInt(100), r.nextInt(100), r
				.nextInt(100));
		points[1] = new Point3D(r.nextInt(100), r.nextInt(100), r
				.nextInt(100));
		points[2] = new Point3D(r.nextInt(100), r.nextInt(100), r
				.nextInt(100));
		
		int count = points.length;
		for (int i = 0; i<points.length; i++) {
			if ((count - i) != i) {
				points[count - i].distanceEuklidisch(points[i]);
				// TODO [sne] finsihed
				//points[count - i].distanceEuklidischQuad(points[i]);
				//points[count - i].distanceManhattanMetrik(points[i]);
				// TODO [sne] fooo
				points.toString();
			}
		}
	}
}
