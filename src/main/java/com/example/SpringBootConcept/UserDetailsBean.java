/**
 * 
 */
package com.example.SpringBootConcept;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Hareesha
 * Jul 5, 2017
 */

//Adding this annotaions lets Spring picks up this class
@Component

//Addng this enable the mapping of variables of POJO to aplication.properties file
@ConfigurationProperties(prefix="test")
public class UserDetailsBean {
	
	String name;
	String psw;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	
	@Override
	public String toString() {
		return "UserDetailsBean [name=" + name + ", psw=" + psw + "]";
	}
	

}
