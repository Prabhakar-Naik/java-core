package com.springboot.designpatterns.behavioral.chainofresponsibility;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// ChainOfResponsibility.java
// Handler Interface
public interface SupportHandler {

    void setNextHandler(SupportHandler nextHandler);

    void handleRequest(Request request);
}
