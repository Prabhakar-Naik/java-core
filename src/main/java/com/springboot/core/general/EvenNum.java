package com.springboot.core.general;

import java.util.stream.IntStream;

public class EvenNum {

	public static void main(String[] args) {
		
		System.out.println("Enter a number: ");
		
		int n=24;
		
		if(n%2 == 0)
			System.out.println(n+" Even number..");
		else
			System.out.println(n+" Not Even number");
		
		
		System.out.println("Even numbers 1 to 100 with condition: ");
		
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
				System.out.print(i+"  ");
		}
		
		System.out.println("\nEven numbers 1 to 100 without condition: ");
		
		for(int i=0;i<=100;i=i+2)
		{
			System.out.print(i+"  ");
		}
		System.out.println("\nEven numbers 1 to 100 with Stream API: ");
		IntStream.range(1,100).filter(num ->num%2==0).forEach(num->System.out.print(num+"  "));
		
		
		
	}
}
