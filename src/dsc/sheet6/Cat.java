package dsc.sheet6;

public class Cat extends Pets {
	
	private String keeping;

	public Cat(String name, double weight, double foodStock, int keeping) {
		super(name, weight, foodStock);
		switch (keeping) {
		case 1:
			this.keeping = "apartment";	
			break;
		case 2:
			this.keeping = "species-appropriate";
			break;
		default:
			throw new IllegalArgumentException("Please choose between 1 an 2.");
		}
	}

	@Override
	public void speak() {
		System.out.println("Meow!");
	}

	@Override
	public void eat() {
		System.out.println(getName() + ": " + getFoodStock());
		setFoodStock(getFoodStock() - 0.5);
	}
	
	@Override
	public void print() {
		System.out.print("(art of keeping: " + keeping + ") " );
		super.print();
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
