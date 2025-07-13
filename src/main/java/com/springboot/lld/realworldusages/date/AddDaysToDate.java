package com.springboot.lld.realworldusages.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * @author prabhakar, @Date 11-07-2025
 */

public class AddDaysToDate {

    /**
     * Add days to given date.
     *
     * @param date given date
     * @param noOfDays number of days to add
     * @return modified date
     */

    public static Date addDaysToDate(Date date, int noOfDays) {
        if (date != null){
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            cal.add(Calendar.DATE, noOfDays);
            return cal.getTime();
        }
        return null;
    }

    /**
     * Test add days to date.
     *
     * @throws ParseException if date can't be parsed
     *
     */
    //@Test
    void testAddDaysToDate() throws ParseException {
        DateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
        String dateString = "January 1, 2022";
        Date date = format.parse(dateString);

        String dateStrAfter = "January 3, 2022";
        Date dateAfterTwoDaysExpected = format.parse(dateStrAfter);

        //  here we add 2 more days to date to match the dateAfterTwoDaysExpected
        Date dateAfterTwoDaysActual = AddDaysToDate.addDaysToDate(date, 2);
        // simply checking the equal or not
        //Assertions.assertEquals(dateAfterTwoDaysExpected, dateAfterTwoDaysActual);
    }

    /**
     * Add days to local date.
     *
     * @param date given local date
     * @param noOfDays number of days to add
     * @return modified date
     */

    public static LocalDate addDaysToLocalDate(LocalDate date, int noOfDays) {
        return date != null ? date.plusDays(noOfDays) : null;
    }


    /**
     * Test add days to local date.
     */
    //@Test
    void testAddDaysToLocalDate(){
        LocalDate date = LocalDate.now();
        LocalDate dateAfterTwoDaysExpected = date.plusDays(2);

        LocalDate dateAfterTwoDaysActual = addDaysToLocalDate(date, 2);
       // Assertions.assertEquals(dateAfterTwoDaysExpected, dateAfterTwoDaysActual);
    }

}
