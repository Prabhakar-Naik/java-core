package com.springboot.collections.baselevel.set.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * @author prabhakar, @Date 10-09-2024
 */
public class LinkedHashSetExample {

    public static void main(String[] args) {
        LinkedHashSet<String> al = new LinkedHashSet<String>();

        al.add("Rajesh");
        al.add("Raja");
        al.add("Ravi");
        al.add("Prabhakar");

        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
