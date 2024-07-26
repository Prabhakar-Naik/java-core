package com.springboot.core.swapping;

public class SwappingWithoutThirdVariable {

	public static void main(String[] args) {
		
		int n1=50,n2=100;
		
		System.out.println("Before swapping: "+n1+"   "+n2);
		
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println("After swapping: "+n1+"   "+n2);
		
	}
}
