package com.springboot.core.strings;

import java.util.Scanner;

/**
 * @author prabhakar, @Date 29-07-2024
 */
public class CompareStrings {

    public static void main(String[] args) {

        // compare to is internally compare ascii values of each character

        String string1, string2;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first string");
        string1 = in.nextLine();
        System.out.println("Enter the second string");
        string2 = in.nextLine();

        if ( string1.compareTo(string2) > 0 )
            System.out.println("First string is greater than second.");
        else if ( string1.compareTo(string2) < 0 )
            System.out.println("First string is smaller than second.");
        else
            System.out.println("Both strings are equal.");

    }
}
