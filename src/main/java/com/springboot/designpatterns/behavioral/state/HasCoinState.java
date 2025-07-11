package com.springboot.designpatterns.behavioral.state;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Concrete State 2
public class HasCoinState implements VendingMachineState{

    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Coin already inserted.");
    }

    @Override
    public void selectProduct(VendingMachine machine) {
        System.out.println("Product selected. Dispensing...");
        machine.setState(new SoldState());
        machine.dispenseProduct();
    }

    @Override
    public void dispenseProduct(VendingMachine machine) {
        System.out.println("Please select a product first.");
    }

    @Override
    public void refundCoin(VendingMachine machine) {
        System.out.println("Coin refunded.");
        machine.setState(new NoCoinState());
    }
}
