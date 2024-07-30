package com.springboot.core.forloops;

/**
 * @author prabhakar, @Date 30-07-2024
 */
public class Alphabets {
    public static void main(String[] args) {

        for(char ch = 'a' ; ch <= 'z' ; ch++ )
            System.out.println("small: "+ch+" Capital: "+String.valueOf(ch).toUpperCase());
    }
}
