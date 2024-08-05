package com.springboot.core.advance;

/**
 * @author prabhakar, @Date 05-08-2024
 */
public class GarbageCollector {

    public static void main(String[] args) {

        Runtime rs = Runtime.getRuntime();
        System.out.println("Free memory in JVM before Garbage Collection = " + rs.freeMemory());
        rs.gc();
        System.out.println("Free memory in JVM after Garbage Collection = " + rs.freeMemory());
    }

}
