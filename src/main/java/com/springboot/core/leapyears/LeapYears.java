package com.springboot.core.leapyears;

import java.util.Scanner;

public class LeapYears {

	public static void main(String[] args) {
		
		System.out.println("Enter a Century : ");
		Scanner sc=new Scanner(System.in);
		int century=sc.nextInt();
		
		System.out.println("Leap years from 1 to "+century);
		for(int i=1000;i<=century;i++)
		{
			if(i%100==0 && i%400==0 || i%100!=0 && i%4==0)
				System.out.print(i+"  ");
			
		}
	}
}
