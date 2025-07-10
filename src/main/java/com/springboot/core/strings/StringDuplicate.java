package com.springboot.core.strings;

public class StringDuplicate {

	public static void main(String[] args) {
		
		String name="prabhakar";
		int len=name.length();
		char[] ch=name.toCharArray();
		
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(ch[i]==ch[j]) {
					System.out.println("first "+ch[j] + " at "+i+" duplicate found at "+j);
					break;
				}
			}
		}
		System.out.println("=======================");
		String name1="Prabhakar Naik";
		len=name1.length();
		ch=name1.toCharArray();
		
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(ch[i]==ch[j] && ch[i]!=' ') {
					System.out.println(ch[j]);
					break;
				}
					
			}
		}
		
		
	}
}
