package com.springboot.lld.realworldusages.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author prabhakar, @Date 09-07-2025
 */

public class ThreadPool {

    /**
     * Creates pool of threads. Where the pool is the size of the number of processors
     * available to the Java virtual machine.
     */
    public static ExecutorService createFixedThreadPool() {
        return Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
    }

    /*
     * Tests for {@link ThreadPool#createFixedThreadPool()}.
     */

    /*
    @Test
    public void testCreateFixedThreadPool() {
        var numProcessors = Runtime.getRuntime().availableProcessors();
        var executorService = (ThreadPoolExecutor) ThreadPool.createFixedThreadPool();
        assertEquals(numProcessors, executorService.getCorePoolSize());
        assertNotEquals(0, executorService.getCorePoolSize());
    }
    */
}
