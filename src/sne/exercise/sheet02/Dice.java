package sne.exercise.sheet02;

import java.util.Random;

/**
 * Dice the dice.
 */
class Dice {

	private int result;

	/**
	 * Roll the dice.
	 */
	public void roll() {
		this.result = finalRoll(1);
	}

	/**
	 * Roll the dice x times.
	 * 
	 * @param count
	 * @return sum
	 */
	public int roll(int count) {
		this.result = finalRoll(count);
		return this.result;
	}

	/**
	 * The master roll method.
	 * 
	 * @param count
	 * @return sum
	 */
	private int finalRoll(int count) {
		cleanResult();
		for (int i = 0; i < count; i++) {
			this.result += new Random().nextInt(6) + 1;
		}
		return this.result;
	}

	/**
	 * Clean the result value for a clean restart.
	 */
	private void cleanResult() {
		this.result = 0;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder("Result: ");
		sb.append(this.result);
		return sb.toString();
	}
}
