package com.springcore.autowire.anotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	@Autowired
	@Qualifier("address1w")
	private Address address;

	public Address getAddress() {
		return address;
	}
	
	/*@Autowired*/
	public void setAddress(Address address) {
		System.out.println("Entered in setter method");
		this.address = address;
	}
	/*@Autowired*/
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(Address address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}
	
}
