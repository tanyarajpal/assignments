package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SecondItem implements InitializingBean, DisposableBean {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setting seconditem price");
		this.price = price;
	}

	public SecondItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "SecondItem [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Welcome , initilization done");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Work done, detroying bean");
		
	}
}
