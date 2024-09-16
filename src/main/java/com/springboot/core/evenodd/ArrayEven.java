package com.springboot.core.evenodd;

/**
 * @author prabhakar, @Date 16-09-2024
 */
public class ArrayEven {

    public static void main(String[] args) {

        int[] arr= {2,4,3,5,6,4,5,7,8,9,3,8,10};

        int evenlength=0;

        for(int i=0;i<=arr.length-1;i++) {

            if(arr[i]%2==0)
                evenlength++;
        }

        int even[]=new int[evenlength];

        int eveindex=0;

        for(int i=0;i<=arr.length-1;i++) {
            if(arr[i]%2==0) {
                even[eveindex]=arr[i];
                eveindex++;
            }

        }

        System.out.println("Original Array length: "+arr.length);
        System.out.println("length of even Array: "+even.length);
        System.out.println("Elements in even array: ");
        for(int i=0;i<=even.length-1;i++)
        {
            System.out.print(" "+even[i]);
        }
    }
}
