package com.springboot.collections.list;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author prabhakar, @Date 10-09-2024
 */
public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Rajendra");//Adding object in arraylist
        list.add("Mahindra");
        list.add("Raja");
        list.add("Prabhakar");

        /*for (String string : list) {
            System.out.println(string);
        }*/
        // or

        //Traversing list through Iterator
        Iterator itr=list.iterator(); // or Iterator<String> itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
