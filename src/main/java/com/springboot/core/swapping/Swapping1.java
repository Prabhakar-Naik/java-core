package com.springboot.core.swapping;

public class Swapping1 {

	public static void main(String[] args) {
		
		int n1=20,n2=30;
		
		System.out.println("Before swapping: "+n1+"  "+n2);
		
		int temp=n1;
		n1=n2;
		n2=temp;
		System.out.println("After swapping: "+n1+"  "+n2);
		
	}
}
