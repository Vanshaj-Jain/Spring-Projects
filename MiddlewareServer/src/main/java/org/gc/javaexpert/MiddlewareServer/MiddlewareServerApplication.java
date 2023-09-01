package org.gc.javaexpert.MiddlewareServer;

import org.gc.javaexpert.config.PropConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration(exclude = { org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration.class })

//@ComponentScan({ "org.gc.javaexpert", "org.gc.javaexpert.service", "org.gc.javaexpert.config",
//		"org.gc.javaexpert.MiddlewareServer" })

@ComponentScan(basePackages = { "org.gc.javaexpert", "org.gc.javaexpert.service", "org.gc.javaexpert.config",
		"org.gc.javaexpert.MiddlewareServer" }, basePackageClasses = PropConfig.class)
public class MiddlewareServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiddlewareServerApplication.class, args);
	}
}
