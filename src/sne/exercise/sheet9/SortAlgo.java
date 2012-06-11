package sne.exercise.sheet9;

import java.util.Arrays;
import java.util.Random;

public class SortAlgo {

	public static void main(String[] args) {

		int[] list = new int[] { 3, 7, 1, 5, 9 };

		System.out.println("unsorted: " + Arrays.toString(list));

		System.out.println("bubble sort: " + Arrays.toString(bubbleSort(list)));
	}

	public static int[] bubbleSort(int[] list) {

		int temp;
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list.length - 1 - i; j++) {
				if (list[j] > list[j + 1]) {
					temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
				}
			}
		}
		return list;
	}

	protected static int[] generateUnsortedArray(int count) {

		int[] array = new int[count];
		for (int i = 0; i < count - 1; i++) {
			array[i] = new Random().nextInt(100);
		}
		return array;
	}

	// void InsertionSortName() {
	// for (int i = 1; i < 14; i++) {
	// int wert = feldName[i];
	// int id = i - 1;
	// while ((id >= 0) && (wert < feldName[id])) {
	// feldName[id + 1] = feldName[id];
	// id--;
	// }
	// feldName[id + 1] = wert;
	// }
	// }

	// void SelectionSortName() {
	// for (int x = 0; x < 14 - 1; x++) {
	// int pos = x;
	// int min = feldName[x];
	// for (int i = x + 1; i < 14; i++) {
	// if (min > feldName[i]) {
	// min = feldName[i];
	// pos = i;
	// }
	// }
	// feldName[pos] = feldName[x];
	// feldName[x] = min;
	// }
	// }

}
