package com.springboot.designpatterns.creational.factorymethod;

/**
 * @author prabhakar, @Date 05-07-2025
 */

public class FactoryMethodDemo {
    public static void main(String[] args) {
        System.out.println("""
                Concept: Defines an interface for creating an object, but lets subclasses decide which class to instantiate.
                Example: Creating different types of documents (e.g., Word, PDF).
                """);
        DocumentFactory wordFactory = new WordDocumentFactory();
         Document wordDoc = wordFactory.createDocument();
         wordDoc.open();

         DocumentFactory pdfFactory = new PdfDocumentFactory();
         Document pdfDoc = pdfFactory.createDocument();
         pdfDoc.open();
    }
}
