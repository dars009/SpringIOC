package com.beans;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Student {

	@Autowired
	@Qualifier(value = "address1")
	Address address;
	
	int age;
	ArrayList<String> mobileNos;

	public Address getAddress() {
		return address;
	}

	/*
	public void setAddress(Address address) { this.address = address; }
	*/
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public ArrayList<String> getMobileNos() {
		return mobileNos;
	}

	public void setMobileNos(ArrayList<String> mobileNos) {
		this.mobileNos = mobileNos;
	}

}
