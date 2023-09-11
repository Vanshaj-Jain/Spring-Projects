package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		/*ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Student student = context.getBean("firstStudent",Student.class);*/
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig2.class);
		Student student = context.getBean("temp",Student.class);
		System.out.println(student);
		

	}

}
