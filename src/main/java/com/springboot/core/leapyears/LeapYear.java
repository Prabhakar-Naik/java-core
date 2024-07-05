package com.springboot.core.leapyears;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		System.out.println("Enter a year: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		if(n%100==0 && n%400==0 || n%100!=0 && n%4==0)
			System.out.println(n+"  leap year");
		else
			System.out.println(n+"  Not leap year");
	}
}
