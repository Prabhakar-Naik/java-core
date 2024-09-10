package com.springboot.collections.set.treeset;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author prabhakar, @Date 10-09-2024
 */
public class TreeSetExample {

    public static void main(String[] args) {
        TreeSet<String> al=new TreeSet<String>();
        al.add("Vijay");
        al.add("Raja");
        al.add("Ravi");
        al.add("suresh");
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
