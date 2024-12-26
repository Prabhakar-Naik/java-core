package com.springboot.exceptions.scenario2;

/**
 * @author prabhakar, @Date 26-12-2024
 */
public class Test {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(50);

        try {
            account.withdraw(60);
        }catch (InsufficientFundsException e){
            System.out.println(e);
        }

    }
}
