package com.springboot.core.strings;

public class SubStringPro {

	public static void main(String[] args) {
		
		String name="TEST";
		
		int length=name.length();
		
		String[] substrings=new String[length*(length+1)/2];
		int index=0;
		int words=0;
		for(int i=0;i<length;i++)
		{
			for(int j=i;j<length;j++)
			{
				substrings[index]=name.substring(i, j+1);
				index++;
				words++;
			}
		}
		
		for(int i=0;i<substrings.length;i++)
			System.out.println(substrings[i]);
		System.out.println("Total subsets are "+words);
	}
}
