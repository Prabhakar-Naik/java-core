package com.springboot.generics.genericinterface;

/**
 * @author prabhakar, @Date 31-12-2024
 */
public class GenericContainer<T> implements Container<T>{

    private T item;
    @Override
    public void add(T value) {
        this.item = value;
    }

    @Override
    public T get() {
        return item;
    }
}
