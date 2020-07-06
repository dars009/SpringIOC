package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Address;
import com.beans.Student;

public class ClientTest {

	public static void main(String[] args) {

		
		// Autowired byNname 
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("com/resource/SpringByName.xml");
		
		// Aytiwired byType
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/resource/SpringByType.xml");
		
		
		Student student = (Student) ctx.getBean("stu");
		System.out.println(student);
		System.out.println(student.getAddress());
		System.out.println(student.getAddress().getLandmark());
		System.out.println(student.getMobileNos());

		/*
		 * Student ss= new Student(); Student ss1= new Student();
		 */
		
	}
}
