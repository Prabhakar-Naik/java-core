package com.springboot.oops.abstraction;

public class AbstractMethod {

	public static void main(String[] args) {
		
		Programming j=new Java();
		j.Developer();
		
		Programming h=new HTML();
		h.Developer();
	}
}

abstract class Programming{
	
	public abstract void Developer();
	
}

class HTML extends Programming{

	@Override
	public void Developer() {
		System.out.println("HTML Developer......");
		System.out.println("Tim Berners Lee");
		
	}
}

class Java extends Programming{

	@Override
	public void Developer() {
		System.out.println("Java Developer.....");
		System.out.println("James Gosling ");
		
	}
	
}