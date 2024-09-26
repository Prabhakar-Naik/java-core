package com.springboot.core.matrix;

/**
 * @author prabhakar, @Date 16-09-2024
 */
public class MultiDimensionalArray {

    public static void main(String[] args) {

        int[][][] arr= {{{1,2,3,4},{5,6,7},{3,5,8,9,23,45,32}}};


        for(int[][] ar:arr) {

            for(int am[]:ar) {

                for(int a:am)
                    System.out.print(a+" ");

                System.out.println();
            }

        }

        System.out.println(arr[0][0][0]);
        System.out.println(arr[0][0][1]);
        System.out.println(arr[0][0][2]);
        System.out.println(arr[0][0][3]);
        System.out.println(arr[0][1][0]);
        System.out.println(arr[0][1][1]);
        System.out.println(arr[0][1][2]);
        System.out.println(arr[0][2][0]);
        System.out.println(arr[0][2][1]);
        System.out.println(arr[0][2][2]);
        System.out.println(arr[0][2][3]);
        System.out.println(arr[0][2][4]);
        System.out.println(arr[0][2][5]);
        System.out.println(arr[0][2][6]);

    }
}
