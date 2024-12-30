package com.springboot.thread.multithreads.executorframework;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * @author prabhakar, @Date 30-12-2024
 */
public class CompletableFutureExample {

    /*
    By default, CompletableFuture tasks often run on daemon threads due to the use of ForkJoinPool.commonPool
    you can control the thread type by providing a custom executor service.
    The completableFuture task itself doesn't dictate whether it's a daemon or use thread.
    */
    public static void main(String[] args) {

        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(4000);
                System.out.println("Worked on completableFuture");
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            return "OK";
        });

        CompletableFuture<String> completableFuture1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(4000);
                System.out.println("Worked on completableFuture1");
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            return "OK";
        });

        CompletableFuture<String> completableFuture2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(4000);
                System.out.println("Worked on completableFuture2");
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            return "OK";
        });

        // get method()

        try {
            String string = CompletableFuture.supplyAsync(() -> {
                try {
                    Thread.sleep(3000);
                    System.out.println("Worked on completableFuture3 normal string");
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
                return "OK";
            }).get();
            System.out.println(string);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        try {

            CompletableFuture<String> completableFuture4 = CompletableFuture.supplyAsync(() -> {
                try {
                    Thread.sleep(4000);
                    System.out.println("Worked on completableFuture4 thenApply");
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
                return "OK";
            }).thenApply(x -> x + x);
            //.orTimeout(1, TimeUnit.SECONDS).exceptionally(x -> "Timeout Occurred.");
            System.out.println(completableFuture4.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        final var voidCompletableFuture = CompletableFuture.allOf(completableFuture, completableFuture1, completableFuture2);
        voidCompletableFuture.join();

        /*
        try {
            System.out.println(completableFuture.getNow("Working On Task"));
            System.out.println(completableFuture.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        */
        System.out.println("Main");

    }
}
