package com.springboot.thread.multithreads.methods;

/**
 * @author prabhakar, @Date 27-12-2024
 */
public class StartAndDaemon extends Thread {

    public void run(){
        while (true){
            System.out.println("Hello world !");
        }
    }

    // DAEMON
    public static void main(String[] args) {
        StartAndDaemon thread = new StartAndDaemon();
        thread.setDaemon(true);
        thread.start();

        System.out.println("Main Done");

    }

}
