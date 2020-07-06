package com.beans;

public class Address {

	public Address() {
		System.out.println("Address class constructor");
	}
	
	String landmark;

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	
}
