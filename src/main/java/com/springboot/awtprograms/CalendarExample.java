package com.springboot.awtprograms;

import java.util.Calendar;
/**
 * @author prabhakar, @Date 02-09-2024
 */

public class CalendarExample {
    public static void main(String[] args) {
        // Create a calendar instance
        Calendar calendar = Calendar.getInstance();

        // Set a specific date (Year, Month, Day)
        calendar.set(Calendar.YEAR, 2024);
        calendar.set(Calendar.MONTH, Calendar.SEPTEMBER); // Note: Months are 0-based in Java
        calendar.set(Calendar.DAY_OF_MONTH, 2);

        // Print the set date
        System.out.println("Set Date: " + calendar.getTime());

        // Add 10 days to the current date
        calendar.add(Calendar.DAY_OF_MONTH, 10);
        System.out.println("Date after adding 10 days: " + calendar.getTime());

        // Subtract 5 months from the current date
        calendar.add(Calendar.MONTH, -5);
        System.out.println("Date after subtracting 5 months: " + calendar.getTime());

        // Get specific fields
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // Adding 1 to month as it is 0-based
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
    }
}

