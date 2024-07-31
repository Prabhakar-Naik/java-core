package com.springboot.core.strings;

/**
 * @author prabhakar, @Date 31-07-2024
 */
public class CompareTwoStrings {
//    The compareTo method compares two strings lexicographically.
//    Since both strings are identical, the result is 0.
//    The first character where they differ is the first character itself: 'h' in s1 and 'm' in s3.
//    The difference is based on the Unicode values of these characters. The Unicode value of 'h' is 104, and for 'm', it’s 109.
//    The result is 104 - 109 = -5.

//    The Unicode value of 'l' is 108, and for 'm', it’s 109.
//    The result is 108 - 109 = -1.
/*
    compareTo returns 0 when the strings are equal.
    It returns a negative number when the first string is lexicographically less than the second.
    It returns a positive number when the first string is lexicographically greater than the second.
*/
    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";
        String s3="meklo";
        String s4="hemlo";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));
    }
}
