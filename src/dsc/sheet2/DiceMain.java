package dsc.sheet2;

import StdLib.StdOut;

public class DiceMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int N = Integer.parseInt(args[0]);
		int sum = 0;

		Dice dice[] = new Dice[N];
		for (int i = 0; i < N; i++) {
			dice[i] = new Dice();
		}

		for (int i = 0; i < N; i++) {
			sum = sum + dice[i].rollDice();
		}

		StdOut.print(sum);
	}
}
