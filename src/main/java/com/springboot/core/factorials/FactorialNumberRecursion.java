package com.springboot.core.factorials;

public class FactorialNumberRecursion {

	static int fact=1;
	static void printFactorial(int n)
	{
		for(int i=1;i<=n;i++)
			fact=fact*i;
		System.out.println(n+" factorial is "+fact);
		
		fact=1;
	}
	
	
	public static void main(String[] args) {
		
		printFactorial(5);
		printFactorial(10);
	}
}
