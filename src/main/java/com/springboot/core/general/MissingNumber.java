package com.springboot.core.general;

public class MissingNumber {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,7,8,9};
		System.out.println("Length of array: "+arr.length);
		
		int totalSum=(arr.length+1)*(arr.length+2)/2;
		System.out.println(totalSum);
		
		System.out.println("Sum of all the numbers: "+totalSum);
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			
		}
		System.out.println(sum);
		int missNum=totalSum-sum;
		System.out.println("Missing number is: "+missNum);
		
	}
}
