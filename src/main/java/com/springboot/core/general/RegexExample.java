package com.springboot.core.general;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author prabhakar, @Date 06-08-2024
 */
public class RegexExample {

    public static void main(String[] args) {
        //1st way
        Pattern pattern = Pattern.compile(".s");//. represents single character
        Matcher matcher = pattern.matcher("as");
        boolean status = matcher.matches();

        //2nd way
        boolean status2 = Pattern.compile(".s").matcher("as").matches();

        //3rd way
        boolean status3 = Pattern.matches(".s", "as");
        System.out.println(status + " " + status2 + " " + status3);

    }
}
