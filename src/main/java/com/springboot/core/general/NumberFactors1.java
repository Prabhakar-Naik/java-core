package com.springboot.core.general;

public class NumberFactors1 {

	
		public static void main(String[] args) {
		
			printFactors(60);
		}
	
	public static int printFactors(int n) {
	
		System.out.print(n+" factors are: ");
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				System.out.print(i+" ");
		}
		
		return n;
	}
	
}
