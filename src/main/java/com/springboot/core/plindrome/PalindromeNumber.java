package com.springboot.core.plindrome;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int number,reverse=0,lastdigit;
		System.out.println("Enter a number Range: ");
		Scanner sc=new Scanner(System.in);
		
		int range=sc.nextInt();
		for (int i = 1; i <= range; i++)
		{
			number = i;
			while (number > 0)
			{
				lastdigit = number % 10;
				reverse = reverse * 10 + lastdigit;
				number = number / 10;
			}
			if (reverse == i)
			{
				System.out.print(i + " ");
			}
			reverse = 0;
		}
		
	}
}
