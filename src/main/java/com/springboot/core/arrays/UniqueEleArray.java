package com.springboot.core.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.IntStream;

/**
 * @author prabhakar, @Date 16-09-2024
 */
public class UniqueEleArray {

    public static void main(String[] args) {

        int[] arr= {1,2,4,3,5,2,1,5,3,6,4,7,7,8,4,6,9,4,9};

        HashMap<Integer,Integer> map=new HashMap<>();

        System.out.println("Using HashMap collection finding unique elements: ");
        for(int i=0;i<arr.length;i++)
            map.put(arr[i], i);

        System.out.println(map.keySet());

        System.out.println("Using Stream finding distinct values: ");

        IntStream.of(arr).sorted().distinct().forEach(n->System.out.print(n+"  "));

        System.out.println("\nUsing HashSet collection finding unique elements: ");
        HashSet<Integer> set=new HashSet<>();

        for(int unique:arr) {
            set.add(unique);
        }

        for(int unique:set)
            System.out.print(unique+"  ");

    }
}
