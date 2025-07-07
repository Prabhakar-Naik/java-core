package com.springboot.designpatterns.creational.factorymethod;

/**
 * @author prabhakar, @Date 05-07-2025
 */

public class PdfDocumentFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}


// Usage
// public class FactoryMethodDemo {
//     public static void main(String[] args) {
//         DocumentFactory wordFactory = new WordDocumentFactory();
//         Document wordDoc = wordFactory.createDocument();
//         wordDoc.open();
//
//         DocumentFactory pdfFactory = new PdfDocumentFactory();
//         Document pdfDoc = pdfFactory.createDocument();
//         pdfDoc.open();
//     }
// }