package com.springboot.core.primenumbers;

import java.util.Scanner;

/**
 * @author prabhakar, @Date 16-09-2024
 */
public class PrimeNumber {
    public static void main(String[] args) {

        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int count = 0;

        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                count++;
        }
        if (count == 0)
            System.out.println(number + " is prime number");
        else
            System.out.println(number + " is not prime number");
    }
}
