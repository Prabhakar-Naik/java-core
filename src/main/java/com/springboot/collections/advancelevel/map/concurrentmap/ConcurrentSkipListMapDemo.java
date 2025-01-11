package com.springboot.collections.advancelevel.map.concurrentmap;

import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapDemo {

    /*
    1,2,3,4,5,6,7,8,9

    probabilistic data structure that allows for efficient search, insertion, and deletion operations.

    It is similar to a sorted linked list but with multiple layers that "skip" over portions of the
    list to provide faster access to elements.

    In SkipList:
        by default sorted data
        multiple layers (levels)
            level 1 : complete data
            level 2 : skip the elements alternatively
            level 3 : skip the more elements between first element and last element
             
        fast access the data

    */


    public static void main(String[] args) {

        ConcurrentSkipListMap<String, String> map = new ConcurrentSkipListMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");


    }
}
