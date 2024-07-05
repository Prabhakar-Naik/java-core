package com.springboot.core.plindrome;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		System.out.println("Enter a String: ");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		reverse(name);
//		String rev=reverse(name);
		
//		if(name.equals(rev))
//			System.out.println(name+" is palindrome ");
		
//		if(name==rev)		Not working BCZ of Strings are different addresses we can't compare with == 
//			System.out.println(rev+" is palindrome ");
		
	}
			
	public static String reverse(String name) {
		
		String rev="";
		for(int i=name.length()-1;i>=0;i--)
		{
			rev+=name.charAt(i);
		}
		if(name.equals(rev))
			System.out.println(name+" is palindrome");
		else
			System.out.println(name+" is not palindrome");
		
		return rev;
	}
}

