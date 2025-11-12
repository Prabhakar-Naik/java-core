package com.springboot.coding_lyf;

import java.util.ArrayList;
import java.util.List;

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

        ArrayList<String> list = new ArrayList<>(); // ArrayList default initial capacity is 10.
        list.add("A");
        list.add("B");

        for(String s: list){
            if (s.equals("A"))
                list.remove(s);
        }
        System.out.println(list);
    }

    static void modifyArray(int[] arr) {
        arr[0] = 99;
    }
}
