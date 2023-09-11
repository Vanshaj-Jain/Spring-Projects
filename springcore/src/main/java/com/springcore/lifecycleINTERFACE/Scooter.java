package com.springcore.lifecycleINTERFACE;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Scooter implements InitializingBean,DisposableBean{
	private String price;

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Scooter [price=" + price + "]";
	}

	public Scooter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void afterPropertiesSet() throws Exception {//this method will work as init method
		// TODO Auto-generated method stub
		System.out.println("in init method");
	}

	public void destroy() throws Exception {//this method works as destroy method
		// TODO Auto-generated method stub
		System.out.println("in destroy method");
	}
	
}
