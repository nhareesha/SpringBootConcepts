package com.example.SpringBootConcept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootConceptApplication {

	public static void main(String[] args) {
		
		//Getting a reference to ApplicationContext
		ConfigurableApplicationContext ctx = 
				SpringApplication.run(SpringBootConceptApplication.class, args);
		
		
	}
}
