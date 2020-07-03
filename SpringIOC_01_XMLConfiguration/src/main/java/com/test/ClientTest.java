package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Address;
import com.beans.Student;

public class ClientTest {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/resource/Spring.xml");
		Student student = (Student) ctx.getBean("stu");
		System.out.println(student);
		System.out.println(student.getAddress());
		System.out.println(student.getAddress().getLandmark());
		System.out.println(student.getMobileNos());

	}
}
