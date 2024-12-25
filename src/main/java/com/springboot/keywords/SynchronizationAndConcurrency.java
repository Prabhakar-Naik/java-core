package com.springboot.keywords;

/**
 * @author prabhakar, @Date 24-12-2024
 */
public class SynchronizationAndConcurrency {

    //synchronized: Ensures that only one thread can access a block of code or method at a time.
    int count;
    synchronized void increment() { count++; }

    //native: Indicates that a method is implemented in platform-specific native code (e.g., C/C++).

    public native int hashCode();


}
