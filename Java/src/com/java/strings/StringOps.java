package com.java.strings;

public class StringOps {
  
	public static void main(String[] args) {
		
		//Creation of String
		String name="vijay";
		//using new keyword in  String class
		String str=new String(" vijay");
		
		
		//Comparing of strings
		
		boolean val=name.equals(str);
		System.out.println(val);
		
		int val2=name.compareTo(str);
		
		System.out.print(val2);
	}
}
