package com.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.beans.Merchant;
import com.beans.MerchantConfig;

public class ClientTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MerchantConfig.class);
	        
		Merchant merchant = (Merchant) ctx.getBean("merchantBean");
		System.out.println(merchant.businessName);
		System.out.println(merchant.address.OffAddress);
		
		
		Merchant m= ctx.getBean("m2",Merchant.class);
		System.out.println(m.businessName);
	}
}
