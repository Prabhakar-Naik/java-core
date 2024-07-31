package com.springboot.core.matrix;

/**
 * @author prabhakar, @Date 31-07-2024
 */
public class TwoDimensionalArray {

    public static void main(String[] args) {

//        int[][] array = new int[3][4];
        int[][] array = {{1, 2, 3}, {4, 5, 6},{1,2,3}};
//        System.out.println(array[0].length);
//        System.out.println(array[1].length);

        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array[1].length; j++)
                System.out.print(array[i][j]+" ");
            System.out.println();
        }

    }
}
