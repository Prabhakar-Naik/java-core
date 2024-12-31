package com.springboot.generics.genericclass;

import com.springboot.generics.genericclass.Box;

/**
 * @author prabhakar, @Date 30-12-2024
 */
public class MainBox {

    public static void main(String[] args) {
        /*
        Box box = new Box();
        box.setValue(1);
        String i = (String) box.getValue(); // EXCEPTION !!!
        System.out.println(i);

        */

        Box<Integer> box = new Box<>();  // Box is now type-safe
        box.setValue(1);  // No issue, it's an Integer
        Integer i = box.getValue();  // No casting needed
        System.out.println(i);


    }
}
