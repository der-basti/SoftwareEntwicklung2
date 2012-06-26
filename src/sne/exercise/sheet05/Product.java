package sne.exercise.sheet05;

class Product {

	private double margin = 0.6;
	private double vat = 0.19;

	private String productId;
	private String description;
	private double cost;
	private int storageTime;

	public Product(String productId, String description, double cost,
			int storageTime) {
		this.productId = productId;
		this.description = description;
		this.cost = cost;
		this.storageTime = storageTime;
	}

	public void show() {
		System.out.println(this);
	}

	public int calcRetailPrice() {
		return (int) calcVAT(this.cost + calcMargin(this.cost));
	}

	private double calcVAT(double value) {
		return value * (1 + this.vat);
	}

	private double calcMargin(double cost) {
		return cost * this.margin;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(this.productId).append(" ");
		sb.append("\"").append(this.description).append("\" ");
		sb.append("cost:").append(this.cost).append("€ ");
		sb.append("retail price:").append(calcRetailPrice()).append("€ ");
		sb.append("storage time:").append(this.storageTime).append(" months");
		return sb.toString();
	}

	public double getMargin() {
		return this.margin;
	}

	protected void setMargin(double margin) {
		this.margin = margin;
	}

	public double getVAT() {
		return this.vat;
	}

	protected void setVAT(double vat) {
		this.vat = vat;
	}

	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getCost() {
		return this.cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getStorageTime() {
		return this.storageTime;
	}

	public void setStorageTime(int storageTime) {
		this.storageTime = storageTime;
	}
}
