package com.springboot.coding_lyf;

/**
 * @author prabhakar, @Date 11-11-2025
 */

public class WhiteSpaceHere {

    public static void main(String[] args) {
        String str = " "; // white space
        System.out.println(str.length());
        System.out.println(str.isBlank()); // returns true,
        // if string is empty or contains only whitespace characters else false
        System.out.println(str.isEmpty()); // returns false,
        // if string has no characters, means if string has a length of 0 it returns true, else false
    }
}
