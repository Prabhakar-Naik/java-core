package com.springboot.designpatterns.behavioral.command;

/**
 * @author prabhakar, @Date 05-07-2025
 */

public class CommandDemo {

    public static void main(String[] args) {

        System.out.println("""
                Concept: Encapsulates a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.
                Example: Remote control for a light (turning on/off the light).
                """);
        Light livingRoomLight = new Light();
        Light kitchenLight = new Light();

        Command turnOnLivingRoom = new TurnOnLightCommand(livingRoomLight);
        Command turnOffLivingRoom = new TurnOffLightCommand(livingRoomLight);
        Command turnOnKitchen = new TurnOnLightCommand(kitchenLight);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(turnOnLivingRoom);
        remote.pressButton();

        remote.setCommand(turnOnKitchen);
        remote.pressButton();

        remote.setCommand(turnOffLivingRoom);
        remote.pressButton();

        System.out.println("\nPressing undo:");
        remote.pressUndo(); // Undoes turnOffLivingRoom (turns it ON)
        remote.pressUndo(); // Undoes turnOnKitchen (turns it OFF)
        remote.pressUndo(); // Undoes turnOnLivingRoom (turns it OFF)
        remote.pressUndo(); // No more commands to undo
    }
}
