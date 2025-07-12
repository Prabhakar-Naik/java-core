package com.springboot.designpatterns.behavioral.visitor;

/**
 * @author prabhakar, @Date 05-07-2025
 */

public interface ShoppingCartVisitor {
    void visit(Book book);
    void visit(Fruit fruit);
}
