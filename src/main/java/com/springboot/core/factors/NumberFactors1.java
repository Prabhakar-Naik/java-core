package com.springboot.core.factors;

public class NumberFactors1 {

	
		public static void main(String[] args) {
		
			printFactors(60);
		}
	
	public static void printFactors(int n) {
	
		System.out.print(n+" factors are: ");
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				System.out.print(i+" ");
		}

	}
	
}
