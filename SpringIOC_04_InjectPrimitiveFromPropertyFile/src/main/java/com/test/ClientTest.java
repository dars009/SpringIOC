package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.DBUtils;
import com.beans.MailUtil;

public class ClientTest {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/resource/Spring.xml");
		DBUtils dbu = (DBUtils) ctx.getBean("dbUtil");
		System.out.println(dbu.userName);
		
		MailUtil mailUtil= (MailUtil) ctx.getBean("mailUtil");
		System.out.println(mailUtil.mailId);
		
		
	}
}
