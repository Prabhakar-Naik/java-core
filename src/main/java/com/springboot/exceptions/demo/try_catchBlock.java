package com.springboot.exceptions.demo;

public class try_catchBlock {

	public static void main(String[] args) {
		int a=10,b=0,c;
		try {
			System.out.println("try block execution...");
			System.out.println("Addition: "+(a+b));
			System.out.println("Subtraction: "+(a-b));
			System.out.println("Product: "+(a*b));
			//System.out.println("Division: "+a/b);		// java.lang.ArithmeticException
			System.out.println("Remainder: "+(a%2));
		}
		catch(Exception exception) {
			throw exception;
		}
	}
	
}
