package com.springboot.core.matrix;

import java.util.Scanner;

/**
 * @author prabhakar, @Date 31-07-2024
 */
public class TransposeAMatrix {

    public static void main(String[] args) {

        int rows, columns, i, j;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of matrix");
        rows = in.nextInt();
        columns = in.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the elements of matrix");

        for ( i = 0 ; i < rows ; i++ )
            for ( j = 0 ; j < columns ; j++ )
                matrix[i][j] = in.nextInt();

        int[][] transpose = new int[columns][rows];

        for ( i = 0 ; i < rows ; i++ )
        {
            for ( j = 0 ; j < columns ; j++ )
                transpose[j][i] = matrix[i][j];
        }

        System.out.println("Transpose of entered matrix:-");
        for ( i = 0 ; i < columns ; i++ )
        {
            for ( j = 0 ; j < rows ; j++ )
                System.out.print(transpose[i][j]+"\t");
            System.out.print("\n");
        }

    }
}
