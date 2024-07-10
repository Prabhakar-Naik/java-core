package com.springboot.core.arrays;

import java.util.ArrayList;
import java.util.List;

public class DuplicateElements {

	public static void main(String[] args) {

		int[] array = { 10, 30, 25, 10, 40, 60, 10, 60, 10 };
		printUniqueDuplicates(array);
		
	}

	public static void printUniqueDuplicates(int... array) {

		List<Integer> uniqueDuplicates = new ArrayList<>();
		List<Integer> seen = new ArrayList<>();

		for (int num : array) {
			if (seen.contains(num) && !uniqueDuplicates.contains(num)) {
				uniqueDuplicates.add(num);
			}
			seen.add(num);
		}

		System.out.println(uniqueDuplicates);
	}

	
}
