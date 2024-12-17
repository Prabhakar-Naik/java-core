package com.springboot.oops.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		
		System.out.println("Encapsulation: It is process of binding or wrapping or grouping of related variables and methods\n\t"
				+ "in single container or unit is known as Encapsulation..");
		EncapsulationDemo r=new EncapsulationDemo();
		r.setValue(100);
		System.out.println(r.getValue());
		
	}
	
	private int value;	//data hiding
	
	public void setValue(int x) 	//data abstraction
	{
		value=x;
		
	}
	
	public int getValue() {
		
		System.out.println("value is "+value);
		return value;
	}
}
