package com.springboot.core.armstrong;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int digit, reverse = 0, temp = number;
        if (temp >= 1 && temp <= 9) {
            System.out.println(temp + " Armstrong number");
            return;
        } else if (temp >= 10 && temp <= 100) {
            System.out.println(number + " Not an Armstrong number");
        } else {

            while (number > 0) {
                digit = number % 10;
                reverse = reverse + (digit * digit * digit); //Math.pow(d, 3);
                number = number / 10;
            }
            if (temp == reverse)
                System.out.println(temp + " is Armstrong Number");
            else
                System.out.println(temp + " Not an Armstrong number");

            sc.close();
        }
    }
}
