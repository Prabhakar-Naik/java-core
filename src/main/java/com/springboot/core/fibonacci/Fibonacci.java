package com.springboot.core.fibonacci;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		int next,first=0,second=1;
		for(int i=0;i<10;i++)
		{
			
			if(i<=1)
				next=i;
			else
			{
				next=first+second;
				first=second;
				second=next;
			}
			System.out.print(" "+next);
		}
	}

}
