package com.springboot.core.matrix;

import java.util.Scanner;

public class SpiralMatrixClockWise {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of matrix: ");
		int n = sc.nextInt();
		sc.close();
		
		int[][] matrix = new int[n][n];
		int num = 1;
		int rowStart = 0, rowEnd = n - 1;
		int colStart = 0, colEnd = n - 1;

		while (num <= n * n) {
			
			for (int i = colStart; i <= colEnd; i++) {
				matrix[rowStart][i] = num++;
			}

			for (int i = rowStart + 1; i <= rowEnd; i++) {
				matrix[i][colEnd] = num++;
			}

			for (int i = colEnd - 1; i >= colStart; i--) {
				matrix[rowEnd][i] = num++;
			}

			for (int i = rowEnd - 1; i >= rowStart + 1; i--) {
				matrix[i][colStart] = num++;
			}

			rowStart++;
			rowEnd--;
			colStart++;
			colEnd--;
		}

		System.out.println("Spiral Matrix:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}		        
	}
}
