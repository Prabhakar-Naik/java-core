package com.springboot.accessmodifiers.defaultmodifier;

/**
 * @author prabhakar, @Date 23-12-2024
 */
// we can not access a default class outside the package, access only inside the package
//public
class Vehicle {

    String name;
    int speed;

    //public
    Vehicle(){

    }

    // what functionality and behaviour of public access modifier same applicable on default classes

    Vehicle(String name, int speed){
        System.out.println(name+ " "+ speed);
    }



}
