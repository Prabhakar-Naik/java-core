package com.springboot.core.plindrome;

import java.util.Scanner;

public class PalindromeString1 {

    public static void main(String[] args) {

        System.out.println("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String rev = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            rev += name.charAt(i);
        }
        if (name.equals(rev))
            System.out.println(name + " is palindrome");

    }

    boolean isPalindrome(String str) {
        String s = str.replaceAll("\\s+", "").toLowerCase();
        String reverse = new StringBuilder(s).reverse().toString();
        return s.equals(reverse);
    }

}
