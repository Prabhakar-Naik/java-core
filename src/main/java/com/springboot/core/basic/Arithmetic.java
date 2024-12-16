package com.springboot.core.basic;

import java.util.HashMap;

public class Arithmetic {

	public static void main(String[] args) {
		
		int i=20;
		int j=10;
		System.out.println("Original order: i to j ");
		System.out.println("Total Value: "+(i+j));
		System.out.println("Remaining Value: "+(i-j));
		System.out.println("Product Value: "+(i*j));
		System.out.println("Result Value: "+(i/j));
		System.out.println("Remainder Value: "+(i%j));
		
		System.out.println("Reverse order: j to i ");
		System.out.println("Total Value: "+(j+i));
		System.out.println("Remaining Value: "+(j-i));
		System.out.println("Product Value: "+(j*i));
		System.out.println("Result Value: "+(j/i));
		System.out.println("Remainder Value: "+(j%i));
		
		
		System.out.println("===========");
		int x =10;
		System.out.println(x);
		++x;
		System.out.println(++x);
		System.out.println(x++);
		
		System.out.println(login("key   ","  value"));
		System.out.println(login("prabha","prabha123"));
		  
	}
	
	public static HashMap<String, String> login(String user, String password){

		  HashMap<String, String> map = new HashMap<>();
		  map.put(user, password);
		  return map;
	}
	
}
