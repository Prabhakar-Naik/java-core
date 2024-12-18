package com.springboot.core.arrays;

import com.springboot.streams.IntStreams;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author prabhakar, @Date 17-12-2024
 */
public class ArraySum {

    public static void main(String[] args) {

        int[] arr = {2,5,6,78,9,-2,-40,23,56};
        int sum = 0;
        // enhanced for loop or foreach loop java8 feature
        for (int i: arr){
            sum += i;
        }
        System.out.println(sum + " -> foreach");

        // for loop
        sum = 0;
        for (int i=0; i< arr.length;i++){
            sum += arr[i];
        }
        System.out.println(sum+ " -> for loop");

        // while loop
        sum = 0;
        int i =0;
        while (i < arr.length){
            sum += arr[i];
            i++;
        }
        System.out.println(sum+ " -> while loop");

        // using Array stream java8 feature
        sum = Arrays.stream(arr).sum();
        System.out.println(sum+ " -> Array stream java8");

        //Using Stream.reduce():
        sum = Arrays.stream(arr).reduce(0, (a, b) -> a + b); // or below
        //sum = Arrays.stream(arr).reduce(0, Integer::sum);
        System.out.println(sum+ " -> Array Stream.reduce()");

        // Stream.reduce() with method reference
        sum = Arrays.stream(arr).reduce(Integer::sum).getAsInt();
        System.out.println(sum+ " -> Array Stream.reduce() with method reference");

        // Using Collectors.summingInt():
        List<Integer> list = Arrays.stream(arr).boxed().toList();
        sum = list.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println(sum+ " -> Using Collectors.summingInt() ");

        sum = list.parallelStream().mapToInt(Integer::intValue).sum();
        System.out.println(sum+ " -> Using parallelStream() ");

        // IntStream.range():
        sum = IntStream.range(0, arr.length).map(j -> arr[j]).sum();
        System.out.println(sum+ " -> Array IntStream.range()");

        //forEach() with AtomicInteger:
        AtomicInteger sum1 = new AtomicInteger();
        Arrays.stream(arr).forEach(sum1::addAndGet);
        System.out.println(sum1 +" -> forEach() with AtomicInteger:");

        //using IntStream
        sum = IntStream.of(arr).sum();
        System.out.println(sum+" -> using IntStream java8");

        sum = (int) IntStream.of(arr).summaryStatistics().getSum();
        System.out.println(sum+" -> using IntStream java8 summaryStatistics");

        // no diff for sorting
//        Arrays.parallelSort(arr);
//        Arrays.sort(arr);

        for (int j: arr)
            System.out.println(j);

        // Arrays.parallelPrefix() you can prefer this is the last choice
        Arrays.parallelPrefix(arr, Integer::sum);
        sum = arr[arr.length - 1];
        System.out.println(sum+ " -> Arrays.parallelPrefix()");


    }
}
