package com.springboot.designpatterns.behavioral.Interpreter;

import java.util.Map;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Abstract Expression
public interface Expression {
    int interpret(Map<String, Integer> variables);
}
