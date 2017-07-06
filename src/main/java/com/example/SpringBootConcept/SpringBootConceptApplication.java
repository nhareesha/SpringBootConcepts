package com.example.SpringBootConcept;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
@Configuration
@EnableConfigurationProperties
public class SpringBootConceptApplication {

	@Value("${myapp-name}")
	String name;
	public static void main(String[] args) {
		//Getting a reference to ApplicationContext
		ConfigurableApplicationContext ctx = 
				SpringApplication.run(SpringBootConceptApplication.class, args);
		
		UserDetailsBean bean = 
				(UserDetailsBean) ctx.getBean("userDetailsBean");
		System.out.println(bean.toString());
		
		//getting value from application.proeprty file
		SpringBootConceptApplication app = (SpringBootConceptApplication)ctx.getBean("springBootConceptApplication");
		System.out.println(app.name);
	}
}
