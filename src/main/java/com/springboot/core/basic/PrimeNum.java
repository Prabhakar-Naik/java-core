package com.springboot.core.basic;

import java.util.Scanner;

public class PrimeNum {

    public static void main(String[] args) {

        int num = 7, count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                count++;
        }
        if (count == 2)
            System.out.println(num + " is prime number");
        else
            System.out.println(num + " is nt prime number");


        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        count = 0;

        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                count++;
        }
        if (count == 0)
            System.out.println(number + " is prime number");
        else
            System.out.println(number + " is nt prime number");


        System.out.println("Prime numbers in 1 to 100");
        for (int i = 1; i <= 100; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    count++;
            }
            if (count == 2)
                System.out.print(i + " ");
        }


    }
}
