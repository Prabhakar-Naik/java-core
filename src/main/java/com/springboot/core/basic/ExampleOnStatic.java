package com.springboot.core.basic;

public class ExampleOnStatic {

	public static void main(String[] args) {
		
		System.out.println("Example one");
		hiVeera("prabha");
		claimMessage();
		String prabha = textToBinary("Prabha");
		
		String v = textToBinary("V");
		String v1 = textToBinary("v");
		String p = textToBinary("P");
		String p1 = textToBinary("p");
		System.out.println(v+" V");
		System.out.println(v1+" v");
		System.out.println(p+" P");
		System.out.println(p1+" p");
		System.out.println(prabha);
	}
	
	public static String textToBinary(String originalText) {
	    String binaryText = "";
	    for (int i = 0; i < originalText.length(); i++) {
	        char currentChar = originalText.charAt(i);
	        int ascii = (int) currentChar;
	        String binary = decimalToBinary(ascii);
	        binaryText += "0"+binary + " ";
	    }
	    return binaryText;
	}
	
	public static String decimalToBinary(int decimal) {
	    if (decimal <= 0) {
	        return "0";
	    }
	    String binary = "";
	    while (decimal > 0) {
	        short remainder = (short) (decimal % 2);
	        decimal = decimal / 2;
	        binary = String.valueOf(remainder) + binary;
	    }
	    return binary;
	}
	
	
	
	public static void hiVeera(String hi) {
		System.out.println("Hi "+hi);
	}
	
	protected static void claim() {
		System.out.println("Hi Veera Bro How are you !!");
	}
	
	private static String claimMessage() {
		return "Hi this doubt from veera mava bro";
	}
	
	public static final String dude() {
		System.out.println("this is dude message");
		return "dude success";
	}
}
