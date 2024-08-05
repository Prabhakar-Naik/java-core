package com.springboot.datepros;

/**
 * @author prabhakar, @Date 05-08-2024
 */
public class SQLDateExample {
    public static void main(String[] args) {
        long millis=System.currentTimeMillis();
        java.sql.Date date=new java.sql.Date(millis);
        System.out.println(date);
    }
}
