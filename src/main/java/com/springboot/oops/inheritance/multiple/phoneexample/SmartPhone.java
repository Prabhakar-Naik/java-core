package com.springboot.oops.inheritance.multiple.phoneexample;

import java.util.List;

/**
 * @author prabhakar, @Date 24-12-2024
 */
public class SmartPhone implements Camera, MusicPlayer, Phone{

    public String scrollUp(){
        return "scrollUp";
    }

    public String scrollDown(){
        return "scrollDown";
    }

    @Override
    public String takePhoto() {
        return "Photo click by smart phone";
    }

    @Override
    public String recordVideo() {
        return "video recorded by smart phone";
    }

    @Override
    public String playMusic() {
        return "music playing in smart phone";
    }

    @Override
    public String stopMusic() {
        return "music stop in smart phone";
    }

    @Override
    public String makeCall(String number) {
        return "call placed to this number: "+number;
    }

    @Override
    public void endCall() {
        System.out.println("call ended");
    }

    public List<String> phoneBook(){
        return List.of("123455","1234678","987654","374658");
    }


}
