package com.springboot.lambda;

@FunctionalInterface
interface  Cab {
	void bookUber();
}

class bookCab implements Cab{

	@Override
	public void bookUber() {
		System.out.println("This is bookUber method in bookCab class ... printing soon!");
		
	}
	
}
public class LambdaApp {

	public static void main(String[] args) {
		//1.
//		Cab cab=new bookCab();
//		cab.bookUber();
		
		//2.
		//Anonymous class implementation
//		Cab cab=new Cab() {
//
//			@Override
//			public void bookUber() {
//				System.out.println("this is anonymous method implementation...");
//				
//			}
//		};
//		cab.bookUber();
		
		//3.
		//using Lambda
		
		Cab cab= ()->{
			System.out.println("this is lambda Expression using functional Interface easy code...");
		};
		
		cab.bookUber();
		
	}
}
