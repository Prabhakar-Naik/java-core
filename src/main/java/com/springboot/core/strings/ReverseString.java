package com.springboot.core.strings;

public class ReverseString {

	public static void main(String[] args) {

		String name="prabha";
		String reverse="";

		for(int i=name.length()-1; i>=0;i--)
			reverse=reverse+name.charAt(i);

		System.out.println(reverse);

		//Built in function

		StringBuilder sb=new StringBuilder(name);
		sb.reverse();
		System.out.println(sb);
	}
}
