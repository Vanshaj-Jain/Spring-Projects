package com.jpa.test.bootjpaexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.bootjpaexample.dao.UserRepository;
import com.jpa.test.bootjpaexample.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
		User user = new User();
		user.setName("Vanshaj");
		user.setCity("Meerut");
		User save = userRepository.save(user);
		System.out.println(save);
	}

}
