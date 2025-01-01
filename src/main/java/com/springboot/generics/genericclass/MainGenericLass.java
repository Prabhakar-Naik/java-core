package com.springboot.generics.genericclass;

/**
 * @author prabhakar, @Date 30-12-2024
 */
public class MainGenericLass {

    public static void main(String[] args) {

        GenericLass<Integer> object = new GenericLass<>();  // GenericLass is now type-safe
        object.setValue(1);  // No issue, it's an Integer
        Integer i = object.getValue();  // No casting needed
        System.out.println(i);

    }
}
