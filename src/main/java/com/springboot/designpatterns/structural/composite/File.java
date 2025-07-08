package com.springboot.designpatterns.structural.composite;

/**
 * @author prabhakar, @Date 05-07-2025
 */

public class File implements FileSystemComponent{

    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println("File: " + name);
    }
}
