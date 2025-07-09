package com.springboot.designpatterns.behavioral.chainofresponsibility;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Concrete Handler 2
public class L2SupportHandler implements SupportHandler {

    private SupportHandler nextHandler;

    @Override
    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getLevel() == 2) {
            System.out.println("L2 Support handled request: " + request.getMessage());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("Request cannot be handled: " + request.getMessage());
        }
    }
}
