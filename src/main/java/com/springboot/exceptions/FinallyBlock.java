package com.springboot.exceptions;

/**
 * @author prabhakar, @Date 02-08-2024
 */
public class FinallyBlock {

    public static void main(String[] args) {

        try {
            long[] data = new long[1000000000];

        } catch (Exception e) {
            System.out.println(e.getMessage());

        } finally {
            System.out.println("finally block will execute always.");
        }

    }
}
