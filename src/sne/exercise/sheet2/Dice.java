package sne.exercise.sheet2;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Dice {

	private Map<Integer, String> cube;
	private int result;

	public Dice() {

		this.cube = new HashMap<Integer, String>();
		this.cube.put(Integer.valueOf(1), "eins");
		this.cube.put(Integer.valueOf(2), "zwei");
		this.cube.put(Integer.valueOf(3), "drei");
		this.cube.put(Integer.valueOf(4), "vier");
		this.cube.put(Integer.valueOf(5), "fünf");
		this.cube.put(Integer.valueOf(6), "sechs");
	}

	/**
	 * Roll the dice.
	 */
	public void roll() {
		this.result = finalRoll(1);
	}
	
	/**
	 * Roll the dice x times.
	 * @param count
	 * @return sum
	 */
	public int roll(int count) {
		this.result = finalRoll(count);
		return this.result;
	}
	
	/**
	 * The master roll method.
	 * @param count
	 * @return sum
	 */
	private int finalRoll(int count) {
		cleanResult();
		for (int i = 0; i < count; i++) {
			this.result += new Random().nextInt(5) + 1;
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
