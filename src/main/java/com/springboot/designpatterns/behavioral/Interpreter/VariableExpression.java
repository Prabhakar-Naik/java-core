package com.springboot.designpatterns.behavioral.Interpreter;

import java.util.Map;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Terminal Expression (Variable)
public class VariableExpression implements Expression {

    private String name;

    public VariableExpression(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Map<String, Integer> variables) {
        return variables.getOrDefault(name, 0);
    }
}
