package com.springboot.streams;

import java.util.stream.IntStream;

public class IntStreams {

	public static void main(String[] args) {

		int[] arr= {3,4,2,6,5,8,20,5,15,1,14,8,18,19,24,7};

		int[] copy=arr;

		System.out.println("Smallest digit in array: ");
		IntStream.of(copy).min().ifPresent(System.out::println);
		
		System.out.println("Biggest number in array: ");
		IntStream.of(copy).max().ifPresent(System.out::println);
		
		System.out.println("Sorted order: ");
		IntStream.of(copy).sorted().forEach(n -> System.out.print(n+"   "));
		
		System.out.println("\nNo Duplicates in the array: ");
		IntStream.of(copy).distinct().sorted().forEach(n ->System.out.print(n+"   "));
		
		System.out.println("\nAverage in the array:  ");
		IntStream.of(copy).average().ifPresent(System.out::println);
		
		System.out.println("Sum of Elements in the Array: "+IntStream.of(copy).distinct().sum());
		
		System.out.println("Count elements present in array: "+IntStream.of(copy).count());
		
		System.out.println("Average of array: "+(IntStream.of(copy).distinct().sum()/IntStream.of(copy).count()));
		
		System.out.println(IntStream.of(copy).allMatch(n ->n%2==0));
		System.out.println(IntStream.of(copy).anyMatch(n ->n%2==0));
		System.out.println(IntStream.of(copy).allMatch(n ->n%2!=0));
		System.out.println(IntStream.of(copy).anyMatch(n ->n%2!=0));
		
		IntStream.of(copy).unordered().forEach(n->System.out.print(n+"  "));
		
		System.out.println("\nAll Summary Statistics: "+IntStream.of(copy).summaryStatistics());
		
//		IntStream.of(copy).findAny().ifPresent(System.out::println);
//		
//		IntStream.of(copy).findFirst().ifPresent(System.out::println);
		
		IntStream.of(copy).sorted().distinct().filter(n ->n%2==0).forEach(System.out::println);
		IntStream.of(copy).sorted().distinct().map(n ->n*10).filter(n ->n>=10).forEach(System.out::println);
	}
}
