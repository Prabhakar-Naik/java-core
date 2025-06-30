package com.springboot.java8.features;

import java.time.LocalDate;

/**
 * @author prabhakar, @Date 28-06-2025
 */

public class DateTimeExample {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate nextWeek = today.plusWeeks(1);
        System.out.println(today + " → " + nextWeek);
    }
}
