package com.springboot.designpatterns.structural.adapter;

/**
 * @author prabhakar, @Date 05-07-2025
 */

public class LegacyPrinterAdapter implements Printer {

    private LegacyPrinter legacyPrinter;

    public LegacyPrinterAdapter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }

    @Override
    public void printDocument(String text) {
        // Adapt the call from printDocument to printText
        legacyPrinter.printText(text);
    }

}

// Usage
// public class AdapterDemo {
//     public static void main(String[] args) {
//         LegacyPrinter oldPrinter = new LegacyPrinter();
//         Printer adapter = new LegacyPrinterAdapter(oldPrinter);
//
//         adapter.printDocument("Hello, World from Adapter!");
//     }
// }
