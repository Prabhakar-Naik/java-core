package com.springboot.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author prabhakar, @Date 05-07-2025
 */

public class Folder implements FileSystemComponent{

    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    public void removeComponent(FileSystemComponent component) {
        components.remove(component);
    }

    @Override
    public void printName() {
        System.out.println("Folder: " + name);
        for (FileSystemComponent component : components) {
            component.printName();
        }
    }

}

// Usage
// import java.util.ArrayList;
// import java.util.List;
//
// public class CompositeDemo {
//     public static void main(String[] args) {
//         File file1 = new File("document.txt");
//         File file2 = new File("image.jpg");
//         File file3 = new File("presentation.pptx");
//
//         Folder subFolder = new Folder("My Documents");
//         subFolder.addComponent(file1);
//         subFolder.addComponent(file2);
//
//         Folder rootFolder = new Folder("Root");
//         rootFolder.addComponent(subFolder);
//         rootFolder.addComponent(file3);
//
//         rootFolder.printName();
//     }
// }
