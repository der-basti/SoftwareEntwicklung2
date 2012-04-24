package sne.exercise.sheet6;

/**
 * 
 * @author sne
 *
 */
abstract class Pet {

	private String name;
	private double foodStorage;
	private int dayCount;

	public Pet(String name, double foodStorage) {

		this.name = name;
		this.foodStorage = foodStorage;
	}

	public void feed() {
		this.speak();
		this.eat();
	}

	public void display() {
		StringBuilder sb = new StringBuilder();

		System.out.println(sb.toString());
		// zeigt den Namen des Haustiers an und wie viele Tage der
		// Futtervorrat reicht
	}

	/**
	 * Help method, which return the foodStorage.
	 * 
	 * @param consumptionValue
	 * @return new foodStorage
	 */
	protected double consumption(double consumptionValue) {
		return this.foodStorage -= consumptionValue;
	}

	public abstract void speak();

	public abstract void eat();

	protected String getName() {
		return this.name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected double getFoodStorage() {
		return this.foodStorage;
	}

	protected void setFoodStorage(double foodStorage) {
		this.foodStorage = foodStorage;
	}

	protected int getDayCount() {
		return this.dayCount;
	}

	protected void setDayCount(int dayCount) {
		this.dayCount = dayCount;
	}
}
