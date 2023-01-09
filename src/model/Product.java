package model;

public class Product {
	private String name;
	private int amount;
	private String unit;
	private int tolerance;
	private double price;
	private String id;
	
	public Product(String name, int amount, String unit, int tolerance, double price, String id) {
		this.name = name;
		this.amount = amount;
		this.price = price;
		this.id = id;
	}
	public Product(String name, int amount, String unit, int tolerance) {
		this.name = name;
		this.amount = amount;
		this.price = 0;
		this.id = "";
	}
	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}



	

}
