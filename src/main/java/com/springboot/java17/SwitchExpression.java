package com.springboot.java17;

import java.time.DayOfWeek;

/**
 * @author prabhakar, @Date 28-06-2025
 */

public class SwitchExpression {

    static String dayType(DayOfWeek d) {
        return switch(d) {
            case SATURDAY, SUNDAY -> "Weekend";
            default -> "Weekday";
        };
    }

    public static void main(String[] args) {
        System.out.println(dayType(DayOfWeek.SATURDAY));
    }

}
