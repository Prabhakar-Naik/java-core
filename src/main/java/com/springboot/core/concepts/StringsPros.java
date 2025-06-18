package com.springboot.core.concepts;

import java.util.Arrays;

/**
 * @author prabhakar, @Date 16-06-2025
 */

public class StringsPros {

    public static void main(String[] args) {

        // reverse a String
        String name = "prabhakar";
        String reverse = "";
        System.out.println(name);

        System.out.println("Normal Way");
        for (int i=0; i<name.length(); i++) {
            reverse = name.charAt(i) + reverse;
        }
        System.out.println(reverse);

        // second way
        name = "";
        System.out.println("second Way Reverse");
        for (int i = reverse.length()-1; i>=0; i--) {
            name += reverse.charAt(i);
        }
        System.out.println(name);

        // third way
        System.out.println("Third Way Using StringBuffer");
        name = new StringBuffer(name).reverse().toString();
        System.out.println(name);

        // fourth way
        System.out.println("Single Line StringBuilder Reverse");
        System.out.println(new StringBuilder(name).reverse());

        String fullName = "prabhakar";
        String midName = "naik";
        String lastName = "kimavath";
        // memory wastage
        System.out.println(fullName+" "+midName+" "+lastName);

        fullName = "prabhakar";
        // here also confusion
        StringBuffer appendName = new StringBuffer(fullName);
        appendName.append(" naik");
        appendName.append(" kimavath");
        System.out.println(appendName);

        // simple and accurate
        fullName = new StringBuffer().append("Prabhakar").append(" naik").append(" kimavath").toString();
        System.out.println(fullName);

        // or directly use in String Buffer or Builder
        StringBuffer finalResult = new StringBuffer();
        finalResult.append("Prabhakar");
        finalResult.append(" naik");
        finalResult.append(" kimavath");
        System.out.println(finalResult);

        StringBuilder result = new StringBuilder();
        result.append("Prabhakar");
        result.append(" naik");
        result.append(" kimavath");
        System.out.println(result);


        String original = "CompanyLock";
        char[] array = original.toCharArray();
        for (int i = 0, j=array.length-1; i<j; i++, j--) {
            char temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        System.out.println(array);

        String res="";

            for (int j = array.length-1; j >=0; j--) {
               res += array[j];
            }
        System.out.println(res);

    }
}
