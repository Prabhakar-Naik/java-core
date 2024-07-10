package com.springboot.core.general;

import java.util.stream.IntStream;

public class OddNum {

	public static void main(String[] args) {
		
		System.out.println("Enter a number: ");
		int n=23;
		if(n%2 != 0 && n%2 == 1)
			System.out.println(n+" is Odd number");
		else
			System.out.println(n+" is not Odd number");
		
		System.out.println("Odd numbers 1 to 100 with condition: ");
		
		for(int i=1;i<=100;i++)
		{
			if(i%2 != 0 && i%2 == 1)
				System.out.print(i+"  ");
		}
		
		int oddSum= 0;
		for(int i=2;i<=10;i++)
			if(i%2!=0)
				oddSum += i;
		
		System.out.println("  --? "+oddSum);
		
		System.out.println("\nOdd numbers 1 to 100 without condition");
		for(int i=1;i<=100;i=i+2)
		{
			System.out.print(i+"  ");
		}
		
		System.out.println("\nOdd Numbers 1 to 100 with Stream API:");
		IntStream.range(1,100).filter(num -> num%2!=0).forEach(num -> System.out.print(num+"  "));
		
		System.out.println("\nOdd Number 1 to 100 with Stream API Another style: ");
		IntStream.range(1,100).filter(nu ->nu%2==1).forEach(nu ->System.out.print(nu+"  "));
	}
}
