package com.springboot.thread.multithreads.executorframework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author prabhakar, @Date 30-12-2024
 */
public class SampleMain {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Integer> future = executorService.submit(() -> {
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){
                System.out.println("Exception Occurred: "+e);
            }
            System.out.println("Hello ");
            return 42;
        });

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Exception Occurred: "+e);
            throw new RuntimeException(e);
        }
        future.cancel(false);
        System.out.println(future.isCancelled());
        System.out.println(future.isDone());
        executorService.shutdown();
        System.out.println(executorService.isShutdown());
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(executorService.isTerminated());
    }
}
