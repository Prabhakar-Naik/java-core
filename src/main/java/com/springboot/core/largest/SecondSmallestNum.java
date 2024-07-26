package com.springboot.core.largest;

import java.util.Arrays;

/**
 * @author prabhakar, @Date 26-07-2024
 */
public class SecondSmallestNum {

    public static void main(String[] args) {
        int[] numbers = {10, 5, 20, 8, 12, 15};

        // Call the method to find the second-largest number
        int secondSmallest = findSecondSmallest(numbers);

        if (secondSmallest != Arrays.stream(numbers).distinct().summaryStatistics().getMax()) {
            System.out.println("The second smallest number is: " + secondSmallest);
        } else {
            System.out.println("There is no second smallest number.");
        }

    }

    public static int findSecondSmallest(int ...nums){
        if (nums == null || nums.length < 2) {
            return Arrays.stream(nums).distinct().summaryStatistics().getMax(); // Indicating no second-largest number
        }

        int smallest = Arrays.stream(nums).distinct().summaryStatistics().getMax();
        int secondSmallest = Arrays.stream(nums).distinct().summaryStatistics().getMax();

        for (int num: nums){
            if (num < smallest){
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num > smallest) {
                secondSmallest = num;
            }
        }

        return secondSmallest;
    }

}
