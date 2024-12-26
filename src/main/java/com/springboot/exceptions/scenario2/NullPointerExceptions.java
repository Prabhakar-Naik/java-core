package com.springboot.exceptions.scenario2;

/**
 * @author prabhakar, @Date 26-12-2024
 */
public class NullPointerExceptions {

    public static void main(String[] args) {
         Police police = null;
         police.setId(123);

        System.out.println(police);


    }
}
