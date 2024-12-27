package com.springboot.innerclasses.statics;

/**
 * @author prabhakar, @Date 25-12-2024
 */
public class ComputerTest {

    public static void main(String[] args) {

        Computer computer = new Computer("HP","ABC","XYS");
        computer.getOs().display();

        Computer.USB usb = new Computer.USB("TYPE-C");

    }
}
