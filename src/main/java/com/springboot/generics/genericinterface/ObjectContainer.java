package com.springboot.generics.genericinterface;

/**
 * @author prabhakar, @Date 31-12-2024
 */
public class ObjectContainer implements Container<Object>{

    private Object value;

    @Override
    public void add(Object value) {
        this.value = value;
    }

    @Override
    public Object get() {
        return value;
    }
}
