package com.springboot.core.strings;

public class ReverseStringWords {

	public static void main(String[] args) {
		
		String statement="Go To School Every Day that is Good habit";
		String reverseState="";
		String[] words=statement.split(" ");
		
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			String reverse="";
			
			for(int j=word.length()-1;j>=0;j--) {
				reverse=reverse+word.charAt(j);
			}
			reverseState=reverseState+reverse+" ";
		}
		System.out.println(reverseState);
	}
}
