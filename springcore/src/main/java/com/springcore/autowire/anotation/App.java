package com.springcore.autowire.anotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowire/anotation/config.xml");
		Student student = context.getBean("student",Student.class);
		System.out.println(student);
	}
}
