package com.springboot.core.general;

import java.util.Arrays;

public class SecondLargestNum {

	public static void main(String[] args) {
		
		int[] arr= {3,5,10,6,8,9,4,7};
		int temp;
		int n=arr.length;
		
		for(int i=0;i<arr.length;i++)
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
		
		System.out.println("Ascending order of Array elements: ");
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"  ");
		
		System.out.println("\nSecond largest number: "+arr[n-2]);
		System.out.println("Second smallest number :"+arr[1]);
		temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("Descending order of array elements: ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"  ");
		
		System.out.println("\nSecond smallest number is: "+arr[n-2]);
		System.out.println("Second largest number is: "+arr[1]);
		
		
		System.out.println(Arrays.stream(arr).sorted().distinct().summaryStatistics());
	}
}
