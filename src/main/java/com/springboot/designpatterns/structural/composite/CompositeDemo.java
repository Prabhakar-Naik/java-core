package com.springboot.designpatterns.structural.composite;

/**
 * @author prabhakar, @Date 05-07-2025
 */

public class CompositeDemo {
    public static void main(String[] args) {
        System.out.println("""
                Concept: Composes objects into tree structures to represent part-whole hierarchies.
                Clients can treat individual objects and compositions of objects uniformly.
                Example: File system with files and folders.
                """);
        File file1 = new File("document.txt");
        File file2 = new File("image.jpg");
        File file3 = new File("presentation.pptx");

        Folder subFolder = new Folder("My Documents");
        subFolder.addComponent(file1);
        subFolder.addComponent(file2);

        Folder rootFolder = new Folder("Root");
        rootFolder.addComponent(subFolder);
        rootFolder.addComponent(file3);

        rootFolder.printName();

    }
}
