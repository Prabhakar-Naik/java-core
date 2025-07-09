package com.springboot.designpatterns.structural.flyweight;

/**
 * @author prabhakar, @Date 05-07-2025
 */

public class FlyweightDemo {

    public static void main(String[] args) {
        System.out.println("""
                Concept: Used to minimize memory usage or computation expenses by sharing as much data as possible with similar objects.
                Example: Character objects in a text editor (sharing common character properties).
                """);
        String document = "Hello World";
         int x = 0;
         int y = 0;

         for (char c : document.toCharArray()) {
             Character character = CharacterFactory.getCharacter(c);
             character.print(x++, y); // x, y are extrinsic state
         }
    }
}
