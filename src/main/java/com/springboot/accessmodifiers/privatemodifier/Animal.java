package com.springboot.accessmodifiers.privatemodifier;

/**
 * @author prabhakar, @Date 23-12-2024
 */

// we can not create a private class using private keyword at class level
public class Animal {

    // perfect control on private attributes or fields or variables
    private String name;
    private int age;


    // but we can use the single object for this class
    // you can understand more detail in singleton package
    private Animal() {
    }

    // here you can know more about singleton class
    // got through singleton package

    private String sayHello(){
        return "Hello private";
    }

    private static String sayWelcome(){
        return "Welcome private.";
    }

    public void sayBye(){
        System.out.println("Bye....!");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.age = 12;
        animal.name = "prabha";
        String hello = animal.sayHello();
        System.out.println(sayWelcome());
        System.out.println(hello);
        animal.sayBye();
    }

}
