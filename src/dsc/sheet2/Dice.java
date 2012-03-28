package dsc.sheet2;

import java.util.Random;

public class Dice {
	
	public void roll() {
		rollDice();
	}
	
	public int rollDice() {
		Random r = new Random();
		return r.nextInt(6) + 1;
	}
}
