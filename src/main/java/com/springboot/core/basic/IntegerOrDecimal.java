package com.springboot.core.basic;

import java.util.Scanner;

public class IntegerOrDecimal {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		
		Object n;
		if(sc.hasNextInt()) {
			n=sc.nextInt();
			System.out.println("Given Number is Integer");
		}
		else if(sc.hasNextDouble()) {
			 n=sc.nextDouble();
			System.out.println("Given Number is Decimal");
		}
		else
			System.out.println("Invalid Input.");
		sc.close();
	}
}
