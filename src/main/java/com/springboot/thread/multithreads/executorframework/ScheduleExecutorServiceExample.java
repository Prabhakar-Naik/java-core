package com.springboot.thread.multithreads.executorframework;

import java.util.concurrent.*;

/**
 * @author prabhakar, @Date 30-12-2024
 */
public class ScheduleExecutorServiceExample {

    public static void main(String[] args) {

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(3);
        scheduler.schedule(() -> System.out.println("Task executed after 2 seconds delay"),
                2,
                TimeUnit.SECONDS);

        final var schedule = scheduler.schedule(() -> "Hello Callable", 2, TimeUnit.SECONDS);
        try {
            System.out.println(schedule.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        scheduler.scheduleAtFixedRate(() -> System.out.println("Task executed scheduleAtFixedRate after every 3 seconds delay"),
                3,
                5,
                TimeUnit.SECONDS);


        ScheduledFuture<?> scheduledFuture = scheduler.scheduleWithFixedDelay(() -> System.out.println("Task executed scheduleWithFixedDelay after every 3 seconds delay"),
                3,
                3,
                TimeUnit.SECONDS);


        scheduler.schedule(
                () -> {
                    System.out.println("Initiating shutdown...");
                    scheduler.shutdown();
                }, 25, TimeUnit.SECONDS);

        try {
            System.out.println(scheduledFuture.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        //scheduler.shutdown();
        // you don't need to mention the shutdown() is automatically perform

    }
}
