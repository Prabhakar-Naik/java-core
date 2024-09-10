package com.springboot.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author prabhakar, @Date 10-09-2024
 */
public class LinkedHashMapExample {

    public static void main(String[] args) {
        LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();

        hm.put(100,"will");
        hm.put(101,"Vijay");
        hm.put(102,"demon");

        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}
