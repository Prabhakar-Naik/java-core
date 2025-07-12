package com.springboot.designpatterns.behavioral.visitor;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Visitor.java
// Element Interface
public interface ItemElement {
    void accept(ShoppingCartVisitor visitor);
}
