package com.springboot.core.advance;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author prabhakar, @Date 10-07-2024
 */
public class ExtractDateFromText {
    public static void main(String[] args) {
        String text = "wekj46fjkf2023vjf2022-10-22vkv9kds56fj";

        System.out.println(extractDate(text));
        System.out.println(findDateInText(text));
        System.out.println(extractDate1(text));
        System.out.println(extractDate2(text));


        /* Easy one*/
        // Regular expression to match a date format (YYYY-MM-DD)
        String regex = "\\d{4}-\\d{2}-\\d{2}";

        // Use a matcher to find the first occurrence of the date format
        Matcher matcher = Pattern.compile(regex).matcher(text);

        // Check if a match is found
        if (matcher.find()) {
            // Extract the matched date
            String date = matcher.group();
            System.out.println("Extracted date: " + date);
        } else {
            System.out.println("No date format found in the string.");
        }


    }

    /* more complex for me*/
    private static String extractDate(String text){
        for (int i = 0; i < text.length(); i++) {
            // Check if current character is a digit
            if (Character.isDigit(text.charAt(i))) {
                int yearEndIndex = text.indexOf('-', i);
                if (yearEndIndex != -1) { // Found potential year-month separator
                    int monthEndIndex = text.indexOf('-', yearEndIndex + 1);
                    if (monthEndIndex != -1 && yearEndIndex - i == 4 && monthEndIndex - yearEndIndex == 3) {
                        // Found date pattern YYYY-MM-DD
                        return text.substring(i, monthEndIndex + 3);
                    }
                }
            }
        }
        return null; // Date not found
    }

    /* This is fine for understanding.*/
    private static String findDateInText(String text) {
        for (int i = 0; i <= text.length() - 10; i++) { // Ensure there's enough chars left for a date
            String substring = text.substring(i, i + 10); // Extract potential date substring
            if (Character.isDigit(substring.charAt(0)) && Character.isDigit(substring.charAt(1))
                    && Character.isDigit(substring.charAt(2)) && Character.isDigit(substring.charAt(3))
                    && substring.charAt(4) == '-' && Character.isDigit(substring.charAt(5))
                    && Character.isDigit(substring.charAt(6)) && substring.charAt(7) == '-'
                    && Character.isDigit(substring.charAt(8)) && Character.isDigit(substring.charAt(9))) {
                // Check if the substring matches the YYYY-MM-DD pattern
                return substring;
            }
        }
        return null; // Return null if no date is found
    }

    /* This is probably everyone can understand.*/
    private static String extractDate1(String text) {
        List<String> dateFormats = new ArrayList<>();
        dateFormats.add("yyyy-MM-dd"); // Add other date formats if necessary

        for (String dateFormat : dateFormats) {
            SimpleDateFormat format = new SimpleDateFormat(dateFormat);
            for (int i = 0; i <= text.length() - dateFormat.length(); i++) {
                String substring = text.substring(i, i + dateFormat.length());
                try {
                    format.parse(substring.trim()); // Attempt to parse the substring
                    return substring; // Return the successfully parsed date
                } catch (ParseException e) {
                    // Ignore and continue if parsing fails
                }
            }
        }
        return null; // Return null if no date is found
    }


    /* This is also like above one with different date formats.*/
    private static String extractDate2(String text) {
        List<String> dateFormats = Arrays.asList(
                "yyyy-MM-dd", "MM/dd/yyyy", "dd-MMM-yy"
                // Add more formats as needed
        );

        for (String dateFormat : dateFormats) {
            DateFormat format = new SimpleDateFormat(dateFormat);
            for (int i = 0; i <= text.length() - dateFormat.length(); i++) {
                String substring = text.substring(i, i + dateFormat.length());
                try {
                    Date parsedDate = format.parse(substring.trim());
                    return format.format(parsedDate); // Return the formatted date
                } catch (ParseException e) {
                    // Ignore and continue if parsing fails
                }
            }
        }
        return null; // Return null if no date is found
    }


}

