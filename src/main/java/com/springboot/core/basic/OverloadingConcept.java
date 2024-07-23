package com.springboot.core.basic;

public class OverloadingConcept {

	public OverloadingConcept() {
		System.out.println("Default");
	}
	
	public OverloadingConcept(int a,int b) {
		System.out.println("Add numbers "+(a+b));
	}
	
	public OverloadingConcept(String name) {
		System.out.println("This is "+name);
	}
	
	public static void main(String[] args) {
		
		OverloadingConcept obj = new OverloadingConcept();
		OverloadingConcept obj1= new OverloadingConcept(20,40);
		OverloadingConcept obj2= new OverloadingConcept("veera");
		
		System.out.println(obj.add(20, 30));
		obj.add('S', "VeeraBabu");
		
	}
	
	public int add(int a,int b) {
		return a+b;
	}
	
	public double add(int a,double b) {
		return a+b;
	}
	
	public String add(String message,int a,int b) {
		return message+" "+(a+b);
	}
	
	public void add(char a,String name) {
		System.out.println(a+". "+name);
	}
}
