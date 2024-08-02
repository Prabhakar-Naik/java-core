package com.springboot.exceptions;

import java.util.Scanner;

/**
 * @author prabhakar, @Date 02-08-2024
 */
public class Division {

    public static void main(String[] args) {

        int num1, num2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers for Division:");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        try {
            int result = num1 / num2;
            System.out.println("Result: "+result);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
