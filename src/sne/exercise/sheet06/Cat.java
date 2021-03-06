package sne.exercise.sheet06;

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
		System.out.println(this.toString());
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder(super.toString());
		sb.append(System.getProperty("line.separator")).append("\"")
				.append(getName());
		sb.append("\" ist eine ").append(this.attitude.getDisplay());
		sb.append(" Katze.");
		return sb.toString();
	}

	public Attitude getAttitude() {
		return this.attitude;
	}

	protected void setAttitude(Attitude attitude) {
		this.attitude = attitude;
	}

}
