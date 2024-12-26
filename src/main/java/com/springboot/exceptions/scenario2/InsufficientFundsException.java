package com.springboot.exceptions.scenario2;

/**
 * @author prabhakar, @Date 26-12-2024
 */
public class InsufficientFundsException extends Exception{

    public InsufficientFundsException(){
        super("You Don't have enough money.");
    }

    @Override
    public String toString() {
        return "You Don't have enough money.";
    }

}
