package dsc.sheet6;

public class Dog extends Pets {

	private String category;

	public Dog(String name, double weight, double foodStock, int category) {
		super(name, weight, foodStock);
		switch (category) {
		case 1:
			this.category = "small dogs";
			break;
		case 2:
			this.category = "medium dogs";
			break;
		case 3:
			this.category = "large dogs";
			break;
		default:
			throw new IllegalArgumentException(
					"Please choose a category between 1, 2 and 3.");
		}
	}

	@Override
	public void speak() {
		System.out.println("Wuff!");
	}

	@Override
	public void eat() {
		System.out.println(getName() + ": " + getFoodStock());
		if (category == "small dogs") {
			setFoodStock(getFoodStock() - 1);
		} else if (category == "medium dogs") {
			setFoodStock(getFoodStock() - 1.5);
		} else if (category == "large dogs") {
			setFoodStock(getFoodStock() - 2);
		}
	}

	@Override
	public void print() {
		System.out.print("(category: " + category + ") ");
		super.print();
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
