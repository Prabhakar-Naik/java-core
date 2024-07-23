package com.springboot.core.basic;

import java.util.Scanner;

public class WholeNumOrNaturalNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        sc.close();
        
        if (num <= 0) 									// check if number is less than or equal to zero
            System.out.println("Invalid input. Number should be greater than zero.");
        else if (num % 1 == 0) 							// check if number is a whole number
            System.out.println("You entered a whole number: " + num);
        else 
            System.out.println("You entered a natural number: " + num);
        
	}
}
