package com.springcore.autowire;

public class Address {
	private String name = "";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Address [name=" + name + "]";
	}
	
}
