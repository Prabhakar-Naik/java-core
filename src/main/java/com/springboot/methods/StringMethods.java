package com.springboot.methods;

/**
 * @author prabhakar, @Date 01-08-2024
 */
public class StringMethods {

    public static void main(String[] args) {
        int number;
        String string = "Java programming";
        String replace = "", concate = "";

        System.out.println(string);

        // Find length of string
        number = string.length();
        System.out.println("Number of characters = " + number);

        // Replace characters in string

        replace = string.replace("Java", "C++");
        System.out.println(string);
        System.out.println(replace);

        // Concatenating string with another string

        concate = string.concat(" is fun");
        System.out.println(string);
        System.out.println(concate);

    }
}
