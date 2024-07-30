package com.springboot.core.general;

import java.util.Scanner;

/**
 * @author prabhakar, @Date 30-07-2024
 */
public class MultiplicationTable {

    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to print their multiplication table:");
        number = input.nextInt();

        for (int i = 1 ; i <= 10 ; i++ )
            System.out.println(number+" X "+i+" = "+(number*i));

        int firstNumber, uptoNumber, startNumber, initialOne;
        System.out.println("Enter range of numbers to print their multiplication table");

        firstNumber = input.nextInt();
        uptoNumber = input.nextInt();

        for (startNumber = firstNumber; startNumber <= uptoNumber; startNumber++) {
            System.out.println("Multiplication table of "+startNumber);

            for (initialOne = 1; initialOne <= 10; initialOne++) {
                System.out.println(startNumber+"*"+initialOne+" = "+(startNumber*initialOne));
            }
        }
    }
}
