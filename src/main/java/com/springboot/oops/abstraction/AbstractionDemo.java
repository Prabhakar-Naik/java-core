package com.springboot.oops.abstraction;

public class AbstractionDemo {

	public static void main(String[] args) {
		
		System.out.println("Abstraction: It is a process of getting required data hiding unnecessary data is known as Abstraction.");
		
		System.out.println("Advantages: security and Enhancement");
		
		System.out.println("Abstraction contains abstract class and interfaces");
		
		System.out.println("Abstract class : A class contain the abstract keyword in its declaration is call as abstract class");
		
		System.out.println("Abstract method : A method without body is called as abstract method");
		
		System.out.println("Note: we can't create abstract object for abstract class.\n\n");
		// we can implement the functionality
		Animal animal = new Animal() {
			@Override
			public void sound() {
				System.out.println("I'm an animal");
			}
		};
		animal.sound();
		
		System.out.println("It is abstract class methods...");
		
		Dog d=new Dog();
		d.sound();
		
		Lion l=new Lion();
		l.sound();
		
		
		
		
		
	}
}

abstract class Animal{
	

	Animal(){
		System.out.println("Every Animals sound is different....");
	}
	
	public abstract void sound();
}

class Dog extends Animal{

	Dog(){
		super();
	}
	@Override
	public void sound() {
		System.out.println("Dog is Barking...");
	}
}


class Lion extends Animal{

	Lion(){
		super();
	}
	@Override
	public void sound() {
		System.out.println("Lion is Roar....");
	}
	
}