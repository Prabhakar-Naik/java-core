package com.springboot.core.arrays;

import java.util.stream.IntStream;

public class Program1 {

	public static void main(String[] args) {
		

	    int[] array = {10,3,4,6,1,9,10,0,5,2,5,8,-1,11};
	    int sum=0;
	    
	     //array=IntStream.of(array).distinct().toArray();		// for distinct pair

	    System.out.println("Pair of elements equal to 10: ");
	    for (int i=0;i<array.length;i++)
	    {
	      for (int j=i ; j<array.length;j++){


	        sum = array[i] + array[j];
	        if (sum==10){

	          System.out.println(array[i] + " + " + array[j]+" = "+sum);
	          }
	      	}
	      }
	    
	    
	    String s1 = "prabhakar";
	    String s2  = "prabhakar";
	    String s3 = new String(s1); 
	     
	  System.out.println(s1 == s2);			// reference of value is same 
	  System.out.println(s1.equals(s2));	// it will only compare with value
	  System.out.println(s1 == s3);			// because of s3 occupation different because of new key word new object and new address 
	  System.out.println(s3.equals(s2));	
	  
	    
	    
	    
	    
	}
}
