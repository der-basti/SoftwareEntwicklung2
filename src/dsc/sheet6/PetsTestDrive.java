package dsc.sheet6;

import java.util.Arrays;

public class PetsTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Dog brian = new Dog("Brian", 75, 5, 3);
		Cat minka = new Cat("Minka", 20, 5, 2);
		
		brian.feed();
		brian.print();
		System.out.println();
		minka.feed();
		minka.print();
		
		Pets[] pets = new Pets[5];
		
		pets[0] = new Cat("Minka", 3.5, 1, 1);
		pets[1] = new Dog("Rambo", 75, 9, 3);
		pets[2] = new Dog("Fibi", 25.5, 4, 2);
		pets[3] = new Cat("Morle", 4, 1.5, 2);
		pets[4] = new Dog("Lotti", 6.5, 3, 1);
	
		
//		for (int i = 0; i < pets.length; i++) {
//			if (new Random().nextBoolean()) {
//				pets[i] = new Dog("Brian", 5, 75,  new Random().nextInt(3) + 1);
//			} else {
//				pets[i] = new Cat("Minka", 5, 20,  new Random().nextInt(2) + 1);
//			}
//		}

		for (int i = 0; i < pets.length; i++) {
			pets[i].feed();
			pets[i].print();
		}
		
		System.out.println("\n Unsortiert:");
		for (int i = 0; i < pets.length; i++) {
			pets[i].print();
		}
		
		Arrays.sort(pets);
		
		System.out.println("\n Sortiert:");
		for (int i = 0; i < pets.length; i++) {
			pets[i].print();
		}
		
	}
}
