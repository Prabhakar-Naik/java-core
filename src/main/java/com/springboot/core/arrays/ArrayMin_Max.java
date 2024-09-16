package com.springboot.core.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author prabhakar, @Date 16-09-2024
 */
public class ArrayMin_Max {

    public static void main(String[] args) {


        int arr[]= {41,3,26,18,9,2,24,23,45,34,5,17,12,20};

        System.out.println("Own logic: Normal way ");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<arr[0])
                arr[0]=arr[i];

            if(arr[i]>arr[arr.length-1])
                arr[arr.length-1]=arr[i];
        }

        System.out.println("Min value: "+arr[0]);
        System.out.println("Max value: "+arr[arr.length-1]);

        int[] arr1= {-24,-13,3,6,1,7,21,14,-15,-10,-5,-2};

        System.out.println("Own logic: with negative numbers: ");
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]<arr1[0])
                arr1[0]=arr1[i];

            if(arr1[i]>arr1[arr1.length-1])
                arr1[arr1.length-1]=arr1[i];
        }

        System.out.println("Min value: "+arr1[0]);
        System.out.println("Max value: "+arr1[arr1.length-1]);


        System.out.println("Sorting Array we are access :");

        Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);

        System.out.println("Sorting Array we are access with negative values:");

        Arrays.sort(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[arr1.length-1]);


        System.out.println("Using Streams: ");
        System.out.println("min: "+ IntStream.of(arr).min().getAsInt());
        System.out.println("Max: "+IntStream.of(arr).max().getAsInt());
        System.out.println("Using Streams with negative numbers: ");
        System.out.println("Min: "+IntStream.of(arr1).min().getAsInt());
        System.out.println("Max: "+IntStream.of(arr1).max().getAsInt());


    }
}
