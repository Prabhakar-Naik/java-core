package com.springboot.generics.genericinterface;

import java.util.Arrays;

/**
 * @author prabhakar, @Date 31-12-2024
 */
public class MainInterface {

    public static void main(String[] args) {

        // String relate generics
        Container<String> stringContainer = new StringContainer();
        stringContainer.add("Hello This is stringContainer");
        System.out.println(stringContainer.get());

        StringContainer container = new StringContainer();
        container.add("Hi Suheena.!");
        System.out.println(container.get());

        // Integer relate generics
        Container<Integer> integerContainer = new IntegerContainer();
        integerContainer.add(299);
        System.out.println(integerContainer.get());

        IntegerContainer container1 = new IntegerContainer();
        container1.add(1000);
        System.out.println(container1.get());

        // Object relate generics
        Container<Object> objectContainer = new ObjectContainer();
        objectContainer.add("It's an Object");
        System.out.println(objectContainer.get());

        objectContainer.add(23.5);
        System.out.println(objectContainer.get());

        objectContainer.add(Arrays.asList(1,2,3));
        System.out.println(objectContainer.get());

        // same as second type of generic parameter
        ObjectContainer objectContainer1 = new ObjectContainer();

        // Bottle relate generics Custom user defined
        Bottle bottle = new Bottle(2,"Clean BB","Slice Black",1);
        Container<Bottle> bottleContainer = new BottleContainer();
        bottleContainer.add(bottle);
        System.out.println(bottleContainer.get().getName());

        bottleContainer.add(new Bottle(4,"Steel BB","White one",2));
        System.out.println(bottleContainer.get().getColor());

        // same as second type of generic parameter
        BottleContainer bottleContainer1 = new BottleContainer();

        // more advanced concept
        // re-usable generic type classes
        Container<String> stringGenericContainer = new GenericContainer<>();
        stringGenericContainer.add("dfghjkl");
        System.out.println(stringGenericContainer.get());

        Container<Integer>  integerGenericContainer= new GenericContainer<>();
        integerGenericContainer.add(12345);
        System.out.println(integerGenericContainer.get());

        Container<Double> doubleContainer = new GenericContainer<>();
        doubleContainer.add(1334.8);
        System.out.println(doubleContainer.get());


    }
}
