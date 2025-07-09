package com.springboot.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Flyweight Factory
public class CharacterFactory {

    private static final Map<java.lang.Character, ConcreteCharacter> characters = new HashMap<>();

    public static Character getCharacter(char charValue) {
        if (!characters.containsKey(charValue)) {
            characters.put(charValue, new ConcreteCharacter(charValue));
        }
        return characters.get(charValue);
    }

}

// Usage
// public class FlyweightDemo {
//     public static void main(String[] args) {
//         String document = "Hello World";
//         int x = 0;
//         int y = 0;
//
//         for (char c : document.toCharArray()) {
//             Character character = CharacterFactory.getCharacter(c);
//             character.print(x++, y); // x, y are extrinsic state
//         }
//     }
// }
