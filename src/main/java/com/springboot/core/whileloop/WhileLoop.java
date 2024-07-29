package com.springboot.core.whileloop;

import java.util.Scanner;

/**
 * @author prabhakar, @Date 29-07-2024
 */
public class WhileLoop {

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Input an integer");
        n = input.nextInt();
        int temp = n;
        while (n > 0) {
            System.out.println(n);
            n--;
        }


        while (temp != 0) {
            System.out.println("You entered " + temp);
            System.out.println("Input an integer");
            temp--;
        }

        System.out.println("Out of loop");


    }
}
