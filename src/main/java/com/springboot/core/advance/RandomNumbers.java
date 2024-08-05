package com.springboot.core.advance;

import java.util.Random;

/**
 * @author prabhakar, @Date 05-08-2024
 */
public class RandomNumbers {

    public static void main(String[] args) {

        Random random = new Random();

        for (int i=1; i<=6; i++)
            System.out.print(random.nextInt(10));
    }
}
