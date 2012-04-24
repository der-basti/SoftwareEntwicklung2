package sne.exercise.sheet6;

/**
 * 
 * @author sne
 *
 */
class Cat extends Pet {

	private double consumption = 0.5;

	public Cat(String name, double foodStorage) {
		super(name, foodStorage);
	}

	@Override
	public void speak() {
		System.out.println("Miau!");
	}

	@Override
	public void eat() {
		super.setFoodStorage(super.consumption(this.consumption));

		StringBuilder sb = new StringBuilder();
		sb.append("Name: ").append(getName());
		sb.append(" current food storage: ").append(getFoodStorage());

		System.out.println(sb.toString());
	}

}
