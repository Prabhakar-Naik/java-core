package com.springboot.core.conditional;

import java.util.Scanner;

/**
 * @author prabhakar, @Date 13-09-2024
 */
public class ControlStatements {
    public static void main(String[] args) {

        System.out.println("Control statements: ");
        System.out.println("if condition: in condition true then only allow inside the if condition. ");

        System.out.println("For example: Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n >= 18)
            System.out.println("You are eligible for voting");

        System.out.println("if else condition: in condition true then inside the if or else else block ");
        System.out.println("For Example : Enter a number: ");

        if (n < 18)
            System.out.println("You are not Eligible for voting");
        else
            System.out.println("You are eligible for voting");

        System.out.println("if else-if condition: in condition extending more than two conditions  then we are using if else-if condition:");
        System.out.println("For Example: Enter a number: ");
        int marks = scanner.nextInt();
        if (marks > 32 && marks < 45)
            System.out.println("You are just passed ");
        else if (marks > 45 && marks < 55)
            System.out.println("You got C-Grade in the class");
        else if (marks > 55 && marks < 70)
            System.out.println("you got B-Grade in the class");
        else if (marks < 32)
            System.out.println("You failed in exams");
        else
            System.out.println("You got A-Grade in the class");

        int num1 = 100, num2 = 200;
        System.out.println("Enter Switch case: ");
        int ch = scanner.nextInt();
        switch (ch) {

            case 1:
                System.out.println("Addition:  of " + num1 + " " + num2 + " == " + (num1 + num2));

            case 2:
                System.out.println("Substraction: of " + num1 + " " + num2 + " == " + (num1 - num2));
        }

//		System.out.println("Ternary operator: ");
//		int nu=sc.nextInt();
//
        //System.out.println(nu>=50 ? ">=50":"<50");

    }
}
