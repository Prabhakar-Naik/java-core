package com.springboot.generics;

import java.util.ArrayList;

/**
 * @author prabhakar, @Date 30-12-2024
 */
public class WithoutGenerics {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add(123);
        list.add(3.14);

        String str = (String) list.get(0);
        String str1 = (String) list.get(1);

        //ClassCastException
       /*
       Above code has 3 major issues

        No Type safety
        Manual casting
        No Compile Time checking
        */

//        These issues can be solved by Generics

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Hello");
        list1.add("World");
        String s = list1.get(0);
        String s1 = list1.get(1);

    }
}
