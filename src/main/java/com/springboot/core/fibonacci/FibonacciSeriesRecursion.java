package com.springboot.core.fibonacci;

public class FibonacciSeriesRecursion {
	static int a=0,b=1,c=0;
	 static void printFibonacci(int n){ 
		    if(n>0){    
		         c = a + b;    
		         a = b;    
		         b = c;    
		         System.out.print(" "+c);   
		         printFibonacci(n-1);    
		     }    
		 }    
	
	public static void main(String[] args) {
		System.out.print(a+" "+b);
		printFibonacci(10-2);
		//printFibonacci(8);
	}
}
