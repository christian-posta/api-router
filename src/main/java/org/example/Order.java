package org.example;

public class Order {

	private int id;
	private int productId;
	private int quantity;
	
	Order() {
		
	}
	
	Order(int id, int productId, int quantity) {
		this.id = id;
		this.setProductId(productId);
		this.setQuantity(quantity);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
