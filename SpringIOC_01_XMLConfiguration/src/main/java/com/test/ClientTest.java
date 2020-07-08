package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Address;
import com.beans.Car;
import com.beans.Student;

public class ClientTest {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/resource/Spring.xml");
		Student student = (Student) ctx.getBean("stu");
		System.out.println(student);
		System.out.println(student.getAddress());
		System.out.println(student.getAddress().getLandmark());
		System.out.println(student.getMobileNos());
		
		Car car= (Car) ctx.getBean("car");
		car.printData();
		System.out.println("================ car1");
		Car car1= (Car) ctx.getBean("car1");
		car1.printData();
		
		
	}
}
