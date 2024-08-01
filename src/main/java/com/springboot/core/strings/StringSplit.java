package com.springboot.core.strings;

/**
 * @author prabhakar, @Date 01-08-2024
 */
public class StringSplit {

    public static void main(String[] args) {
        String s1 = "java string split method by prabhakar";

        String[] words = s1.split("\\s");//splits the string based on whitespace

        //using java foreach loop to print elements of string array
        for (String w : words) {
            System.out.println(w);
        }
    }
}
