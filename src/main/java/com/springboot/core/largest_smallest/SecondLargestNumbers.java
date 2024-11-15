package com.springboot.core.largest_smallest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalInt;

/**
 * @author prabhakar, @Date 15-11-2024
 */
public class SecondLargestNumbers {

    public static void main(String[] args) {
        int[] numbers = {10, 5, 20, 8, 12, 15};
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        System.out.println("The second Highest Number without sorting using for loop");
        for (int num: numbers){
            if (num > highest){
                // update second highest before highest
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num != highest) {
                // update second highest if current number is less than the highest number
                secondHighest = num;
            }
        }
        System.out.println("second highest number is: "+secondHighest);

        System.out.println("===============================================");

        System.out.println("The seconfHighest Number without sorting using stream java8");

        OptionalInt big = Arrays.stream(numbers).max();
        OptionalInt secondBig = Arrays.stream(numbers)
                .filter(n -> n != big.orElse(Integer.MIN_VALUE))
                .max();

        if (secondBig.isPresent()){
            System.out.println("Second Big Number is: "+ secondBig.getAsInt());
        }else {
            System.out.println("No second Big Number value Found");
        }

        System.out.println("===============================================");

        System.out.println("The second Highest Number with sorting with loop");

        Arrays.sort(numbers);
        secondHighest = numbers[numbers.length - 2];
        System.out.println("The Second Highest Number is: "+secondHighest);
        System.out.println("===============================================");

        System.out.println("The second Highest Number with sorting using stream");

        Integer[] numbersArray = {160, 50, 250, 80, 102, 105};

        Integer secondBigNumber = Arrays.stream(numbersArray)
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(0);
        System.out.println("SecondBigNumber is: "+secondBigNumber);

        System.out.println("===============================================");
    }
}
