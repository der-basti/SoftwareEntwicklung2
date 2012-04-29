package sne.exercise.sheet6;

/**
 * 
 * @author sne
 * 
 */
abstract class Pet implements Comparable<Pet> {

	private String name;
	private double foodStorage;
	private int dayCount;
	private double weight;

	public Pet(String name, double weight, double foodStorage) {

		this.name = name;
		this.foodStorage = foodStorage;
		this.weight = weight;
	}

	/**
	 * Hier erfolgt zuerst der Aufruf der Methode sprich().<br/>
	 * Solange der Futtervorat reicht, wird dann die Methode friss() aufgerufen
	 * und die Anzahl der Tage hochgezählt, die der Vorrat reicht.<br/>
	 * Implementiert werden die abstrakten Methoden sprich() und friss() erst in
	 * den Subklassen.
	 */
	public void feed() {
		this.speak();
		this.dayCount = 0;
		// XXX [sne] check consumption
		while (this.foodStorage > 0) {
			this.dayCount++;
			this.eat();
		}
		this.display();
	}

	public void display() {
		StringBuilder sb = new StringBuilder();
		sb.append("\"").append(getName());
		sb.append("\" Gewicht: ").append(round(getWeight()));
		sb.append(" Futtervorrat: ").append(round(getFoodStorage()));
		sb.append(" reichte ").append(this.dayCount).append(" Tage");
		System.out.println(sb.toString());
	}

	protected double round(double value) {
		return Math.round(value * 100.) / 100.;
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
	
	@Override
	public int compareTo(Pet pet) {
		if (this.weight < pet.getWeight())
			return -1;
		else if (this.weight > pet.getWeight())
			return 1;
		return 0;
	}

	public abstract void speak();

	public abstract void eat();

	public String getName() {
		return this.name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	public double getFoodStorage() {
		return this.foodStorage;
	}

	protected void setFoodStorage(double foodStorage) {
		this.foodStorage = foodStorage;
	}

	public int getDayCount() {
		return this.dayCount;
	}

	protected void setDayCount(int dayCount) {
		this.dayCount = dayCount;
	}

	public double getWeight() {
		return weight;
	}

	protected void setWeight(double weight) {
		this.weight = weight;
	}
}
