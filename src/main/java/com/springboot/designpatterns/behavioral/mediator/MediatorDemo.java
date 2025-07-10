package com.springboot.designpatterns.behavioral.mediator;

/**
 * @author prabhakar, @Date 05-07-2025
 */

public class MediatorDemo {

    public static void main(String[] args) {
        System.out.println("""
                Concept: Defines an object that encapsulates how a set of objects interact. It promotes loose coupling by keeping objects from referring to each other explicitly.
                Example: A chat room where users don't communicate directly but through a ChatRoom mediator.
                """);
        ChatRoom chatRoom = new ChatRoom();

        User user1 = new User("Alice", chatRoom);
        User user2 = new User("Bob", chatRoom);
        User user3 = new User("Charlie", chatRoom);

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        user1.send("Hi everyone!");
        user2.send("Hey Alice!");
        user3.send("What's up?");
    }
}
