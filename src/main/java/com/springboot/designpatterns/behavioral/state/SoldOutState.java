package com.springboot.designpatterns.behavioral.state;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Concrete State 4
public class SoldOutState implements VendingMachineState{

    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Machine is sold out. Returning coin.");
    }

    @Override
    public void selectProduct(VendingMachine machine) {
        System.out.println("Machine is sold out.");
    }

    @Override
    public void dispenseProduct(VendingMachine machine) {
        System.out.println("No products to dispense.");
    }

    @Override
    public void refundCoin(VendingMachine machine) {
        System.out.println("No coin to refund (machine is sold out).");
    }
}

// Usage
// public class StateDemo {
//     public static void main(String[] args) {
//         VendingMachine vm = new VendingMachine(2);
//
//         vm.selectProduct(); // No coin
//         vm.insertCoin();
//         vm.selectProduct(); // Dispenses and goes to NoCoinState
//
//         System.out.println("\n--- Second Product ---");
//         vm.insertCoin();
//         vm.selectProduct(); // Dispenses and goes to SoldOutState
//
//         System.out.println("\n--- Machine is Sold Out ---");
//         vm.insertCoin(); // Coin returned
//         vm.selectProduct();
//         vm.refundCoin();
//     }
// }