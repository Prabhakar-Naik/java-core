package com.springboot.core.forloops;

/**
 * @author prabhakar, @Date 30-07-2024
 */
public class ComplexForLoop {

    public static void main(String[] args) {

        for (int i = 0; i <= 10; System.out.println(++i)) {
        }

        System.out.println("==============");
        for (int i = 1; i <= 10;)
            System.out.println(++i);

        System.out.println("==============");
        for (int i = 0; i <= 10; i++)
            System.out.println(i+1);
    }
}
