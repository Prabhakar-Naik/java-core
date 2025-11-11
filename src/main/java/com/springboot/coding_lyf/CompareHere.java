package com.springboot.coding_lyf;

/**
 * @author prabhakar, @Date 11-11-2025
 */

public class CompareHere {

    public static void main(String[] args) {

        String s1 = "abc";      // sting pool creation
        String s2 = "def";      // sting pool creation
        System.out.println(s1 == s2);
        String s3 = s1 + s2;    // new object created at runtime or compile time
        System.out.println(s3.contains(s1));
        String s4 = "abcdef";   // sting pool creation
        System.out.println(s3 == s4);
    }
}
