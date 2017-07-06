/**
 * 
 */
package com.example.SpringBootConcept;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author Hareesha
 * Jul 6, 2017
 */
@Configuration
public class AppConfig {
	
	@Bean
	@Profile("development")
	public LoadBeanBasedOnProfileTest loadDevBean(){
		return new LoadBeanBasedOnProfileTest();
	}
	
	@Bean
	@Profile("prod")
	public LoadBeanBasedOnProfileTest loadProdBean(){
		return new LoadBeanBasedOnProfileTest();
	}
}
