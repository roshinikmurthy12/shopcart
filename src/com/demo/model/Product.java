package com.demo.model;

public class Product {

	private int id;
	private String name;
	private double price;
	private String seller;
	
	public Product() {
		
	}
	
	/**
	 * @param name
	 * @param price
	 * @param seller
	 */
	public Product(String name, double price, String seller) {
		this.name = name;
		this.price = price;
		this.seller = seller;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getSeller() {
		return seller;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", seller=" + seller + "]";
	}
	
}
