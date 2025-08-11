package com.springboot.scenarios.javaPnCExceptionRule;

/**
 * @author prabhakar, @Date 11-08-2025
 */

public class Parent {

    void show() throws Exception{
        System.out.println("Parent show");
        throw new Exception("Parent show exception");
    }
}
