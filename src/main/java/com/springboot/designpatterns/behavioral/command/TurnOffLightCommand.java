package com.springboot.designpatterns.behavioral.command;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Concrete Command 2
public class TurnOffLightCommand implements Command {
    private Light light;

    public TurnOffLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }

    @Override
    public void undo() {
        light.turnOn();
    }
}
