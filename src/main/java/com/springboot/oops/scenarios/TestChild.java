package com.springboot.oops.scenarios;

/**
 * @author prabhakar, @Date 25-08-2025
 */

public class TestChild extends TestParent {

    @Override
    public void method1() {
        System.out.println("TestChild method1");
    }

    // compilation error BCZ weaker access privileges ('package-private'); was 'public'
//    void method1() {
//        System.out.println("TestChild method1 without public keyword");
//    }

    public void method1(int a) {
        System.out.println("TestChild method1 parameter: "+a);
    }

}
