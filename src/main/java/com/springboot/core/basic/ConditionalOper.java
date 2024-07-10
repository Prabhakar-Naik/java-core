package com.springboot.core.basic;

public class ConditionalOper {

	public static void main(String[] args) {
		
		System.out.println("Conditional Operations: ");
		int i=20,j=10;
		
		System.out.println(i==j && i>=j);
		System.out.println(i>=j && j<=i);
		
		//no of statements are coming relational operations
		
		System.out.println(i==j || i>=j);
		System.out.println(i>=j || j<=i);
	}
}
