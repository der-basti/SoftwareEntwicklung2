package sne.exercise.sheet6;

/**
 * 
 * @author sne
 *
 */
class Dog extends Pet {

	private double consumption = 1.0;

	public Dog(String name, double foodStorage) {
		super(name, foodStorage);
	}

	@Override
	public void speak() {
		System.out.println("Wuff!");
	}

	@Override
	public void eat() {
		setFoodStorage(consumption(this.consumption));

		StringBuilder sb = new StringBuilder();
		sb.append("Name: ").append(getName());
		sb.append(" current food storage: ").append(getFoodStorage());

		System.out.println(sb.toString());
	}

}
