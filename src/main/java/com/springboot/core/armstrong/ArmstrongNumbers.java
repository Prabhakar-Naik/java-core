package com.springboot.core.armstrong;

import java.util.Scanner;

public class ArmstrongNumbers {

    public static void main(String[] args) {

        System.out.println("Enter a Armstrong number Range: ");
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();

        int n, count = 0, b, sum = 0;
        System.out.println("Armstrong numbers from 1 to " + range);
        for (int i = 100; i <= range; i++) {
            n = i;

            while (n > 0) {
                b = n % 10;
                sum = sum + (b * b * b);
                n = n / 10;
            }
            if (sum == i) {
                System.out.print(i + " ");
            }
            sum = 0;
        }

        sc.close();
    }
}
