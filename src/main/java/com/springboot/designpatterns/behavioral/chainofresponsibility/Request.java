package com.springboot.designpatterns.behavioral.chainofresponsibility;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Request class
public class Request {

    private int level;
    private String message;

    public Request(int level, String message) {
        this.level = level;
        this.message = message;
    }

    public int getLevel() {
        return level;
    }

    public String getMessage() {
        return message;
    }

}
