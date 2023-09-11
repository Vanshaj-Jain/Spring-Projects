package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//This file if used without componentScans. Will remove Component annotation. Object will be directly called in this file using @Bean annotation 
@Configuration
public class JavaConfig2 {
	
	@Bean(name = {"getMarks","temp"})//any number of names can be given here to refer to this method
	public Student getMarks() {
		Student student = new Student();
		return student;
	}
}
