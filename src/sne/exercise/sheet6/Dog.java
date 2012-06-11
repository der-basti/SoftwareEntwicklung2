package sne.exercise.sheet6;

class Dog extends Pet {

	private double consumption;
	private Category category;

	public Dog(String name, double weight, double foodStorage, Category category) {
		super(name, weight, foodStorage);
		this.category = category;
		switch (this.category) {
		case BIG_DOG:
			this.consumption = 2.0;
			break;
		case MIDDLE_DOG:
			this.consumption = 1.5;
			break;
		case SMALL_DOG:
			this.consumption = 1.0;
			break;
		default:
			throw new IllegalArgumentException("Unkown category");
		}
	}

	@Override
	public void speak() {
		System.out.println("Wuff!");
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
		sb.append("\" ist ein ").append(this.category.getDisplay());
		return sb.toString();
	}

	public Category getCategory() {
		return this.category;
	}

	protected void setCategory(Category category) {
		this.category = category;
	}
}
