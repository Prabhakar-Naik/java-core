package com.springboot.core.matrix;

import java.util.Scanner;

/**
 * @author prabhakar, @Date 31-07-2024
 */
public class SquareMatrix {

    public static void main(String[] args) {

        int row, col;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter row and column:");
        row = input.nextInt();
        col = input.nextInt();

        System.out.println("Enter "+(row*col)+" elements");
        int[][] data = new int[row][col];

        for (int i=0; i<row;i++){
            for (int j=0; j<col;j++){
                data[i][j] = input.nextInt();
            }
        }

        System.out.println("Here your elements");
        for (int i=0;i<row; i++){
            for (int j=0;j<col; j++)
                System.out.print(data[i][j]+" ");

        }

        System.out.println("\nHere square of above numbers");
        for (int i=0;i<row; i++){
            for (int j=0;j<col; j++)
                System.out.print(data[i][j] * data[i][j]+" ");

        }


    }
}
