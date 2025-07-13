package com.springboot.lld.realworldusages.date;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @author prabhakar, @Date 11-07-2025
 */

public class DateDifference {

    /**
     * This function calculates the number of years between two LocalDate objects.
     * If the result is negative, it returns the absolute value of the difference.
     *
     * @param firstDate  The first LocalDate object representing the starting date
     * @param secondDate The second LocalDate object representing the ending date
     * @return The number of years between the two LocalDate objects as a long data type
     */

    public static long getYearsDifference(LocalDate firstDate, LocalDate secondDate) {
        var yearsDifference = ChronoUnit.YEARS.between(firstDate, secondDate);
        return Math.abs(yearsDifference);
    }


    /**
     * This function calculates the number of months between two LocalDate objects.
     * If the result is negative, it returns the absolute value of the difference.
     *
     * @param firstDate  The first LocalDate object representing the starting date
     * @param secondDate The second LocalDate object representing the ending date
     * @return The number of months between the two LocalDate objects as a long data type
     */
    public static long getMonthsDifference(LocalDate firstDate, LocalDate secondDate) {
        var monthsDifference = ChronoUnit.MONTHS.between(firstDate, secondDate);
        return Math.abs(monthsDifference);
    }

    /**
     * This function calculates the number of days between two LocalDate objects.
     * If the result is negative, it returns the absolute value of the difference.
     *
     * @param firstDate  The first LocalDate object representing the starting date
     * @param secondDate The second LocalDate object representing the ending date
     * @return The number of days between the two LocalDate objects as a long data type
     */

    public static long getDaysDifference(LocalDate firstDate, LocalDate secondDate) {
        var daysDifference = ChronoUnit.DAYS.between(firstDate, secondDate);
        return Math.abs(daysDifference);
    }

    /**
     * Tests for {@link DateDifference#getYearsDifference(LocalDate, LocalDate)},
     * {@link DateDifference#getMonthsDifference(LocalDate, LocalDate)},
     * {@link DateDifference#getDaysDifference(LocalDate, LocalDate)}.
     */

    //@Test
    void testAddDaysToDate(){
        var date1 = LocalDate.of(1998, 9, 24);
        var date2 = LocalDate.of(2023, 3, 22);

//        assertEquals(24, DateDifference.getYearsDifference(date1, date2));
//        assertEquals(293, DateDifference.getMonthsDifference(date1, date2));
//        assertEquals(8945, DateDifference.getDaysDifference(date1, date2));
    }

    public static void main(String[] args) {

        var date1 = LocalDate.of(1998, 9, 24);
        var date2 = LocalDate.of(2023, 3, 22);

        System.out.println(getYearsDifference(date1, date2));
        System.out.println(getMonthsDifference(date1, date2));
        System.out.println(getDaysDifference(date1, date2));
        
        System.out.println(getYearsDifference(LocalDate.of(2020, 1, 1), LocalDate.of(2025, 1, 1)));
        System.out.println(getMonthsDifference(LocalDate.of(2020, 1, 1), LocalDate.of(2024, 1, 1)));
        System.out.println(getDaysDifference(LocalDate.of(2020, 1, 1), LocalDate.of(2026, 1, 1)));

    }
}
