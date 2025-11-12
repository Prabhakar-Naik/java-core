package com.springboot.coding_lyf;

/**
 * @author prabhakar, @Date 11-11-2025
 */

public class ArrayParameterHere {

    public static void main(String[] args) {

        int[] arr = {1,2,3};
        modifyArray(arr);
        System.out.println(arr[0]); // bcz reference on same object

        // another
        int[] arr1 = {1,2,3};
        int[] arr2 = arr1.clone();
        arr2[0] = 99;
        System.out.println(arr1[0] +" "+arr2[0]);
    }

    static void modifyArray(int[] arr) {
        arr[0] = 99;
    }
}
