package com.springboot.coding_lyf;

/**
 * @author prabhakar, @Date 11-11-2025
 */

class MaThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName()+" is running");
    }
}

public class ThreadHere {

    public static void main(String[] args) {
        MaThread thread = new MaThread();
        thread.run();
        thread.start();
    }
}
