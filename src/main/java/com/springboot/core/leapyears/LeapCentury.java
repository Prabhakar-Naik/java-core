package com.springboot.core.leapyears;

import java.util.Scanner;

public class LeapCentury {

	public static void main(String[] args) {
		
		System.out.println("Enter a century: ");
		Scanner sc=new Scanner(System.in);
		int century=sc.nextInt();
		
		if(century%100==0 && century%400==0)
			System.out.println(century+" is Leap Century");
		else
			System.out.println(century+" is Not a Leap Century");
		
		
		System.out.println("Leap Centuries from 100 to 3000: ");
		for(int i=100;i<=3000;i++)
		{
			if(i%100==0 && i%400==0)
				System.out.print(i+ "  ");
		}
	}
}
