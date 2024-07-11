package com.springboot.core.strings;

public class RemoveSpaces {

	public static void main(String[] args) {
		
		String name="prabhakar  Naik Kimavath";
		String removeWhiteSpace="";
		StringBuffer remove = new StringBuffer();
		StringBuilder remove1 = new StringBuilder();
		
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)!=' ') {
				removeWhiteSpace += name.charAt(i);
				//or
				remove.append(name.charAt(i));
				//or
				remove1.append(name.charAt(i));
			}
		}
		System.out.println(removeWhiteSpace);
		System.out.println(remove);
		System.out.println(remove1);
		
		//Built in function
		name=name.replaceAll("\\s+"," ");
		System.out.println(name);

	}
}
