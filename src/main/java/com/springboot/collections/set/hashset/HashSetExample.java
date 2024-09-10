package com.springboot.collections.set.hashset;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author prabhakar, @Date 10-09-2024
 */
public class HashSetExample {

    public static void main(String[] args) {

        //Creating HashSet and adding elements
        HashSet<String> set=new HashSet<String>();
        set.add("Rajendra");
        set.add("Raja");
        set.add("Ravi");
        set.add("Prabhakar");
        //Traversing elements
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
