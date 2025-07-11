package com.springboot.designpatterns.behavioral.state;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Concrete State 1
public class NoCoinState implements VendingMachineState{

    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Coin inserted.");
        machine.setState(new HasCoinState());
    }

    @Override
    public void selectProduct(VendingMachine machine) {
        System.out.println("Please insert a coin first.");
    }

    @Override
    public void dispenseProduct(VendingMachine machine) {
        System.out.println("Please insert a coin and select a product.");
    }

    @Override
    public void refundCoin(VendingMachine machine) {
        System.out.println("No coin to refund.");
    }
}
