package com.springboot.core.matrix;

import java.util.Scanner;

/**
 * @author prabhakar, @Date 31-07-2024
 */
public class AddTwoMatrix {

    /*
    input: first 2 2
        enter first matrix: 1 2 3 4
        enter second matrix: 5 6 7 8
    given out put:
    sum of index value

    */
    public static void main(String[] args) {

        int row, colum, i, j;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of matrix");
        row = in.nextInt();
        colum = in.nextInt();

        int[][] first = new int[row][colum];
        int[][] second = new int[row][colum];
        int[][] sum = new int[row][colum];

        System.out.println("Enter the elements of first matrix");

        for (i = 0; i < row; i++)
            for (j = 0; j < colum; j++)
                first[i][j] = in.nextInt();

        System.out.println("Enter the elements of second matrix");

        for (i = 0; i < row; i++)
            for (j = 0; j < colum; j++)
                second[i][j] = in.nextInt();

        for (i = 0; i < row; i++)
            for (j = 0; j < colum; j++)
                sum[i][j] = first[i][j] + second[i][j];

        //replace '+' with '-' to subtract matrices

        System.out.println("Sum of entered matrices:-");

        for (i = 0; i < row; i++) {
            for (j = 0; j < colum; j++)
                System.out.print(sum[i][j] + "\t");

            System.out.println();
        }
    }
}
