package sne.exercise.sheet5;

class SpecialItem extends Product {

	private double discount;

	public SpecialItem(String productId, String description, double cost,
			int storageTime) {

		super(productId, description, cost, storageTime);
		if (super.getStorageTime() > 12) {
			this.discount = 0.30;
		} else {
			this.discount = 0.10;
		}
	}

	public SpecialItem(Product product) {

		this(product.getProductId(), product.getDescription(), product
				.getCost(), product.getStorageTime());
	}

	public static SpecialItem getSpecialItem(Product product) {

		return new SpecialItem(product.getProductId(),
				product.getDescription(), product.getCost(),
				product.getStorageTime());
	}

	public SpecialItem(String productId, String description, double cost,
			int storageTime, double discount) {
		super(productId, description, cost, storageTime);
		this.discount = discount;
	}

	@Override
	public int calcRetailPrice() {
		return new Double(super.calcRetailPrice() * (1 - this.discount))
				.intValue();
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder("Sonderposten:");
		sb.append(System.getProperty("line.separator"))
				.append(super.getProductId()).append(" ");
		sb.append("\"").append(super.getDescription()).append("\" ");
		sb.append("cost:").append(super.getCost()).append("€ ");
		sb.append("retail price:").append(this.calcRetailPrice()).append("€ ");
		sb.append("storage time:").append(super.getStorageTime())
				.append(" months");
		sb.append(System.getProperty("line.separator")).append("(");
		sb.append("old retail price:").append(super.calcRetailPrice())
				.append("€ ");
		sb.append("discount:").append(this.discount * 100).append("%");
		return sb.append(")").toString();
	}

	public double getDiscount() {
		return this.discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
}
