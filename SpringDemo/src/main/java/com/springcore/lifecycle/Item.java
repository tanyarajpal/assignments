package com.springcore.lifecycle;

public class Item {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(double price) {
		super();
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("Welcome, inside init method");
	}
	
	public void destroy() {
		System.out.println("Work done, inside destroy method");
	}
}
