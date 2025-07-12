package com.springboot.lld.realworldusages.thread;

/**
 * @author prabhakar, @Date 09-07-2025
 */

public class ThreadDemo {

    /**
     * Creates and returns a new thread with the task assigned to it
     * (task will be performed parallel to the main thread).
     *
     * @param task the task to be executed by this thread
     * @return new thread with task assigned to it.
     */

    public static Thread createThread(Runnable task) {
        return new Thread(task);
    }

    /*
     * Tests for {@link ThreadDemo #createThread(Runnable)}.
     */

    /*
    @Test
    void createThread() throws InterruptedException {
        AtomicInteger counter = new AtomicInteger(0);

        Thread t = ThreadDemo.createThread(() -> {
            for (int i = 0; i < 1000000; i++) {
                counter.getAndIncrement();
            }
        });

        t.start();
        t.join();

        assertEquals(counter.get(), 1000000);
    }
    */
}
