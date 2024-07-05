package com.springboot.core.general;

public class NegativeToPositiveNumbers {

	public static void main(String[] args) {
		
		System.out.println("Positive to Negative: ");
		for(int i=1;i<=10;i++) {
			System.out.println(i*-1);
		}
		
		System.out.println("Negative to Positive: ");
		for(int i=-10;i<=-1;i++)
			System.out.println(i*-1);
	}
}
