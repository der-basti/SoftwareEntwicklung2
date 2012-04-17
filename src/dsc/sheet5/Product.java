package dsc.sheet5;

public class Product {
	
	protected String productId, productName;
	protected int storageTime;
	protected double cost;
	protected final double VAT = 0.19;
	protected final double MARGIN = 0.6;
	
	public Product(String productId, String productName, double cost, int storageTime) {
		this.productId = productId;
		this.productName = productName;
		this.cost = cost;
		this.storageTime = storageTime;
	}
	
	public void print() {
		System.out.println(this);
	}
	
	public int calculatePrice() {
		return (int) ((this.cost + this.cost * this.MARGIN) * (1 + this.VAT));
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(this.productId);
		sb.append(" ").append('"').append(this.productName).append("\" ");
		sb.append("EK: ").append(this.cost).append(" Euro ");
		sb.append("VK: ").append(calculatePrice()).append(" Euro ");
		sb.append("Storage Time: ").append(this.storageTime).append(" months");
		return sb.toString();
	}

	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getStorageTime() {
		return this.storageTime;
	}

	public void setStorageTime(int storageTime) {
		this.storageTime = storageTime;
	}

	public double getCost() {
		return this.cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
}
