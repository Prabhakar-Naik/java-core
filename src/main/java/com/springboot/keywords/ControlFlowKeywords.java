package com.springboot.keywords;

/**
 * @author prabhakar, @Date 24-12-2024
 */
public class ControlFlowKeywords {
    static int x = 2;

    public static void main(String[] args) {

        //if: Used to execute a block of code if a specified condition is true.
        if (x > 0) {
            System.out.println("Positive");
        }

        //else: Specifies a block of code to execute if the if condition is false.
        if (x > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Non-positive");
        }

        //switch: Allows selection of one block of code to execute from multiple options.
        switch (x) {
            case 1:
                System.out.println("Monday");
                break;
        }

        //case: Defines a branch in a switch statement for a specific value.
        switch (x) {
            case 1:
                System.out.println("Monday");
                break;
        }

        //default: Specifies the block of code to execute if no case in a switch matches.
        switch (x) {
            case 1:
                System.out.println("Monday");
                break;
            default:
                System.out.println("Other day");
        }

        //for: Executes a block of code repeatedly for a specific number of iterations.
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        //do: Executes a block of code once, and then repeatedly while a condition is true.
        do {
            System.out.println("Hello");
        } while (x < 5);


        //while: Executes a block of code repeatedly as long as a condition is true.
        while (x < 5) {
            System.out.println(x++);
        }

        //break: Exits the current loop or switch statement prematurely
        for (int i = 0; i < 10; i++) { if (i == 5) break; }

        //continue: Skips the current iteration of a loop and moves to the next iteration.
        for (int i = 0; i < 5; i++) { if (i == 2) continue; System.out.println(i); }

        //return: Exits from a method and optionally returns a value.

        //return x * 2;

    }


}
