package com.springboot.core.factorials;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter a number: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact * i;
		}

		sc.close();
		System.out.println(n+" factorial is "+fact);

	}
}
