package com.springboot.core.typecast;

/**
 * @author prabhakar, @Date 23-08-2024
 */
public class StringToFloatExample {

    public static void main(String args[]){
        String s="23.6";
        float f=Float.parseFloat("23.6");
        System.out.println(f);
    }
}