package sne.exercise.sheet7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Exercise sheet: 07 task: 02 <br />
 * Description:<br />
 * Implementieren Sie die Algorithmen für das sequentielle und das binäre
 * Suchen. Füllen Sie ein Feld mit 1.000.000 Zahlen (beginnend bei 0) in
 * aufsteigender Reihenfolge. Suchen Sie dann in dem Feld nach einer Zufallszahl
 * zwischen 0 und 1.000.000 unter Verwendung beider Verfahren. Wiederholen Sie
 * dies 1.000, 10.000, 100.000, 500.000 und 1 Million Mal und messen Sie die
 * jeweils insgesamt benötigte Zeit in Millisekunden. (Passen Sie die Anzahl
 * der Wiederholungen ggf. auf ein Ihrer Hardware entsprechendes Maß an.)<br />
 * <br />
 * Vergleichen Sie die erzielten Werte tabellarisch und in einem Diagramm.
 * Welchen Effizienzunterschied können Sie beobachten? Warum? Zeigen Sie Ihre
 * Ergebnisse mittels einer kurzen Präsentation (PowerPoint). <br />
 * Tipp: Die bekannte Methode Math.random() und die Klasse Stopwatch aus der
 * Hilfsbibliothek könnten Ihnen sehr behilflich sein.
 */
public class Task_02 {

	private static long time;

	public static void main(String[] args) {

		List<Integer> list = fill();

		System.out.println("filled");
		
		startTime();
		// 1.000, 10.000, 100.000, 500.000 und 1 Mil
		int repeat = 30000;
		for (int i = 0; i< repeat; i++) {
			sequentialSearch(randomMillion(), list);
		}
		stopTime("sequential search " + repeat + " repeats");
		
		startTime();
		for (int i = 0; i< repeat; i++) {
			binarySearch(randomMillion(), list);
		}
		stopTime("binary search "+repeat + " repeats");
	}

	private static List<Integer> fill() {

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i <= 1000000; i++) {
			list.add(Integer.valueOf(i));
		}
		return list;
	}

	private static boolean sequentialSearch(int value, List<Integer> list) {

//		for (Integer i : list) { // Object obj : list
//			if (i.intValue() == value) { // obj.equals(value)
//				return true;
//			}
//		}
		for (Object obj : list) {
			if (obj.equals(value)) {
				return true;
			}
		}
		System.err.println("fail");
		return false;
	}

	private static boolean binarySearch(int value, List<Integer> list) {

		int m, li = 0, re = list.size() + 1;
		while (li < re - 1) {
			m = (li + re) / 2;
			if (value < list.get(m)) {
				re = m;
			} else if (value > list.get(m)) {
				li = m;
			} else {
				return true;
			}
		}
		return false;
	}

	private static Integer randomMillion() {

		return new Random().nextInt(1000000);
	}

	private static void startTime() {

		time = System.currentTimeMillis();
	}

	private static void stopTime(String text) {

		long tmpTime = System.currentTimeMillis();
		System.out.println(text + " = " + (tmpTime - time) + " ms");
	}
}
