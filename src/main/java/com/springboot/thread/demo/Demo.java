package com.springboot.thread.demo;

/**
 * @author prabhakar, @Date 11-10-2024
 */
public class Demo {

    public static void main(String[] args) {

        for(int i=1;i<=10;i++) {
            System.out.println("Hello \n");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
