package com.springboot.core.general;

public class SquareRoot {

	public static void main(String[] args) {
		
		double sq=Math.sqrt(25);
		System.out.println("Squre Root of 25 is: "+sq);
		
		int n=25;
		double temp;
		double sr=n/2;
		
		do {
			
			temp=sr;
			sr=(temp+(n/temp))/2;
			
		}while((temp-sr)!=0);
		System.out.println("Square Root of "+n+" is "+sr);
		
		
		
	}
}
