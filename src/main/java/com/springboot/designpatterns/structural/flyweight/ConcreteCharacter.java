package com.springboot.designpatterns.structural.flyweight;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Concrete Flyweight
public class ConcreteCharacter implements Character {

    private char charValue; // Intrinsic state (shared)

    public ConcreteCharacter(char charValue) {
        this.charValue = charValue;
        System.out.println("Creating ConcreteCharacter for: " + charValue);
    }

    @Override
    public void print(int x, int y) {
        System.out.println("Printing character '" + charValue + "' at (" + x + ", " + y + ")");
    }

}
