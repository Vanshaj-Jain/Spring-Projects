package com.springcore.componetannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/componetannotation/config.xml");
		Student std = context.getBean("student",Student.class);
		System.out.println(std);
		System.out.println(std.getName().getClass());
	}

}
