package com.springboot.designpatterns.behavioral.mediator;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Mediator Interface
public interface ChatRoomMediator {

    void sendMessage(String message, User user);
    void addUser(User user);
}
