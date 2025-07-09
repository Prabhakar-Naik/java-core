package com.springboot.designpatterns.behavioral.Interpreter;

import java.util.Map;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Non-terminal Expression (Addition)
public class AddExpression implements Expression {

    private Expression left;
    private Expression right;

    public AddExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Map<String, Integer> variables) {
        return left.interpret(variables) + right.interpret(variables);
    }
}
