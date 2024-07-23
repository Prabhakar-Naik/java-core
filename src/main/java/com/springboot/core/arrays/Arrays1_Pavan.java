package com.springboot.core.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrays1_Pavan {

	public static void main(String[] args) {
		
		int[] array = {100,103,107,160,180,198,200,203,250,280,297,300,306,240,360,394,403,460,473,500,
				510,538,520,580,573,599,625,654,673,649,696,703,730,745,738,784,780,306,794,800,4654};
		
		System.out.println("Enter your input: ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		ArrayList<Integer> numArray= new ArrayList<Integer>();
		
	for(int num: array) {
			int range = input * 100;
		
			if(num >= range && num < (range+100)) {
				numArray.add(num);
			}
		}
		System.out.println(numArray);
		sc.close();
	}
}
