package model;

import java.util.ArrayList;

public class Order{
	private Customer customer;
	private Customer seller;
	private Product product;
	private String date;
	private int orderNumber;
	
	public Order(Customer customer, Customer seller, Product product) {
		this.setProduct(product);
		this.customer = customer;
		this.seller = seller;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Customer getSeller() {
		return seller;
	}

	public void setSeller(Customer seller) {
		this.seller = seller;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
