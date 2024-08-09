package com.springboot.exceptions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author prabhakar, @Date 09-08-2024
 */
public class ClassCastException {

    public ClassCastException() {

        List list = new ArrayList();
        list.add("one");
        list.add("two");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            // intentionally throw a ClassCastException by trying to cast a String to an
            // Integer (technically this is casting an Object to an Integer, where the Object
            // is really a reference to a String:
            String i = (String)it.next();
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        new ClassCastException();
    }
}
