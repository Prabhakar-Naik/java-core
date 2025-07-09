package com.springboot.designpatterns.behavioral.command;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Concrete Command 1
public class TurnOnLightCommand implements Command {
    private Light light;

    public TurnOnLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void undo() {
        light.turnOff();
    }
}
