package com.springcore.standalonecollection;

import java.util.List;

public class Student {
	private List<String> name;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<String> getName() {
		return name;
	}

	public void setName(List<String> name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

	public Student(List<String> name) {
		super();
		this.name = name;
	}
}
