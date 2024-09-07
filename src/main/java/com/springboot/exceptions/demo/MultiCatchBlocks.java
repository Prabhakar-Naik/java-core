package com.springboot.exceptions.demo;

import java.io.IOException;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchBlocks {
	
	public static void main(String[] args) throws SQLException ,IOException,InterruptedException,ClassNotFoundException{
		
		try {
			System.out.println("try block started...");
			//System.out.println("Division: "+10/0);
			
			int arr[]= {1,2,3,4,5};
			//System.out.println(arr[5]);
			
			String str="prabha";
			//System.out.println(str.charAt(7));
			
			String name=null;
			//System.out.println(name.toCharArray());
			int a;
			System.out.println("Enter a Number: ");
			Scanner sc=new Scanner(System.in);
			//a=sc.nextInt();
			//System.out.println(a);
			String na="aaa";
			//int n=Integer.parseInt(na);
			//System.out.println(n);
			System.out.println("try block closed");
		}
		catch(ArithmeticException e) {
			
			throw e;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
			throw e;
		}
		catch(StringIndexOutOfBoundsException e) {
			throw e;
		}
		catch(NullPointerException e) {
			throw e;
		}
		catch(NumberFormatException e) {
			throw e;
		}
		catch(InputMismatchException e) {
			throw e;
		}
		catch(Exception e) {
			throw e;
		}
	}

}
