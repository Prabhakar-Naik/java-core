package com.springboot.core.bubblesort;

import java.util.Arrays;
import java.util.stream.IntStream;

public class BubbleSort {

	public static void main(String[] args) {
		
		System.out.println("BubbleSort program ");
		
		int[] arr= {5,3,8,9,12,14,2,4,5,6,7,8};
		
		System.out.println("Before Bubble Sort: ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"  ");
		
		int temp;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("\nAfter Bubble Sort elements: ");
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"  ");
		}
		
		
		
		System.out.println("\nUsing Streams: ");
		IntStream.of(arr).sorted().distinct().forEach(n ->System.out.print(n+"  "));
		Arrays.sort(arr);
		
		System.out.println("\nSmall element: "+arr[0]);
		System.out.println("ArraysSorted: ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"  ");
	}
}
