package com.example.SpringBootConcept;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Hareesha
 * Jul 6, 2017
 */

@RestController
public class HomeController {
	
	//this will be read from the application.property file
	@Value("${spring.profiles.active}")
	private String currentActiveProfile;
	
	@Value("${msg}")
	private String profileMsg;
	
	//this is autowired as , this is registered as @Bean in AppConfig class, a configuration class
	@Autowired
	private LoadBeanBasedOnProfileTest pf;
	
	@RequestMapping("/")
	public String testProfile(){
		String res = currentActiveProfile+"-->"+profileMsg;
		return res;
	}
	
	@RequestMapping("/profiles")
	public String loadBeanProfileTest(){
		return pf.toString();
	}
}
