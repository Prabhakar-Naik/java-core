package com.springboot.datepros;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author prabhakar, @Date 05-08-2024
 */
public class StringToSQLDateExample {

    public static void main(String[] args) throws ParseException {
        String str="2015-03-31";
        //converting string into sql date
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date sqlDate = formatter.parse(str);
        Date date = new Date(sqlDate.getTime());
        System.out.println(date);
    }
}
