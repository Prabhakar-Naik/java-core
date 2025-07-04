package com.springboot.java21;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.SequencedMap;
import java.util.stream.Gatherers;

/**
 * @author prabhakar, @Date 28-06-2025
 */

public class SequencedExample {

    public static void main(String[] args) {
        SequencedMap<String,Integer> map = new LinkedHashMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",3);
        map.put("D",4);
        map.put("E",5);
        System.out.println(map.firstEntry());   // A
        System.out.println(map.lastEntry());    // B
        map.forEach((k,v) -> System.out.println(k + ":" + v));
        map.reversed().forEach((k,v) -> System.out.println(k));


    }
}
