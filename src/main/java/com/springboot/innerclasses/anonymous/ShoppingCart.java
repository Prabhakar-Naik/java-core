package com.springboot.innerclasses.anonymous;

/**
 * @author prabhakar, @Date 25-12-2024
 */
public class ShoppingCart {
    private double totalAmount;

    public ShoppingCart(double totalAmount){
        this.totalAmount = totalAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void processPayment(Payment payment){
        payment.pay(totalAmount);
    }
}
