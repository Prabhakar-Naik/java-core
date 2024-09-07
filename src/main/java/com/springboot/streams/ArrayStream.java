package com.springboot.streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayStream {

	public static void main(String[] args) {

		int[] arr= {5,3,7,5,2,9,3,10,20,14,15,18};

		int[] copy=arr;
		System.out.println("Length of Array: "+IntStream.of(copy).count());
		
		System.out.println("Array Elements: ");
		IntStream.of(copy).forEach(n ->System.out.print(n+"  "));
		System.out.println("\n Sum of Array Elements: "+IntStream.of(copy).distinct().sum());
		
		Arrays.sort(copy);
		for(int i=0;i<=copy.length-1;i++)
			System.out.print(copy[i]+"  ");
		
		
		System.out.println("\nAll Matches as Even: "+IntStream.of(copy).allMatch(n -> n  % 2==0));
		System.out.println("Any Matches as Even: "+IntStream.of(copy).anyMatch(n -> n  % 2==0));
		System.out.println("All Matches as Odd: "+IntStream.of(copy).allMatch(n -> n  % 2==1));
		System.out.println("Any Matches as Odd: "+IntStream.of(copy).anyMatch(n -> n  % 2==1));
		
		System.out.println("Using Stream API Even numbers in range of 1 to 100: ");
		IntStream.range(1, 100).filter(n -> n%2==0).forEach(n ->System.out.print(n+"  "));
		System.out.println("\n Using Stream API Odd numbers in range of 1 to 100: ");
		IntStream.range(1,100).filter(n -> n%2 !=0).forEach(n ->System.out.print(n+"  "));
		
		
		
		
		
		
		
	}
}
