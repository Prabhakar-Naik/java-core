package com.springboot.collections.baselevel.map;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author prabhakar, @Date 10-09-2024
 */
public class TreeMapExample {

    public static void main(String[] args) {
        TreeMap<Integer,String> hm=new TreeMap<Integer,String>();
        hm.put(100,"Amit");
        hm.put(102,"Ravi");
        hm.put(101,"Vijay");
        hm.put(103,"Technolamror");
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}
