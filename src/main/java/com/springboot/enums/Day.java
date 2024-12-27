package com.springboot.enums;

/**
 * @author prabhakar, @Date 26-12-2024
 */
public enum Day {
    SUNDAY("SUNDAY","ADIVARAM"), MONDAY("MONDAY", "SOMAVARAM"),
    TUESDAY("TUESDAY","MANGALAVARAM"), WEDNESDAY("WEDNESDAY","BHUDHAVARAM"),
    THURSDAY("THURSDAY","GURUVARAM"), FRIDAY("FRIDAY","SHUKRAVARAM"),
    SATURDAY("SATURDAY","SHANIVARAM");


    Day(String english, String telugu){
        this.english = english;
        this.telugu = telugu;
    }

    private String english;

    private String telugu;

    public String getEnglish(){
        return english;
    }

    public String getTelugu(){
        return telugu;
    }

    public String englishName(){
        return "Today is: "+this.getEnglish();
    }

    public String teluguName(){
        return "EE Roju: "+this.getTelugu();
    }
}
