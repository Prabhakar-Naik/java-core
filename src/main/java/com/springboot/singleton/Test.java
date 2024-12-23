package com.springboot.singleton;

/**
 * @author prabhakar, @Date 23-12-2024
 */
public class Test {

    public static void main(String[] args) {

        School.getInstance();
        School.getInstance();
        School.getInstance();
    }
}
