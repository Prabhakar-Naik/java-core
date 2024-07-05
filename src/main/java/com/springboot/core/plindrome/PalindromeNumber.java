package com.springboot.core.plindrome;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int n,rev=0,b;
		System.out.println("Enter a number Range: ");
		Scanner sc=new Scanner(System.in);
		
		int range=sc.nextInt();
		for (int i = 1; i <= range; i++)
		{
			n = i;
			while (n > 0)
			{
				b = n % 10;
				rev = rev * 10 + b;
				n = n / 10;
			}
			if (rev == i)
			{
				System.out.print(i + " ");
			}
			rev = 0;
		}
		
	}
}
