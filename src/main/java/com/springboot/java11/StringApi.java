package com.springboot.java11;

/**
 * @author prabhakar, @Date 28-06-2025
 */

public class StringApi {

    public static void main(String[] args) {
        
        String s = "  Hello\nWorld  ";
        s.lines().forEach(System.out::println);
        System.out.println("".isBlank());       // true
        System.out.println("abc".repeat(3));    // abcabcabc
    }
}
