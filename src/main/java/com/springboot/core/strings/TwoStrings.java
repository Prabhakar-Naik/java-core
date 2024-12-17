package com.springboot.core.strings;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;

/**
 * @author prabhakar, @Date 16-12-2024
 */
public class TwoStrings {

    public static void main(String[] args) {

        String name = "prabha";
        String copyName = new String(name);
        String anotherName = new String("prabha");

        // it will check the address of variable as well value
        System.out.println(name == name);
        System.out.println(name == copyName);
        System.out.println(name == anotherName);
        System.out.println(copyName == anotherName);

        System.out.println("Another format");
        // it will check the value only rather address
        System.out.println(name.equals(name));
        System.out.println(name.equals(copyName));
        System.out.println(name.equals(anotherName));
        System.out.println(copyName.equals(anotherName));

        var length = name.length();
        System.out.println(length);

        System.out.println(name.charAt(length-1));
        System.out.println(name.startsWith("p"));
        System.out.println(name.startsWith("p",1));
        System.out.println(name.getBytes(StandardCharsets.UTF_8));
        System.out.println(Arrays.toString(name.getBytes(StandardCharsets.UTF_8)));
        System.out.println(name.getBytes());
        System.out.println(name.getClass());
        System.out.println(name.strip());
        System.out.println(name.endsWith("a"));
        System.out.println(name.intern());
        System.out.println(name.lines());
        System.out.println(name.indent(4));
        System.out.println(name.toCharArray());
        System.out.println(name.indent(2));

        System.out.println(name.equalsIgnoreCase("PrabHA"));
        System.out.println(name.compareToIgnoreCase("Prabha"));
        System.out.println(name.substring(2));
        System.out.println(name.substring(2,5));
        name = "    "+name + "   ";
        System.out.println(name);
        System.out.println(name.trim());

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.toUpperCase(Locale.ENGLISH));
        System.out.println(name.contains("r"));
        System.out.println(name.concat("Hello"));
        System.out.println(name.trim().concat("Hello"));

        System.out.println(name.isEmpty());
        System.out.println(name.isBlank());



    }
}
