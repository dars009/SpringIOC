package com.beans;

import org.springframework.beans.factory.annotation.Value;

public class Address {
	
	@Value("${OffAddress}")
	public String OffAddress;

	@Override
	public String toString() {
		return "Address [OffAddress=" + OffAddress + "]";
	}
	
}
