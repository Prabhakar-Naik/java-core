package com.springboot.core.arrays;

import java.util.HashSet;

/**
 * @author prabhakar, @Date 16-09-2024
 */
public class DuplicatesInArray {
    public static void main(String[] args) {

        int[] arr= {2,4,5,7,5,3,2,5,2,7,8,7,8,9};

        System.out.println("Using normal for loop: all duplicates with original value ");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i]==arr[j])
                    System.out.print(arr[i]+"  ");
            }
        }


        System.out.println("\nBy using Hashset Collection: duplicates without originals ");
        HashSet<Integer> set=new HashSet<>();

        for(int num:arr) {
            if(!set.add(num))
                System.out.print(num+"  ");
        }

    }
}
