package com.springboot.innerclasses.anonymous;

/**
 * @author prabhakar, @Date 25-12-2024
 */
public class CreditCard implements Payment{

    private String creditCardNumber;
    public CreditCard(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }


    @Override
    public void pay(double amount) {
        System.out.println("Paid: "+amount+" using Credit Card.");
    }
}
