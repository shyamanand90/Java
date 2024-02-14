package com.java.inheritance;

public class Second extends First {
	String city;

	public Second(String name, int id, String city) {
		super(name, id);
		this.city = city;
	}
} 
