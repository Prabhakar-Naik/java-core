package com.springboot.core.arrays;

public class CopyArray {

	public static void main(String[] args) {
		
		int[] arr1= {1,2,3,4,5};
		int[] arr2=new int[arr1.length];
		
		for(int i=0;i<=arr1.length-1;i++)
			arr2[i]=arr1[i];
		System.out.println("Array copied: ");
		System.out.println("Elements are: ");
		for(int i=0;i<=arr2.length-1;i++)
			System.out.print(arr2[i]+"  ");
		
	}
}
