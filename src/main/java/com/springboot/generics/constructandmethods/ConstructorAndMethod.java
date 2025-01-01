package com.springboot.generics.constructandmethods;

import java.util.Arrays;

/**
 * @author prabhakar, @Date 31-12-2024
 */
public class ConstructorAndMethod {

    // Generic Constructors
    public <T extends String> ConstructorAndMethod(T value) {
        System.out.println(get("Hello your Entered: " + value));
        System.out.println("your Value is: " + value);
    }

    public <T extends Number> ConstructorAndMethod(T value) {
        System.out.println(get("Hello your Entered: " + value));
        System.out.println("your Value is: " + value);

    }

    //Generic Methods
    // make it as a return type also
    public <T> T get(T value) {
        return value;
    }

    // syntax
    public <T> void methodName(T parameter) {
        // method body
    }

    // Generic Methods
    // printing an array
    public <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // method overloading using Generics
    public <T> String display(T element){
        return "Your Value is: "+element;
    }

    public <T> Double display(Double salary){
        System.out.println("Your Salary is: "+ salary);
        return salary;
    }
    public <T> void display(Integer element){
        System.out.println("Your Value is: "+element);
    }


    public static void main(String[] args) {
        ConstructorAndMethod constructor = new ConstructorAndMethod("Prabha");
        System.out.println(constructor.get("Santhosh"));

        ConstructorAndMethod constructor1 = new ConstructorAndMethod(234);
        System.out.println(constructor1.get(234));

        System.out.println(constructor.get("I'm Happy What ever in my life.!"));

        constructor.printArray(Arrays.asList(1,2,3,4).toArray());
        String result = constructor.display("Hello");
        System.out.println(result);
        constructor.display(234);
        constructor.display(23445.237);

    }


}
