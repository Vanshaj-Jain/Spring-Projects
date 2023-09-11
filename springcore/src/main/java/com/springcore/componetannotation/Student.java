package com.springcore.componetannotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {
	@Value("Vanshaj")
	private String name;
	@Value("25")
	private String age;
	
	@Value("#{list}")
	private List<String> list;
	
	
	public List<String> getList() {
		return list;
	}
	public Student(String name, String age, List<String> list) {
		super();
		this.name = name;
		this.age = age;
		this.list = list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", list=" + list + "]";
	}
	

}
