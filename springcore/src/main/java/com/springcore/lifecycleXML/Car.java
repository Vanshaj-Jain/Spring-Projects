package com.springcore.lifecycleXML;

public class Car {
	private String price;

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		System.out.println("Setting Price");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [price=" + price + "]";
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void init() {
		System.out.println("Init Method");
	}
	
	public void destroy() {
		System.out.println("Destroy Method");
	}
	
}
