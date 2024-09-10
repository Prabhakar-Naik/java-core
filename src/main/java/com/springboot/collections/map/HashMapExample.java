package com.springboot.collections.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author prabhakar, @Date 10-09-2024
 */
public class HashMapExample {

    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(100,"GOT");
        map.put(101,"demon");
        map.put(102,"marvel");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
