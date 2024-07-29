package com.springboot.core.whileloop;

import java.util.Scanner;

/**
 * @author prabhakar, @Date 29-07-2024
 */
public class ReverseNumber {

    public static void main(String[] args) {
        int number, reverse = 0;

        System.out.println("Enter the number to reverse");
        Scanner in = new Scanner(System.in);
        number = in.nextInt();

        while( number != 0 )
        {
            reverse = reverse * 10;
            reverse = reverse + number%10;
            number = number/10;
        }

        System.out.println("Reverse of entered number is "+reverse);
    }
}
