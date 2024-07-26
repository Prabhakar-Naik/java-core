package com.springboot.core.additions;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author prabhakar, @Date 26-07-2024
 */
public class AddingLargeNumbers {

    public static void main(String[] args) {
        String number1, number2;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first large number");
        number1 = in.nextLine();
        System.out.println("Enter second large number");
        number2 = in.nextLine();

        BigInteger first  = new BigInteger(number1);
        BigInteger second = new BigInteger(number2);
        BigInteger sum;
        sum = first.add(second);
        System.out.println("Result of addition = " + sum);
    }
}
