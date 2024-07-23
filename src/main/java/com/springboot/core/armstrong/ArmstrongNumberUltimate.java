package com.springboot.core.armstrong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.springboot.exceptions.LargeNumDivisionLowerNumException.GivenNegativeValue;

/**
 * @author prabhakar, @Date 22-07-2024
 */
public class ArmstrongNumberUltimate {

    // ArmstrongNumberUltimate program is the advance level program
    // it will take the armstrong numbers in give your range.

    public static void main(String[] args) {
        // by input value

        System.out.println("Enter your range for Armstrong number:");
        Scanner scanner = new Scanner(System.in);
        int range = scanner.nextInt();

        // to get list of armstrong numbers from the range
        List<Integer> numbers = armstrongNumber(range);

        // printing the numbers here
        System.out.println(numbers);
    }

    /*
    * below function can iterate the loop from 1 to given range
    * and to check the number is armstrong or not
    * if the number is armstrong add to the list of armstrong numbers.
    * then return the list.
    * */
    public static List<Integer> armstrongNumber(int range){
        List<Integer> armstrongNumbers = new ArrayList<>();

        for (int number = 1; number <= range; number++) {
            if (isArmstrong(number)) {
                armstrongNumbers.add(number);
            }
        }
        return armstrongNumbers;
    }


    /*
    * isArmstrong is checked the given number is armstrong or not
    * with our actual logic
    * but here we implemented the custom power function alternative for Math.pow()
    * if the logic satisfied number is armstrong
    * return true or false
    * */

    private static boolean isArmstrong(int number){
        int sum = 0;
        int temp = number;
        int numberOfDigits = String.valueOf(number).length();

        while (temp != 0) {
            int digit = temp % 10;
            sum = sum + customPower(digit, numberOfDigits);
            temp /= 10;
        }

        return sum == number;
    }

    /*
    * Here we implemented custom power function to get the result
    * how many times we want to iterate the digit from expo of noOfDigits
    * then return the result.
    * */

    private static int customPower(int digit, int noOfDigits) {
        if (noOfDigits == 0) {
            return 1;
        }

        double result = 1;
        int exp = Math.abs(noOfDigits);

        if (noOfDigits < 0) {
            return (int) (1 / result);
        }

        for (int i = 0; i < exp; i++) {
            result *= digit;
        }

        return (int) result;
    }

}
