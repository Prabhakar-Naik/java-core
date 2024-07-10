package com.springboot.core.general;

public class CharactersAsciiValues {

	public static void main(String[] args) {
		
		System.out.println("Ascii values in Capital letters: ");
		for(char ch='A';ch<='Z';ch++)
			System.out.println(ch+" ==> "+(int)ch);
		
		System.out.println("Ascii values in small letters: ");
		for(char ch='a';ch<='z';ch++)
			System.out.println(ch+" ==> "+(int)ch);
		
		System.out.println("Ascii values of 1 to 10: ");
		for(int i=0;i<=255;i++)
			System.out.println(i+" ==> "+(char)i);
	}
}
