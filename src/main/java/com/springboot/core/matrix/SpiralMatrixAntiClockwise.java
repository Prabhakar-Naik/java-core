package com.springboot.core.matrix;

import java.util.Scanner;

public class SpiralMatrixAntiClockwise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of the matrix: ");
		int n = sc.nextInt();
		sc.close();
		int[][] matrix = new int[n][n];
		
		int count = 1;

		int rowStart = 0, rowEnd = n - 1;
		int colStart = 0, colEnd = n - 1;

		while (rowStart <= rowEnd && colStart <= colEnd) {
			
			// Traverse left column from top to bottom
			for (int i = rowStart; i <= rowEnd; i++) {
				matrix[i][colStart] = count++;
			}
			colStart++;

			// Traverse bottom row from left to right
			for (int i = colStart; i <= colEnd; i++) {
				matrix[rowEnd][i] = count++;
			}
			rowEnd--;

			// Traverse right column from bottom to top
			for (int i = rowEnd; i >= rowStart; i--) {
				matrix[i][colEnd] = count++;
			}
			colEnd--;

			// Traverse top row from right to left
			for (int i = colEnd; i >= colStart; i--) {
				matrix[rowStart][i] = count++;
			}
			rowStart++;
		}

		// Print the matrix
		System.out.println("The spiral matrix in anti-clockwise direction is:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
