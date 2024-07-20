package com.springboot.core.basic;

import java.time.LocalDate;

public class DateFormatter {
	public static void main(String[] args) {
		
		        // Get the current date
		        LocalDate today = LocalDate.now();

		        // Get the month number to increase by
		        int monthToIncrease = 10;

		        // Calculate the new date
		        LocalDate newDate = today.plusMonths(monthToIncrease);

		        // Print the new date
		        System.out.println("The date is: " + newDate);

	}
}
