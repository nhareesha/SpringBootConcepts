/**
 * 
 */
package com.example.SpringBootConcept;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author Hareesha
 * Jul 6, 2017 2017
 */

public class LoadBeanBasedOnProfileTest {
	
	@Value("${param}")
	private String param;
	
	@Value("${value}")
	private String value;
	
	public String getParam() {
		return param;
	}
	public void setParam(String param) {
		this.param = param;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "LoadBeanBasedOnProfileTest [param=" + param + ", value="
				+ value + "]";
	}
	
	
}
