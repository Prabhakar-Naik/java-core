package com.springboot.designpatterns.behavioral.mediator;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Colleague
public class User {

    private String name;
    private ChatRoomMediator mediator;

    public User(String name, ChatRoomMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }
    public void send(String message) {
        System.out.println(name + " sends: " + message);
        mediator.sendMessage(message, this);
    }

    public void receiveMessage(String message) {
        System.out.println(name + " receives: " + message);
    }
}

// Usage
// public class MediatorDemo {
//     public static void main(String[] args) {
//         ChatRoom chatRoom = new ChatRoom();
//
//         User user1 = new User("Alice", chatRoom);
//         User user2 = new User("Bob", chatRoom);
//         User user3 = new User("Charlie", chatRoom);
//
//         chatRoom.addUser(user1);
//         chatRoom.addUser(user2);
//         chatRoom.addUser(user3);
//
//         user1.send("Hi everyone!");
//         user2.send("Hey Alice!");
//         user3.send("What's up?");
//     }
// }
