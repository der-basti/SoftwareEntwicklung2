package sne.exercise.sheet6;

/**
 * 
 * @author sne
 * 
 */
class Cat extends Pet {

	private double consumption = 0.5;
	private Attitude attitude;

	public Cat(String name, double weight, double foodStorage, Attitude attitude) {
		super(name, weight, foodStorage);
		this.attitude = attitude;
	}

	@Override
	public void speak() {
		System.out.println("Miau!");
	}

	@Override
	public void eat() {
		setFoodStorage(consumption(this.consumption));

		StringBuilder sb = new StringBuilder();
		sb.append(getName()).append(": ").append(round(getFoodStorage()));
		System.out.println(sb.toString());
	}

	@Override
	public void display() {
		super.display();
		StringBuilder sb = new StringBuilder();
		sb.append("\"").append(getName());
		sb.append("\" ist eine ").append(this.attitude.getDisplay());
		sb.append(" Katze.");
		System.out.println(sb.toString());
	}

	public Attitude getAttitude() {
		return this.attitude;
	}

	protected void setAttitude(Attitude attitude) {
		this.attitude = attitude;
	}

}
