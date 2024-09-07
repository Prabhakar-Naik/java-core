package com.springboot.exceptions.demo;

public class MultipleTryBlocks {

	public static void main(String[] args) {
		
		try {
			System.out.println("First try block ");
			//System.out.println("Given: "+10/0);		// java.lang.ArithmeticException:
			System.out.println("\nClear Exception ");
		}
		catch(ArithmeticException e) {
			throw e;
		}
		try {
			System.out.println("Second try block ");
			int arr[]= {1,2,3,4,5};
			//System.out.print(arr[5]);		// java.lang.ArrayIndexOutOfBoundsException:
			System.out.println("\nClear Exception ");
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			throw e;
		}
		try {
			System.out.println("Third try block ");
			String name="prabha";
			//System.out.println(name.charAt(7));		// java.lang.StringIndexOutOfBoundsException:
			System.out.println("\nClear Exception ");
		}
		catch(Exception e) {
			throw e;
		}
		try {
			String str=null;
			System.out.println("Fourth try block ");
			
			//System.out.println(str.toUpperCase());		// java.lang.NullPointerException
			System.out.println("\nClear Exception ");
		}
		catch(NullPointerException e) {
			throw e;
		}
	}
}
