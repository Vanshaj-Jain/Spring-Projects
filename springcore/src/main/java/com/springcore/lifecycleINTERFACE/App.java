package com.springcore.lifecycleINTERFACE;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycleINTERFACE/config.xml");
		Scooter s1 = (Scooter) context.getBean("lifecycle");
		System.out.println(s1);
		context.registerShutdownHook();
	}
}
