package com.springboot.accessmodifiers.publicmodifier;

/**
 * @author prabhakar, @Date 23-12-2024
 */
// you can access this class anywhere in the project
public class Student {

    // but not control in public attributes or fields or variables
    public String name;
    public int age;

    public void sayHello() {
        System.out.println("Hello....!");
    }



}
