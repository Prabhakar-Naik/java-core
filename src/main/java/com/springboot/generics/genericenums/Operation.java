package com.springboot.generics.genericenums;

/**
 * @author prabhakar, @Date 31-12-2024
 */
public enum Operation {

    ADDITION, SUBTRACTION, MULTIPLICATION, DIVISION, REMAINDER;

    public <T extends Number> double apply(T a, T b){
        /*
        switch (this){
            case ADDITION:
                return a.doubleValue() + b.doubleValue();
            case SUBTRACTION:
                return a.doubleValue() - b.doubleValue();
            case MULTIPLICATION:
                return a.doubleValue() * b.doubleValue();
            case DIVISION:
                return a.doubleValue() / b.doubleValue();
            case REMAINDER:
                return a.doubleValue() % b.doubleValue();
            default:
                throw new AssertionError("Unknown Operation Occur: "+this);
        }
        */
        // or
        return switch (this) {
            case ADDITION -> a.doubleValue() + b.doubleValue();
            case SUBTRACTION -> a.doubleValue() - b.doubleValue();
            case MULTIPLICATION -> a.doubleValue() * b.doubleValue();
            case DIVISION -> a.doubleValue() / b.doubleValue();
            case REMAINDER -> a.doubleValue() % b.doubleValue();
            default -> throw new AssertionError("Unknown Operation Occur: " + this);
        };
    }
}
