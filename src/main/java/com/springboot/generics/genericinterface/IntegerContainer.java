package com.springboot.generics.genericinterface;

/**
 * @author prabhakar, @Date 31-12-2024
 */
public class IntegerContainer implements Container<Integer>{

    private Integer value;

    @Override
    public void add(Integer value) {
        this.value = value;
    }

    @Override
    public Integer get() {
        return value;
    }
}
