package com.springboot.designpatterns.behavioral.state;

/**
 * @author prabhakar, @Date 05-07-2025
 */

public class StateDemo {

    public static void main(String[] args) {
        System.out.println("""
                Concept: Allows an object to alter its behavior when its internal state changes. The object will appear to change its class.
                Example: A VendingMachine whose behavior changes based on its internal state (e.g., NoCoinState, HasCoinState, SoldState).
                """);

        VendingMachine vm = new VendingMachine(2);

        vm.selectProduct(); // No coin
        vm.insertCoin();
        vm.selectProduct(); // Dispenses and goes to NoCoinState

        System.out.println("\n--- Second Product ---");
        vm.insertCoin();
        vm.selectProduct(); // Dispenses and goes to SoldOutState

        System.out.println("\n--- Machine is Sold Out ---");
        vm.insertCoin(); // Coin returned
        vm.selectProduct();
        vm.refundCoin();
    }
}
