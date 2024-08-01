package com.springboot.core.arrays;

/**
 * @author prabhakar, @Date 31-07-2024
 */
public class MiddleElements {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};

        int length = array.length;

        System.out.println(array[length/2-1]);
        System.out.println(array[length/2]);

        if (length % 2 == 0){
            int middleIndex1 = length/2;
            int middleIndex2 = length/2-1;

            double middleEle = array[middleIndex1]+array[middleIndex2] / 2.0;
            System.out.println(middleEle);
            System.out.println(array[middleIndex1]+" "+array[middleIndex2]);
        }else {
            System.out.println(array[length/2]);
        }
    }
}
