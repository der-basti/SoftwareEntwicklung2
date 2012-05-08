package dsc.sheet5;

public class SpecialItem extends Product {

	private double discount;

	public SpecialItem(String productId, String productName, double cost,
			int storageTime) {
		super(productId, productName, cost, storageTime);
		if (storageTime <= 12)
			this.discount = 0.1;
		else
			this.discount = 0.3;
	}
	
	@Override
	public int calculatePrice() {
		return (int) (super.calculatePrice() * (1 - discount));
	}
	
	@Override
	public void print() {
		System.out.println("Sonderposten: ");
		super.print();
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(productId);
		sb.append(" ").append('"').append(this.productName).append("\" ");
		sb.append("EK: ").append(this.cost).append(" Euro ");
		sb.append("VK: ").append(calculatePrice()).append(" Euro ");
		sb.append("Stored: ").append(this.storageTime).append(" months ");
		sb.append("VK <old>: ").append(super.calculatePrice()).append(" Euro; ");
		sb.append("Discount: ").append(this.discount * 100).append(" % ");
		return sb.toString();
	}
	
	public double getDiscount() {
		return this.discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	

}
