package com.springboot.core.forloops;

/**
 * @author prabhakar, @Date 30-07-2024
 */
public class EnhancedForLoop {

    public static void main(String[] args) {
        // for int array
        int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29};

        for (int t: primes) {
            System.out.println(t);
        }

        // for string array
        String[] languages = { "C", "C++", "Java", "Python", "Ruby"};

        for (String sample: languages) {
            System.out.println(sample);
        }


    }
}
