package com.springboot.oops.inheritance.multiple.phoneexample;

/**
 * @author prabhakar, @Date 24-12-2024
 */
public class Test {

    public static void main(String[] args) {

        SmartPhone phone = new SmartPhone();
        System.out.println(phone.phoneBook());
        System.out.println(phone.makeCall("7095262400"));
        phone.endCall();
        System.out.println(phone.playMusic());
        System.out.println(phone.stopMusic());
        System.out.println(phone.takePhoto());
        System.out.println(phone.recordVideo());

    }
}
