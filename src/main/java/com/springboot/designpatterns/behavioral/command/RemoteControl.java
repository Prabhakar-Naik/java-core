package com.springboot.designpatterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Invoker
public class RemoteControl {

    private Command command;
    private List<Command> history = new ArrayList<>();

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
        history.add(command); // For undo functionality
    }

    public void pressUndo() {
        if (!history.isEmpty()) {
            Command lastCommand = history.remove(history.size() - 1);
            lastCommand.undo();
        } else {
            System.out.println("No commands to undo.");
        }
    }

}

// Usage
// import java.util.ArrayList;
// import java.util.List;
//
// public class CommandDemo {
//     public static void main(String[] args) {
//         Light livingRoomLight = new Light();
//         Light kitchenLight = new Light();
//
//         Command turnOnLivingRoom = new TurnOnLightCommand(livingRoomLight);
//         Command turnOffLivingRoom = new TurnOffLightCommand(livingRoomLight);
//         Command turnOnKitchen = new TurnOnLightCommand(kitchenLight);
//
//         RemoteControl remote = new RemoteControl();
//
//         remote.setCommand(turnOnLivingRoom);
//         remote.pressButton();
//
//         remote.setCommand(turnOnKitchen);
//         remote.pressButton();
//
//         remote.setCommand(turnOffLivingRoom);
//         remote.pressButton();
//
//         System.out.println("\nPressing undo:");
//         remote.pressUndo(); // Undoes turnOffLivingRoom (turns it ON)
//         remote.pressUndo(); // Undoes turnOnKitchen (turns it OFF)
//         remote.pressUndo(); // Undoes turnOnLivingRoom (turns it OFF)
//         remote.pressUndo(); // No more commands to undo
//     }
// }
