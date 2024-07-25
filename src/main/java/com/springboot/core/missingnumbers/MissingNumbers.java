package com.springboot.core.missingnumbers;

import java.util.stream.IntStream;

public class MissingNumbers {

	public static void main(String[] args) {

		int a; //declaration
		int c = 2; // = assign to variable
		int b = 2; // initialization
		Integer integer = Integer.valueOf(b); // instantiation

		/*int[] array = new int[2]; // instantiation
		array[0] = 10;
		array[1] = 20;*/

		int[] array = {1,2}; //instantiation


		//create a random array
		int[] arr= {2,4,6,8,3,12,11,15,19};
		
		//find the maximum number in the array assign max element in the array 
		int max=IntStream.of(arr).max().getAsInt();
		
		//create boolean array to store the presence of array
		boolean[] present=new boolean[max+1];
		
		
		//mark the elements in the array present 
		for(int i=0;i<arr.length;i++) {
			present[arr[i]]=true;
		}
		
		//printing the missing numbers in the array up to max element
		System.out.println("Missing Numbers in the array: ");
		for(int i=1;i<=max;i++) {
			if(!present[i])
				System.out.print(i+"  ");
		}
		
	}
}
