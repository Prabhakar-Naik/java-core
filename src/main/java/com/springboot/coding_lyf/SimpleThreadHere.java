package com.springboot.coding_lyf;

/**
 * @author prabhakar, @Date 11-11-2025
 */
class MyThread extends Thread {
    public void run() {
        System.out.println("MyThread is running");
    }
}

class YourThread extends Thread {

}

public class SimpleThreadHere {

    public static void main(String[] args) {
//        MyThread thread = new MyThread();
//        thread.start();
//        thread.start();

        System.out.println("Started Main Block");
        YourThread thread = new YourThread();
        thread.start();
        System.out.println("Ended Main Block");
    }
}
