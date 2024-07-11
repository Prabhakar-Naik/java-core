package com.springboot.core.general;

public class SumOfEvenOdd {

	public static void main(String[] args) {
		
		int evenSum=0,oddSum=0;
		for(int i=1;i<=20;i++) {
			
			if(i%2==0)
				evenSum =evenSum+i;
			else
				oddSum = oddSum+i;
		}
		System.out.println("Even Numbers Sum = "+evenSum);
		System.out.println("Odd Numbers Sum = "+oddSum);
	}
}
