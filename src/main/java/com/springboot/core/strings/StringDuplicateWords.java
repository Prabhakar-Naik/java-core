package com.springboot.core.strings;

public class StringDuplicateWords {

	public static void main(String[] args) {
		
		String statement="Learn Java Program with Java tpoint Java Tutorial with Online Learn Fast Program";
		int count=0;
		statement=statement.toLowerCase();
		
		String words[]=statement.split(" ");
		
		System.out.println("Statement length: "+statement.length());
		System.out.println("Words length: "+words.length);
		for(int i=0;i<words.length;i++) {
			for(int j=i+1;j<words.length;j++) {
				if(words[i].equals(words[j])) {
					System.out.println(words[j]);
					count++;
					break;
				}
			}
		}
		
		System.out.println(count+" Duplicate words are present in statement ");
		
	}
}
