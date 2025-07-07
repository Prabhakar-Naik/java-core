package com.springboot.designpatterns.creational.factorymethod;

/**
 * @author prabhakar, @Date 05-07-2025
 */

public class WordDocumentFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
