package com.springboot.core.evenodd;

/**
 * @author prabhakar, @Date 16-09-2024
 */
public class ArrayOdd {

    public static void main(String[] args) {

        int[] arr= {2,4,3,5,6,4,5,7,8,9,3,8,10};

        int oddlength=0;

        for(int i=0;i<=arr.length-1;i++) {

            if(arr[i] % 2 != 0)
                oddlength++;
        }

        int odd[]=new int[oddlength];

        int oddindex = 0;

        for(int i=0;i<=arr.length-1;i++) {
            if(arr[i] % 2 != 0) {
                odd[oddindex]=arr[i];
                oddindex++;
            }

        }

        System.out.println("Original Array length: "+arr.length);
        System.out.println("length of odd Array: "+odd.length);
        System.out.println("Elements in odd array: ");
        for(int i=0;i<=odd.length-1;i++)
        {
            System.out.print(" "+odd[i]);
        }
    }
}
