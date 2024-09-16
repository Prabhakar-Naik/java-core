package com.springboot.core.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author prabhakar, @Date 16-09-2024
 */
public class MergeArray {

    public static void main(String[] args) {

        int[] arr= {2,4,7,1,6,9,4,2,5,7};
        int[] arr1= {4,7,2,12,34,26,13,21};
        System.out.println("Merging two arrays in single Array:");

        int[] mergeArray=new int[arr.length+arr1.length];
        int pos=0;
        for(int ele:arr)
        {
            if(mergeArray.length==pos) {
                break;
            }
            else
            {
                mergeArray[pos]=ele;
                pos++;
            }
        }
        for(int ele:arr1) {

            if(mergeArray.length==pos)
            {
                break;
            }
            else
            {
                mergeArray[pos]=ele;
                pos++;
            }
        }

        System.out.println(Arrays.toString(mergeArray));
        System.out.println("Merging and distinct numbers: ");
        IntStream.of(mergeArray).sorted().distinct().forEach(n->System.out.print(n+" "));

    }
}
