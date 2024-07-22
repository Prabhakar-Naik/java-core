package com.springboot.core.armstrong;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d, rev = 0, temp = n;
		if (temp >= 1 && temp <= 9) {
			System.out.println(temp + " Armstrong number");
			return;
		} else if (temp >= 10 && temp <= 100) {
			System.out.println(n+" Not an Armstrong number");
		}else {

			while (n > 0) {
				d = n % 10;
				rev = rev + (d * d * d); //Math.pow(d, 3);
				n = n / 10;
			}
			if (temp == rev)
				System.out.println(temp + " is Armstrong Number");
			else
				System.out.println(temp+" Not an Armstrong number");

			sc.close();
		}
	}
}
