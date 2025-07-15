package com.springboot.lld.realworldusages.string;

import java.util.Map;

/**
 * @author prabhakar, @Date 11-07-2025
 */

public class LindenmayerSystem {

    /**
     * Generates an L-system string based on axiom, production rules, and a number of iterations.
     *
     * @param axiom           initial string to begin the L-system
     * @param productionRules map of character rules where each symbol can be replaced with a string
     * @param iterations      number of iterations to apply the production rules
     * @return the generated string after all iterations
     */

    public static String generateLindenmayerSystem(String axiom, Map<Character, String> productionRules,
                                                   int iterations) {
        String current = axiom;

        for (int i = 0; i < iterations; i++) {
            StringBuffer nextIteration = new StringBuffer(current.length() * 2);

            // Replace each symbol with the corresponding production rule or the symbol itself
            current.chars()
                    .mapToObj(c -> (char) c)
                    .forEach(symbol -> nextIteration.append(
                            productionRules.getOrDefault(symbol, String.valueOf(symbol))));

            current = nextIteration.toString();
        }
        return current;
    }

    /**
     * Tests for {@link LindenmayerSystem#generateLindenmayerSystem(String, Map, int)}.
     */

//    @Test
//    public void testGenerateLindenmayerSystems() {
//        String axiom = "A";
//
//
//        Map<Character, String> productionRules = new HashMap<>();
//        productionRules.put('A', "AB");
//        productionRules.put('B', "A");
//
//        assertEquals(
//                "AB",
//                LindenmayerSystem.generateLindenmayerSystem(axiom, productionRules, 1)
//        );
//        assertEquals(
//                "ABA",
//                LindenmayerSystem.generateLindenmayerSystem(axiom, productionRules, 2)
//        );
//        assertEquals(
//                "ABAAB",
//                LindenmayerSystem.generateLindenmayerSystem(axiom, productionRules, 3)
//        );
//        assertEquals(
//                axiom,
//                LindenmayerSystem.generateLindenmayerSystem(axiom, productionRules, 0)
//        );
//    }

}
