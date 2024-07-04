package com.springboot.streams;

import java.util.stream.LongStream;

public class LongStream1 {

	public static void main(String[] args) {
		
		long[] arr= {123456789,987654321,234567482,912837465,657489321,568329186};
		
		System.out.println("count: "+LongStream.of(arr).count());
		
		System.out.println("Average: "+LongStream.of(arr).average());
		
		System.out.println("Sum: "+LongStream.of(arr).sum());
		
		System.out.println("Summary statistics: "+LongStream.of(arr).summaryStatistics());
		
	}
}
