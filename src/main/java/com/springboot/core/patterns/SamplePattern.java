package com.springboot.core.patterns;

public class SamplePattern {

	public static void main(String[] args) {
		
		System.out.println("This is Stars: ");
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=7;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("This is column vlues: ");
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=7;j++)
				System.out.print(j+" ");
			System.out.println();
		}
		
		System.out.println("This is Row values: ");
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=7;j++)
				System.out.print(i+" ");
			System.out.println();
		}
		
		System.out.println("This is Even columns: ");
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=7;j++) {
				
				if(j%2==0)
					System.out.print(j+" ");
			}
				
			System.out.println();
		}
		
		System.out.println("This is Even Rows: ");
		
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=7;j++) {
				
				if(i%2==0)
					System.out.print(i+" ");
			}
			System.out.println();
		}
		
		System.out.println("This is odd Rows: ");
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=7;j++) {
				
				if(i%2!=0)
					System.out.print(i+" ");
			}
				
			System.out.println();
		}
		
		System.out.println("This is odd columns: ");
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=7;j++) {
				
				if(j%2!=0)
					System.out.print(j+" ");
			}
				
			System.out.println();
		}
		System.out.println("This is + symbols:");
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=7;j++)
				System.out.print("+ ");
			System.out.println();
		}
		System.out.println("This is Dollar symbols:");
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=7;j++)
				System.out.print("$ ");
			System.out.println();
		}
		
	}
}
