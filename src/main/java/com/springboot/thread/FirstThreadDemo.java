package com.springboot.thread;

/**
 * @author prabhakar, @Date 11-10-2024
 */
public class FirstThreadDemo extends Thread{

    public void run() {
        System.out.println("Natural Numbers: ");
        for(int i=1;i<=10;i++)
            System.out.print(i+"  ");
    }

    public static void main(String[] args) {

        FirstThreadDemo f=new FirstThreadDemo();
        f.start();
    }
}
