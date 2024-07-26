package com.springboot.core.additions;

import java.util.Scanner;

/**
 * @author prabhakar, @Date 26-07-2024
 */
public class AddNumbers {

    public static void main(String[] args) {
        int num1, num2, sum;
        System.out.println("Enter two integers to calculate their sum ");
        Scanner in = new Scanner(System.in);
        num1 = in.nextInt();
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("Sum of entered integers = "+sum);
    }
}
