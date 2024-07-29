package com.springboot.core.factorials;

public class FactorialNumberRecursion {

	static int fact=1;
	static int printFactorial(int n)
	{
		if(n>0) {
			fact = fact * n;
			printFactorial(n - 1);
		}

		return fact;
    }
	
	
	public static void main(String[] args) throws InterruptedException {

		System.out.println(printFactorial(5));
		fact = 1;
		System.out.println(printFactorial(4));
	}
}
