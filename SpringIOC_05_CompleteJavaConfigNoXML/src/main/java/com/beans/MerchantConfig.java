package com.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = { "Data.properties" })
public class MerchantConfig {
	
	@Qualifier
	@Bean
	Merchant merchantBean() {
		return new Merchant();
	}
	
	@Bean
	Address address() {
		return new Address();
	}
	
	@Bean(value = {"m1","m2"})
	Merchant merchantB() {
		return new Merchant();
	}
}
