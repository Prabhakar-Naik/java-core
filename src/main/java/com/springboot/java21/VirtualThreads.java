package com.springboot.java21;

/**
 * @author prabhakar, @Date 28-06-2025
 */

public class VirtualThreads {

    public static void main(String[] args) throws InterruptedException {
        Thread vt = Thread.startVirtualThread(() -> System.out.println("Hello from VT!"));
        vt.join();
    }

}
