package com.springboot.scenarios.javaPnCExceptionRule;

/**
 * @author prabhakar, @Date 11-08-2025
 */

public class MainCompilation {

    public static void main(String[] args) throws Exception {

        // un comment one by one you get more clarity

        // we don't get compilation error
//        Child child = new Child();
//        child.show();

        // here we can get compilation because of expect exception at method signature
//        Parent parent = new Parent();
//        parent.show();

        // here we can get compilation because of expect exception at method signature
        Parent child2 = new Child();
        child2.show();
    }
}
