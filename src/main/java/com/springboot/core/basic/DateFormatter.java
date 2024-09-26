package com.springboot.core.basic;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateFormatter {
    public static void main(String[] args) {

        // Get the current date
        LocalDate today = LocalDate.now();
        LocalTime localTime = LocalTime.now();

        // Get the month number to increase by
        int monthToIncrease = 10;

        // Calculate the new date
        LocalDate newDate = today.plusMonths(monthToIncrease);

        // Print the new date
        System.out.println("The date is: " + newDate);
        System.out.println("The time is: "+ localTime);

    }
}
