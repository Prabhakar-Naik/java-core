package com.springboot.core.arrays;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		
		int[] arr= {4,2,6,4,7,8,1};
		System.out.println("Reverse order array: ");
		for(int i=arr.length-1;i>=0;i--)
			System.out.print(arr[i]+"  ");
		
		System.out.println("\nFind largest element in the array: ");
		int n=arr[0];
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>n)
				n=arr[i];
		}
		System.out.println("Biggest number is: "+n);
		
		System.out.println("Find smallest number in the array: ");
		
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("Smallest number is: "+min);
		
		System.out.println("Sorted order without using predefined method: ");
		int temp;
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"  ");
		
		Arrays.sort(arr);		// predefined method
		System.out.println("\nSorted order: ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"  ");
		
		System.out.println("\nArray length is: "+arr.length);
		
	}
}
