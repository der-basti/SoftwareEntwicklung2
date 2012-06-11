package sne.exercise.sheet7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Exercise sheet: 07 task: 03 <br />
 * Description:<br />
 * 
 */
public class Task_03 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i <= 10; i++) {
			list.add(new Random().nextInt(10));
		}

		// find position of max value
		System.out.println("orginal position:" + orginal(list));
		System.out.println("rekursiv position" + recursiv(list, 0, list.size()));
	}

	/**
	 * Eingabe: k1, k2, ..., kc ∈ {0, 1, 2, ...}<br />
	 * a := 0;<br />
	 * b := 1;<br />
	 * WHILE  b  ≤  c  DO<br />
	 * IF kb ≥  a  THEN<br />
	 * a := kb;<br />
	 * d := b;<br />
	 * END<br />
	 * IF; b := b + 1;<br />
	 * END WHILE;<br />
	 * Ausgabe: d
	 */
	private static int orginal(List<Integer> list) {

		int listLength = list.size(); // old c
		int maxValue = 0; // old a
		int currentPosition = 0; // old b - is zero based
		int maxValuePosition = -1; // old d
		while (currentPosition < listLength) {
			if (list.get(currentPosition) >= maxValue) {
				maxValue = list.get(currentPosition);
				maxValuePosition = currentPosition;
			}
			currentPosition = currentPosition + 1;
		}
		return maxValuePosition;
		// endlich - feld wird durchlaufen
		// determiniert - gleiche Eingabe - gleiche Ausgabe
		// deterministisch - 
	}

	private static int recursiv(List<Integer> list, int a, int n) {

		// TODO das selbe leistet
		
//		return a >= list.size() ? n : Math.max(n,
//				recursiv(list, a + 1, list.get(a) > n ? list.get(a) : n));
		return 0;
	}
}
