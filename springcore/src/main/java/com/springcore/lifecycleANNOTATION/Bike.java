package com.springcore.lifecycleANNOTATION;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Bike {
	private String price;

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Bike [price=" + price + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Entered Start");//to enable the above annotation we need to make an entry in config.xml
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Ended");
	}
	
}
