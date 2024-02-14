package com.java.polymorphism;

public class MethodOverloading {
	public static int add(int a, int b) {
		return a+b;
	}
   
	public float add(float a, int b) {
		 return a+b;
	}
	
	public float add(float a, float b) {
		return a+b;
	}
	
	
	public static void main(String[] args) {
		
        System.out.println(MethodOverloading.add(5,7));
		
		MethodOverloading obj=new MethodOverloading();
		
		float s=obj.add(5.2f,6);
		
		System.out.println("sum is "+ s);
	}
}
