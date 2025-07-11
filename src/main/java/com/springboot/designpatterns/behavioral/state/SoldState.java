package com.springboot.designpatterns.behavioral.state;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Concrete State 3
public class SoldState implements VendingMachineState{

    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Please wait, product is dispensing.");
    }

    @Override
    public void selectProduct(VendingMachine machine) {
        System.out.println("Already dispensing a product.");
    }

    @Override
    public void dispenseProduct(VendingMachine machine) {
        if (machine.getInventory() > 0) {
            System.out.println("Product dispensed successfully!");
            machine.decrementInventory();
            if (machine.getInventory() == 0) {
                machine.setState(new SoldOutState());
            } else {
                machine.setState(new NoCoinState());
            }
        } else {
            System.out.println("No products left.");
            machine.setState(new SoldOutState());
        }
    }

    @Override
    public void refundCoin(VendingMachine machine) {
        System.out.println("Cannot refund, product already dispensed.");
    }

}
