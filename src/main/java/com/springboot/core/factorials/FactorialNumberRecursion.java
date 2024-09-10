package com.springboot.core.factorials;

public class FactorialNumberRecursion {

	static int fact=1;
	static int printFactorial(int n)
	{
		if(n>0) {
			fact = fact * n;
			printFactorial(n - 1);
		}
		return fact;
    }

	static int f =1;
	static int calcFactorial(int num){
		if (num == 0 || num == 1){
			return 1;
		}
		return  num * calcFactorial(num-1);
	}

	static int factorial(int n) {
		if (n == 1)
			return 1;
		else {
			return (n * factorial(n - 1));
		}
	}


		public static void main(String[] args) throws InterruptedException {

		System.out.println(printFactorial(5));
//		fact = 1;
		System.out.println(calcFactorial(4));

		System.out.println(factorial(4));
	}
}
