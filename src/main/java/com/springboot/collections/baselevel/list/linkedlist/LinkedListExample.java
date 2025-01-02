package com.springboot.collections.baselevel.list.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author prabhakar, @Date 10-09-2024
 */
public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<String> al=new LinkedList<>();

        al.add("Rajendra");//Adding object in LinkedList
        al.add("Mahindra");
        al.add("Raja");
        al.add("Prabhakar");

        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
