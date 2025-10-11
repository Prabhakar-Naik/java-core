package com.springboot.java21;

/**
 * @author prabhakar, @Date 28-06-2025
 */

public class RecordPattern {

    static void inspect(Object o) {
        if (o instanceof Point(int x, int y)) {
            System.out.printf("x=%d, y=%d%n", x, y);
        }
    }

    public static int afterRecordPattern(Object obj) {
        if (obj instanceof Point(int x, int y)) {
            return x + y;
        }
        return 0;
    }

    public static void main(String[] args) {
        inspect(new Point(10,20));
        var sum = afterRecordPattern(new Point(10,20));
        System.out.println(sum);
    }
}
