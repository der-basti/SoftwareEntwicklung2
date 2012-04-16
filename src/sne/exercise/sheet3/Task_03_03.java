package sne.exercise.sheet3;

import java.awt.Point;
import java.util.Random;

import StdLib.In;
import StdLib.StdDraw;

/**
 * Exercise sheet: 03 task: 03 <br />
 * Description:<br />
 * Entwerfen Sie einen Datentyp “RandomWalker” welcher einen Spaziergänger im
 * zweidimensionalen Raum simuliert. Der Spaziergänger beginnt seine Bewegung
 * immer an einem Urspungspunkt (z.B. [0;0]) und kann auf eine Anweisung immer
 * nur einen Schritt in eine zufällige Richtung (unten, oben, links, rechts)
 * gehen.
 * 
 * Implementieren Sie eine Methode „step()“ für die Bewegung und eine Methode
 * „distance()“ zur Berechnung der aktuellen euklidischen Entfernung vom
 * Urspungspunkt. Verwenden Sie diesen Datentyp, um eine Hypothese (d.h. eine
 * Formel in Abhängigkeit von N) zu formulieren, wie weit der Wanderer nach N
 * Schritten vom Ursprung entfernt ist. Überprüfen Sie Ihre Hypothese mit
 * einem Beispielprogramm.
 */
public class Task_03_03 {

	public static void main(String[] args) {

		Random random = new Random();
		Point start = new Point(random.nextInt(3), random.nextInt(3));
		System.out.print("How many steps: ");
		int n = new In().readInt();
		RandomWalker walker = new RandomWalker(start.x, start.y);
		
		StdDraw.setScale(-100, 100);
		StdDraw.show();		

		System.out.println("Start: x=" + walker.getInitX() + " y="
				+ walker.getInitY());
		int oldX, oldY;
		for (int i = 0; i < n; i++) {
			oldX = walker.getX();
			oldY = walker.getY();
			
			walker.step();
			
			StdDraw.line(oldX, oldY, walker.getX(), walker.getY());
		}
		
		System.out.println("End: x=" + walker.getX() + " y=" + walker.getY());
	}
}
