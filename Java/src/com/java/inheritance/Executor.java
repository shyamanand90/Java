package com.java.inheritance;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Second emp1=new Second("vijay", 001, "rewari");
		
		Second emp2=new Second("avtar",002, "");
		
		System.out.println(emp1.getName()+ emp1.city + emp1.getId());
		System.out.println(emp2.getName());
		System.out.println(emp2.getId());
	}

}
