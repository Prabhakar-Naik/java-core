package com.springboot.innerclasses.anonymous;

/**
 * @author prabhakar, @Date 25-12-2024
 */
public class DebitCard implements Payment{
    private String debitCardNumber;
    public DebitCard(String debitCardNumber) {
        this.debitCardNumber = debitCardNumber;
    }


    @Override
    public void pay(double amount) {
        System.out.println("Paid: "+amount+" using Credit Card.");
    }
}
