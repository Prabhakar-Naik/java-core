package com.springboot.designpatterns.structural.adapter;

/**
 * @author prabhakar, @Date 05-07-2025
 */

public class AdapterDemo {

    public static void main(String[] args) {

        System.out.println("""
                Concept: Allows objects with incompatible interfaces to collaborate.
                Example: Connecting an old LegacyPrinter (which prints String) to a modern Printable interface (which prints int[]).
                """);
        LegacyPrinter oldPrinter = new LegacyPrinter();
         Printer adapter = new LegacyPrinterAdapter(oldPrinter);

         adapter.printDocument("Hello, World from Adapter!");
    }
}
