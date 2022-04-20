package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoGApplication {

	public static void main(String[] args) {
		  ConfigurableApplicationContext  context = SpringApplication.run(DemoGApplication.class, args);
	connect c =	  context.getBean(connect.class);
	c.connectt();
	connect c1 = context.getBean(connect.class);
	c.connectt();
	}

}
