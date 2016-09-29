package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CatalogBean {
	
	private List<Category> categories;
	private List<Product> products;
	Random random = new Random();
	
	public CatalogBean() {
		createCategories();
		createProducts();
	}
	
	public List<Category> getCategories() {
		return categories;
	}
	
	public List<Product> getProducts() {
		return products;
	}
	
	public String getPrice() {
		return random.nextInt(30) + ".99";
	}
	
	public String order(Order order) {
		return "Order Accepted for " + order.getQuantity() + " copies!";
	}
	
	private void createCategories() {
		categories = new ArrayList<Category>();
		categories.add(new Category(1, "rock"));
		categories.add(new Category(2, "pop"));
		categories.add(new Category(3, "party"));
		categories.add(new Category(4, "chill"));
		categories.add(new Category(5, "workout"));
	}
	
	private void createProducts() {
		products = new ArrayList<Product>();
		products.add(new Product(1, "Sir Rocks a Lot", "Rock me Beethoven", 1));
		products.add(new Product(2, "MC Sleepy Sauce", "Boring Old School Jams", 4));
		products.add(new Product(3, "Manfred Mann", "The Five Faces of Manfred Mann", 1));
		products.add(new Product(4, "Spin Class", "Woooooooh!", 5));
	}
}
