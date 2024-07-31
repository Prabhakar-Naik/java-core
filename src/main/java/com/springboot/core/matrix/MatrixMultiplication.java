package com.springboot.core.matrix;

import java.util.Scanner;

/**
 * @author prabhakar, @Date 31-07-2024
 */
public class MatrixMultiplication {

    public static void main(String[] args) {

        int f_rows, f_columns, s_rows, s_columns, result = 0, i, j, k;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of first matrix");
        f_rows = in.nextInt();
        f_columns = in.nextInt();

        int[][] first = new int[f_rows][f_columns];

        System.out.println("Enter the elements of first matrix");

        for ( i = 0 ; i < f_rows ; i++ )
            for ( j = 0 ; j < f_columns ; j++ )
                first[i][j] = in.nextInt();

        System.out.println("Enter the number of rows and columns of second matrix");
        s_rows = in.nextInt();
        s_columns = in.nextInt();

        if ( f_columns != s_rows )
            System.out.println("Matrices with entered orders can't be multiplied with each other.");
        else {
            int[][] second = new int[s_rows][s_columns];
            int[][] multiply = new int[f_rows][s_columns];

            System.out.println("Enter the elements of second matrix");

            for (i = 0; i < s_rows; i++)
                for (j = 0; j < s_columns; j++)
                    second[i][j] = in.nextInt();

            for (i = 0; i < f_rows; i++) {
                for (j = 0; j < s_columns; j++) {
                    for (k = 0; k < s_rows; k++) {
                        result = result + first[i][k] * second[k][j];
                    }

                    multiply[i][j] = result;
                    result = 0;
                }
            }

            System.out.println("Product of entered matrices:-");

            for (i = 0; i < f_rows; i++) {
                for (j = 0; j < s_columns; j++)
                    System.out.print(multiply[i][j] + "\t");

                System.out.print("\n");
            }
        }
    }
}
