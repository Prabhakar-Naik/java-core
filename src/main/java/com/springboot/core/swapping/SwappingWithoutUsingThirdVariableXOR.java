package com.springboot.core.swapping;

public class SwappingWithoutUsingThirdVariableXOR {

	public static void main(String[] args) {
		
		int n1=20,n2=30;
		
		System.out.println("Before swapping: "+n1+"  "+n2);
		
		n1=n1^n2;
		n2=n1^n2;
		n1=n1^n2;

		System.out.println("After swapping: "+n1+"  "+n2);
	}
}
