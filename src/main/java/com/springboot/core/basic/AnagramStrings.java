package com.springboot.core.basic;

import java.util.Arrays;

import static com.springboot.lld.datastructures.string.Anagram.isAnagram;

public class AnagramStrings {

	public static void main(String[] args) {
		
		String str1="Keep";
		String str2="pEEK";

		System.out.println("isAnagram method: "+isAnagram(str1,str2));
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		System.out.println(str1+"  "+str2);
		if(str1.length()!=str2.length()) {
			System.out.println("Not an Anagram strings ");
		}
		else {
			char[] string1=str1.toCharArray();
			char[] string2=str2.toCharArray();
			
			Arrays.sort(string1);
			Arrays.sort(string2);
			
			if(Arrays.equals(string1,string2))
				System.out.println("Both are Anagram strings ");
			else
				System.out.println("Not an Anagram***");
		}


	}
}
