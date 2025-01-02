package com.springboot.generics.genericinterface;

/**
 * @author prabhakar, @Date 31-12-2024
 */
public interface Container<T> {

    void add(T value);

    T get();

}
