package com.springboot.keywords;


/**
 * @author prabhakar, @Date 24-12-2024
 */
public class ObjectAndClassKeywords {

    // new: Creates a new instance of a class (an object).

    Person person = new Person();

    // this: Refers to the current instance of the class.
    class Person{
        String name;

        Person() {

            this.name = "John";
        }
    }

    //super: Refers to the parent class's members and is used to call a
    // superclass's constructor or method.

    //super.display();



}
