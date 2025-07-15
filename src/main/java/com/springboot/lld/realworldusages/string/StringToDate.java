package com.springboot.lld.realworldusages.string;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author prabhakar, @Date 11-07-2025
 */

public class StringToDate {

    /**
     * Convert string to date.
     *
     * @param date   the date string
     * @param format expected date format
     * @return Date
     * @throws ParseException in case of an unparseable date string
     */
    public static Date stringToDate(String date, String format) throws ParseException {
        var simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.parse(date);
    }


    /**
     * Tests for {@link StringToDate#stringToDate(String, String)}.
     */
//    @Test
//    void testStringToDate() throws ParseException {
//        var calendar = Calendar.getInstance();
//        calendar.setTime(StringToDate.stringToDate("2017-08-18", "yyyy-MM-dd"));
//        assertEquals(2017, calendar.get(Calendar.YEAR));
//        assertEquals(8, calendar.get(Calendar.MONTH) + 1);
//        assertEquals(18, calendar.get(Calendar.DAY_OF_MONTH));
//    }
}
