package com.springboot.accessmodifiers.test;

//import com.springboot.accessmodifiers.defaultmodifier.Vehicle;
import com.springboot.accessmodifiers.privatemodifier.Animal;
import com.springboot.accessmodifiers.protectedmodifier.Bird;
import com.springboot.accessmodifiers.protectedmodifier.Duck;
import com.springboot.accessmodifiers.publicmodifier.Student;

/**
 * @author prabhakar, @Date 23-12-2024
 */
public class Test {

    //public ==> we can access public access modifier anywhere in the project
    //private ==> we can access private access modifier class level only
    //protected  ==> we can access protected access modifier at child class level only

    public static void main(String[] args) {

        // public
        Student student = new Student();
        student.age = 12;
        student.name = "prabha";
        student.sayHello();

        //private
        // Animal animal = new Animal();   // object creation not possible with private constructor class

        // default     //object creation not possible outside the package we can create within the package
        // Vehicle vehicle = new Vehicle();

        //protected        // object creation is possible, but we can not access protected implementations
        //    we can access or modify the implementation of protected functions by using child inheritance

        Bird bird = new Bird("Puppy","Tik Tik");
        bird.makeSound();
        Duck duck = new Duck("puppy");
        duck.makeSound();
        duck.waveBody();
        duck.setDuckSound("Buck Buck");
        duck.makeSound();




    }
}
