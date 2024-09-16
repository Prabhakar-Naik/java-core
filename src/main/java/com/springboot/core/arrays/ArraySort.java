package com.springboot.core.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author prabhakar, @Date 16-09-2024
 */
public class ArraySort {

    public static void main(String[] args) {

        int arr[]= {7,3,5,8,9,2,1,6};
        //1,2,3,5,6,7,8,9


        System.out.println("Normal Array Order: ");
        for(int i=0;i<=arr.length-1;i++)
            System.out.print(arr[i]+"  ");

        Arrays.sort(arr);
        System.out.println("\nAfter sorting :");
        for(int i=0;i<=arr.length-1;i++)
            System.out.print(arr[i]+"  ");


        for(int i=0;i<=arr.length-1;i++)
        {
            for(int j=i+1;j<=arr.length-1;j++)
            {
                if(arr[i]>arr[j]) {
                    arr[i]=arr[i]+arr[j];
                    arr[j]=arr[i]-arr[j];
                    arr[i]=arr[i]-arr[j];
                }

            }
        }

        System.out.println("\nPrinting Sorting order: ");
        for(int i=0;i<=arr.length-1;i++)
            System.out.print(arr[i]+"  ");

        System.out.println("\n toString ");
        System.out.println(Arrays.toString(arr));

        System.out.println("Using Streams: ");
        IntStream.of(arr).sorted().forEach(n ->System.out.print(" "+n));


    }
}
