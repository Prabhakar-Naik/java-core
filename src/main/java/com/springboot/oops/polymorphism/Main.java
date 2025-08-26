package com.springboot.oops.polymorphism;

import static com.springboot.oops.polymorphism.Parent.display1;

/**
 * @author prabhakar, @Date 23-12-2024
 */
class Parent {
    public void display() {
        System.out.println("Parent method");
    }


    public static void display1(){
        System.out.println("static void display1 Parent");
    }

}

class Child extends Parent {
    public void display() {
        System.out.println("Child method");
    }

    public static void display1(String name){
        System.out.println("static void display1 Child "+name);
    }

}

public class Main {
    public static void main(String[] args) {
      Parent p = new Child();
      p.display();
      display1();
      p.display1();

    }
}