package com.springboot.enums;

/**
 * @author prabhakar, @Date 26-12-2024
 */
public class EnumTest {

    public static void main(String[] args) {
        System.out.println("According to requirements");

        System.out.println("Class variable Printing:");
        System.out.println(DayClass.SUNDAY);
        System.out.println(DayClass.MONDAY);
        System.out.println(DayClass.TUESDAY);
        System.out.println(DayClass.WEDNESDAY);
        System.out.println(DayClass.THURSDAY);
        System.out.println(DayClass.FRIDAY);
        System.out.println(DayClass.SATURDAY);

        System.out.println("Interface Attribute Printing:");
        System.out.println(Days.SUNDAY);
        System.out.println(Days.MONDAY);
        System.out.println(Days.TUESDAY);
        System.out.println(Days.WEDNESDAY);
        System.out.println(Days.THURSDAY);
        System.out.println(Days.FRIDAY);
        System.out.println(Days.SATURDAY);


        Day[] days = Day.values();

        System.out.println("English: ");
        for (Day day : days) {
            System.out.println(day.englishName());
        }

        System.out.println("Telugu: ");
        for (Day day : days) {
            System.out.println(day.teluguName());
        }

        System.out.println("Colours: ");
        Color[] colors = Color.values();

        for (Color color : colors) {
            System.out.println(color);
        }

        System.out.println("Months: ");
        Month[] months = Month.values();
        for (Month month : months) {
            System.out.println(month);
        }

        System.out.println("Switch cases: ");
        String day = Days.FRIDAY;
        String result = switch (day) {
            case Days.MONDAY -> "M";
            case Days.TUESDAY -> "T";
            case Days.THURSDAY -> "THU";
            default -> "WEEKEND";
        };
        System.out.println(result);

        switch (day) {
            case DayClass.FRIDAY: {
                System.out.println("F");
                break;
            }
        }



    }
}
