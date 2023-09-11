package com.springcore.lifecycleXML;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycleXML/config.xml");
		
		Car c1 = (Car) context.getBean("lifecycle");
		System.out.println(c1);
		
		context.registerShutdownHook();//this is used to run destroy method
	}
}
