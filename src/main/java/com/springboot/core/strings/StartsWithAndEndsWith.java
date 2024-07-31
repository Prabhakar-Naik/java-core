package com.springboot.core.strings;

/**
 * @author prabhakar, @Date 31-07-2024
 */
public class StartsWithAndEndsWith {

/*
    startsWith, endsWith and  returns true if the string ends with
    the exact specified suffix, considering the case.
     It returns false if the suffix does not match,
     either due to different characters or case sensitivity.
*/
    public static void main(String[] args) {

        String s1="java by TechnoLamror";
        System.out.println(s1.endsWith("r"));  //true
        System.out.println(s1.endsWith("Lamror"));  //true
        System.out.println(s1.endsWith("lamror"));//false

        System.out.println(s1.startsWith("j"));
        System.out.println(s1.startsWith("Java"));
        System.out.println(s1.startsWith("java"));

    }
}
