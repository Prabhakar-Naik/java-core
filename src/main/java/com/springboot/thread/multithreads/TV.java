package com.springboot.thread.multithreads;

/**
 * @author prabhakar, @Date 27-12-2024
 */
public class TV implements Runnable{

    // create a class,
    // implements with Runnable
    // The run method is overridden to define the code that constitutes the new thread
    // A Thread object is created by passing an instance of world.
    // start method is called to initiate the new thread.

    @Override
    public void run() {
        System.out.println("Video Playing on TV.");
    }
}
