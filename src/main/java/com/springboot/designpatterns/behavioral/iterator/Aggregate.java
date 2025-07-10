package com.springboot.designpatterns.behavioral.iterator;


/**
 * @author prabhakar, @Date 05-07-2025
 */
// Aggregate Interface
public interface Aggregate<P> {
    Iterator<P> createIterator();
}
