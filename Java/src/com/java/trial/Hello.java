package com.java.trial;
import java.util.* ;
import java.io.*; 
import java.util.Scanner;

class Hello {
	
	public static void main(String args[]) {


	 Scanner sc = new Scanner(System.in);

int basicsal = sc.nextInt();
char ch = sc.next().charAt(0);

int allow=0;

if(ch=='A'){
     allow = 1700;
}
else if(ch=='B'){
     allow = 1500;
}
else{
	allow = 1300;
}
double hra = (basicsal *20)/100;
double da = (basicsal *50)/100;
double pf = (basicsal *11)/100;

double totalsalary =( basicsal + hra + da + allow) - pf;

System.out.print(Math.round(totalsalary));	
				
	}
}

