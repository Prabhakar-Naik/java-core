package com.springboot.java21;

import java.util.*;
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


        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("JDK 17");
        deque.addLast("JDK 21");
        String front = deque.getFirst(); // "JDK 17"
        String back = deque.getLast(); // "JDK 21"
        System.out.println(front);
        System.out.println(back);

    }
}
