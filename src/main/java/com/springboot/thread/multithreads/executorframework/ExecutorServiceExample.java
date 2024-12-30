package com.springboot.thread.multithreads.executorframework;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author prabhakar, @Date 30-12-2024
 */
public class ExecutorServiceExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        long startTime = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 1; i < 10; i++) {
            int finalI = i;
            executorService.submit(() -> {
                long result = factorial(finalI);
                System.out.println(result);
            });
        }
        executorService.shutdown();

        try {
            while (!executorService.awaitTermination(1, TimeUnit.MILLISECONDS)) {
                System.out.println("WAITING>.........!");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Total time: " + (System.currentTimeMillis() - startTime));

    }

    private static long factorial(int value) {
        int result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
        }
        return result;
    }
}
