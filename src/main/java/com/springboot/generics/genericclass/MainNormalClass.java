package com.springboot.generics.genericclass;

/**
 * @author prabhakar, @Date 31-12-2024
 */
public class MainNormalClass {

    public static void main(String[] args) {
        NormalClass object = new NormalClass();
        object.setValue(1);
        String i = (String) object.getValue(); // EXCEPTION !!! ClassCastException
        System.out.println(i);

    }
}
