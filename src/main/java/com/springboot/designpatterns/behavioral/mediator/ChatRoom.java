package com.springboot.designpatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Concrete Mediator
public class ChatRoom implements ChatRoomMediator {

    private List<User> users;

    public ChatRoom() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User user) {
        System.out.println("[" + user.getName() + "]: " + message);
        // Send message to all other users
        for (User u : users) {
            if (u != user) {
                u.receiveMessage(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
        System.out.println(user.getName() + " has joined the chat.");
    }
}
