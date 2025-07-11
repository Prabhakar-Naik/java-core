package com.springboot.designpatterns.behavioral.state;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Context (Vending Machine)
public class VendingMachine {
    private VendingMachineState currentState;
    private int inventory = 0;

    public VendingMachine(int initialInventory) {
        this.inventory = initialInventory;
        if (inventory > 0) {
            currentState = new NoCoinState();
        } else {
            currentState = new SoldOutState();
        }
    }

    public void setState(VendingMachineState state) {
        this.currentState = state;
    }

    public VendingMachineState getCurrentState() {
        return currentState;
    }

    public int getInventory() {
        return inventory;
    }

    public void decrementInventory() {
        inventory--;
    }

    public void insertCoin() {
        currentState.insertCoin(this);
    }

    public void selectProduct() {
        currentState.selectProduct(this);
    }

    public void dispenseProduct() {
        currentState.dispenseProduct(this);
    }

    public void refundCoin() {
        currentState.refundCoin(this);
    }
}
