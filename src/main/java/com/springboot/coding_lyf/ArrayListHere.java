package com.springboot.coding_lyf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author prabhakar, @Date 11-11-2025
 */

public class ArrayListHere {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");

        list.remove("B");
        list.remove(1);
        System.out.println(list);

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

//        list1.remove(2);
//        System.out.println(list1);

        list1.remove(Integer.valueOf(2));
        System.out.println(list1);

        List<Integer> reverse = new ArrayList<>();
        reverse.add(1);
        reverse.add(2);
        reverse.add(31);
        reverse.add(4);
        reverse.add(15);

//        Collections.sort(reverse.reversed());
//        System.out.println(reverse);

        reverse.sort(Collections.reverseOrder());
        System.out.println(reverse);

    }
}
