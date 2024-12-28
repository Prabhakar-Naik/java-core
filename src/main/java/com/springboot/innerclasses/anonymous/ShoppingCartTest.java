package com.springboot.innerclasses.anonymous;

/**
 * @author prabhakar, @Date 25-12-2024
 */
public class ShoppingCartTest {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart(150);
        CreditCard creditCard = new CreditCard("28485");
        DebitCard debitCard = new DebitCard("23456");
        cart.processPayment(creditCard);
        cart.processPayment(debitCard);

        // anonymous inner class
        cart.processPayment(new Payment() {
            @Override
            public void pay(double amount) {
                System.out.println("Paid: "+amount+" using NetBanking.");
            }
        });

        cart.processPayment(new Payment() {
            @Override
            public void pay(double amount) {
                System.out.println("Paid: "+amount+" using Paypal.");
            }
        });



    }
}
