package com.springboot.core.basic;

import java.util.Arrays;

public class MoveZerosToBeginning {

	 public static void main(String[] args) {
	        int[] input = {0, 4, 0, 5, 2, 0, 5, 0, 0, 0};
	        moveZerosToBeginning(input);
	        System.out.println(Arrays.toString(input));
	    }

	    public static void moveZerosToBeginning(int[] nums) {
	        int index = nums.length - 1;

	        // Iterate from the end of the array
	        for (int i = nums.length - 1; i >= 0; i--) {
	            if (nums[i] != 0) {
	                // If non-zero element is found, swap it with the last zero
	                swap(nums, i, index);
	                index--;
	            }
	        }
	    }

	    // Method to swap elements in an array
	    public static void swap(int[] nums, int i, int j) {
	        int temp = nums[i];
	        nums[i] = nums[j];
	        nums[j] = temp;
	    }
}
