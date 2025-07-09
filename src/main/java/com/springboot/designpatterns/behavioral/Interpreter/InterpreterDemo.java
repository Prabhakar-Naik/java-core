package com.springboot.designpatterns.behavioral.Interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author prabhakar, @Date 05-07-2025
 */

public class InterpreterDemo {

    public static void main(String[] args) {
        System.out.println("""
                Concept: Given a language, defines a representation for its grammar along with an interpreter that uses the representation to interpret sentences in the language.
                Example: A simple arithmetic expression interpreter (addition, subtraction).
                """);
         // Example: a + (b - 5)
         Expression expression = new AddExpression(
                                 new VariableExpression("a"),
                                 new SubtractExpression(
                                     new VariableExpression("b"),
                                     new NumberExpression(5)
                                 )
                              );

         Map<String, Integer> context = new HashMap<>();
         context.put("a", 10);
         context.put("b", 7);

         int result = expression.interpret(context);
         System.out.println("Result: " + result); // Expected: 10 + (7 - 5) = 12

         // Another example: 20 - (x + 3)
         Expression expression2 = new SubtractExpression(
                                  new NumberExpression(20),
                                  new AddExpression(
                                      new VariableExpression("x"),
                                      new NumberExpression(3)
                                  )
                               );

         Map<String, Integer> context2 = new HashMap<>();
         context2.put("x", 5);

         int result2 = expression2.interpret(context2);
         System.out.println("Result 2: " + result2); // Expected: 20 - (5 + 3) = 12

    }
}
