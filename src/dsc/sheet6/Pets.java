package dsc.sheet6;

public abstract class Pets implements Comparable {
	
	private String name;
	private double foodStock;
	private int numberOfDays;
	private double weight;

	public Pets(String name, double weight, double foodStock) {
		this.name = name;
		this.weight = weight;
		this.foodStock = foodStock;
	}
	
	public void feed() {
		speak();
		while (getFoodStock() > 0) {
			eat();
			numberOfDays++;
		}
	}

	public abstract void speak();
	public abstract void eat();
	
	
	public void print() {
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[Gewicht ");
		sb.append(weight).append(" kg] ");
		sb.append(getName());
		sb.append("'s food stock lasts for ").append(numberOfDays);
		sb.append(" days.");
		return sb.toString();
	}

	public double getFoodStock() {
		return foodStock;
	}

	public void setFoodStock(double foodStock) {
		this.foodStock = foodStock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
}
