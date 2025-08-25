package com.springboot.oops.scenarios;

/**
 * @author prabhakar, @Date 25-08-2025
 */

public class MainExample {

    public static void main(String[] args) {

        TestParent parent = new TestParent();
        parent.method1();
        // parent.method1(10); // there is no method to pass parameter

        TestChild child = new TestChild();
        child.method1();
        child.method1(10);

        TestParent child2 = new TestChild();
        child2.method1();
        // child2.method1(10); there is no method to pass parameter because of Parent class reference


    }
}
