package com.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Merchant {

	@Value("${officeNo}")
	public String merchantOffice;
	
	@Value("${businessName}")
	public String businessName;
	
	@Autowired
	public Address address;

	@Override
	public String toString() {
		return "Merchant [merchantOffice=" + merchantOffice + ", businessName=" + businessName + ", address=" + address
				+ "]";
	}

	

	
}
