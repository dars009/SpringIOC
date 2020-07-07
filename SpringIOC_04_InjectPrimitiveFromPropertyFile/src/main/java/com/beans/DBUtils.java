package com.beans;

import org.springframework.beans.factory.annotation.Value;

public class DBUtils {
	
	@Value("${DBUser}")
	public String userName;
	
	@Value("${DBPort}")
	String portNo;

}
