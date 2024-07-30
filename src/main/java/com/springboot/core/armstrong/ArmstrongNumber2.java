package com.springboot.core.armstrong;

import java.util.Scanner;

/**
 * @author prabhakar, @Date 30-07-2024
 */
public class ArmstrongNumber2 {
    public static void main(String[] args) {

        int number, sum = 0, temp, remainder, digits = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Input a number to check if it is an Armstrong number");
        number = in.nextInt();

        temp = number;

        // Count number of digits

        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }

        temp = number;

        while (temp != 0) {
            remainder = temp % 10;
            sum = sum + power(remainder, digits);
            temp = temp / 10;
        }

        if (number == sum)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }

    static int power(int digit, int power) {
        int start, result = 1;

        for (start = 1; start <= power; start++)
            result = result * digit;

        return result;
    }
}
