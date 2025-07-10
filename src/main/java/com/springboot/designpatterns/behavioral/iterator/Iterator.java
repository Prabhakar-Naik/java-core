package com.springboot.designpatterns.behavioral.iterator;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Iterator Interface
public interface Iterator<P> {
    boolean hasNext();
    P next();
}
