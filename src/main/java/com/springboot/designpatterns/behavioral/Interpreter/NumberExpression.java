package com.springboot.designpatterns.behavioral.Interpreter;

import java.util.Map;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Terminal Expression (Number)
public class NumberExpression implements Expression {
    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpret(Map<String, Integer> variables) {
        return number;
    }
}
