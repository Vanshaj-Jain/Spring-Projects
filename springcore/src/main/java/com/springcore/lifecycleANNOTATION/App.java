package com.springcore.lifecycleANNOTATION;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycleANNOTATION/config.xml");
		Bike bike = context.getBean("lifecycle",Bike.class);
		System.out.println(bike);
		context.registerShutdownHook();
	}
}
