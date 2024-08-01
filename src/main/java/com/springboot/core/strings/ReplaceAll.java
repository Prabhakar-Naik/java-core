package com.springboot.core.strings;

/**
 * @author prabhakar, @Date 31-07-2024
 */
public class ReplaceAll {

    public static void main(String[] args) {

        String s1="My name is Prabhakar. My name is Java. My name is Spring Boot.";
        //replaces all occurrences of "is" to"was"
        String replaceString=s1.replaceAll("is","was");
        System.out.println(replaceString);

    }
}
