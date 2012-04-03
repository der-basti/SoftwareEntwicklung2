package dsc.sheet2;

import java.util.Random;
import StdLib.*;

public class exercise2_Point3D {

	/**
	 * Erstellen Sie einen Datentyp „Point3D“ für Punkte im dreidimensionalen
	 * Raum. Ergänzen Sie den Datentyp um einen Konstruktor mit drei
	 * ganzzahligen Parametern für die Position des Punktes auf den Achsen X, Y
	 * und Z. Fügen Sie des Weiteren drei Methoden zur Berechnung des
	 * Euklidischen Abstandes, des Quadrierten Euklidischen Abstandes und der
	 * Manhattan-Metrik zwischen zwei Punkten hinzu. Ermöglichen Sie es, die
	 * aktuelle Position eines Punktes uebersichtlich auf dem Bildschirm
	 * ausschreiben zu können. 
	 * 
	 * Schreiben Sie ein Programm welches drei Punkte
	 * zufällig im Raum (Dimension 0 bis 100 in jeder Achse) verteilt und
	 * anschließend deren Position und die Ergebnisse der jeweiligen Metriken
	 * für jede mögliche Kombination auf dem Bildschirm ausgibt.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int N = Integer.parseInt(args[0]);
		Random r = new Random();
		
		Point3D point[] = new Point3D[N];
		for(int i = 0; i < N; i++) {
			point[i] = new Point3D(r.nextInt(101), r.nextInt(101), r.nextInt(101));
		}
		
		for(int i = 0; i < N; i++) {
			StdOut.println("Point " + (i + 1) + point[i].toString());
		}
		
		StdOut.println("");
		StdOut.println("Euclidean Distance from Point 1 to Point 2 is " + point[0].euclideanDistance(point[1]));
		StdOut.println("Euclidean Distance from Point 1 to Point 3 is " + point[0].euclideanDistance(point[2]));
		StdOut.println("Euclidean Distance from Point 2 to Point 3 is " + point[1].euclideanDistance(point[2]));
		StdOut.println("");
		StdOut.println("Quadratic Euclidean Distance from Point 1 to Point 2 is " + point[0].quadraticEuclideanDistance(point[1]));
		StdOut.println("Quadratic Euclidean Distance from Point 1 to Point 3 is " + point[0].quadraticEuclideanDistance(point[2]));
		StdOut.println("Quadratic Euclidean Distance from Point 2 to Point 3 is " + point[1].quadraticEuclideanDistance(point[2]));
		StdOut.println("");
		StdOut.println("Taxicab Distance from Point 1 to Point 2 is " + point[0].taxicabDistance(point[1]));
		StdOut.println("Taxicab Distance from Point 1 to Point 3 is " + point[0].taxicabDistance(point[2]));
		StdOut.println("Taxicab Distance from Point 2 to Point 3 is " + point[1].taxicabDistance(point[2]));
	
		
//		for(int i = 0; i < N - 1; i++) {
//			StdOut.println("Euclidean Distance from Point" + (i + 1) + " to Point" + (i + 2) + " is " + point[i].euclideanDistance(point[i+1]));
//		}
	}
}
