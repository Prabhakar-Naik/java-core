package com.springboot.core.armstrong;

import java.util.Scanner;

public class ArmstrongNumbers1 {

	public static void main(String[] args) {
		
		System.out.println("Enter armstrong Number Range: ");
		Scanner sc=new Scanner(System.in);
		int range=sc.nextInt();
		
		int last,sum=0,n;
		System.out.println("Armstrong Numbers from 1000 to "+range);
		for(int i=1000;i<=range;i++)
		{
			
			n=i;
			while(n>0)
			{
				last=n%10;
				sum+=(last*last*last*last);
				n=n/10;
			}
			if(sum==i)
				System.out.print(sum+"  ");
			
			sum=0;
			
		}
		
		
	}
}
