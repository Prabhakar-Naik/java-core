package com.springboot.core.arrays;

public class DuplicateEle {

	public static void main(String[] args) {
		
		//int[] arr= {1,2,3,5,7,9,3,6,2,3,7,4};
		int[] arr = {10,30,25,10,40,20,10,20,10};
		
		System.out.println("Duplicates elements are: ");
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					System.out.print(arr[j]+"  ");
			}
		}
		
	}
}
