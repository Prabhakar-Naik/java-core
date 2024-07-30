package com.springboot.core.strings;

import java.util.Scanner;


/**
 * @author prabhakar, @Date 30-07-2024
 */
public class SubStrings {

    public static void main(String[] args) {

        String string, sub;
        int length;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to print it's all substrings");
        string  = in.nextLine();

        length = string.length();

        System.out.println("Substrings of \""+string+"\" are :-");
        for(int i = 0 ; i < length ; i++ )
        {
            for(int j = 1 ; j <= length - i ; j++ )
            {
                sub = string.substring(i, i+j);
                System.out.println(sub);
            }
        }

    }

}
