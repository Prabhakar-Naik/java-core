package com.springboot.java21;

import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 * @author prabhakar, @Date 28-06-2025
 */

public class VirtualThreads {

    public static void main(String[] args) throws InterruptedException {
        Thread vt = Thread.startVirtualThread(() -> System.out.println("Hello from VT!"));
        vt.join();
        boolean virtual = vt.isVirtual();
        System.out.println(virtual);
        Thread.sleep(500);
        long l = vt.threadId();
        System.out.println(l);
        //vt.start();

        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            IntStream.rangeClosed(1, 10_000).forEach(i -> {
                executor.submit(() -> {
                    System.out.println(i);
                    try {
                        Thread.sleep(Duration.ofSeconds(1));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
            });
        }
    }



}
