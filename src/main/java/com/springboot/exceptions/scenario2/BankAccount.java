package com.springboot.exceptions.scenario2;

/**
 * @author prabhakar, @Date 26-12-2024
 */
public class BankAccount {

    private double balance;

    public BankAccount(double amount) {
        this.balance = amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance){
            throw new InsufficientFundsException();
        }
        balance -= amount;
    }
}
