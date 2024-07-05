package com.springboot.core.general;

public class LowerToUpperCase {

	public static void main(String[] args) {
		
		System.out.println("Lower case characters: ");
		
		for(char ch='a';ch<='z';ch++)
			System.out.println(ch);
		
		System.out.println("Upper case Characters: ");
		
		for(char ch='a';ch<='z';ch++)
			System.out.println((char)(ch-32));
		
		
		
	}
}
