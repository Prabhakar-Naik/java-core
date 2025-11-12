package com.springboot.coding_lyf;

/**
 * @author prabhakar, @Date 11-11-2025
 */

public class ArrayTestHere {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
       // System.out.println(arr[-1]); // bcz array index starts from 0 only not backward

        int[] b = arr;
        b[0] = 10;
        System.out.println(arr[0]);  // in java arrays are reference type. when you assign one
        // array variables point to the same array object in memory.

        char[] chars = {'a','b','c'};
        System.out.println(chars[1]+chars[2]); // bcz char type internally take character ascii values

        new ArrayTestHere().print(arr);
        new ArrayTestHere().print(1,2);

        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};
        System.out.println(arr1 == arr2);

    }

    public void print(int... numbers){
        System.out.println("int...");
    }

    public void print(Integer i1, Integer i2){
        System.out.println("Integer");
    }
}
