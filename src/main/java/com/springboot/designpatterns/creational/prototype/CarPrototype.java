package com.springboot.designpatterns.creational.prototype;

/**
 * @author prabhakar, @Date 05-07-2025
 */
public interface CarPrototype extends Cloneable {

    CarPrototype clone();
    void assemble();
}
