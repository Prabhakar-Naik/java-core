package com.springboot.core.primenumbers;

/**
 * @author prabhakar, @Date 19-12-2024
 */
public class Advance {

    public static void main(String[] args) {
        System.out.println(primeNumber(13));

    }

    public static boolean primeNumber(int number){
        int n = 0;
        for (int i=1; i< number/2; i++){
            if (number % i == 0)
                n++;
        }
        return n == 1;
    }

    boolean isPrime(int n) {
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++)
            if(n % i == 0) return false;
        return true;
    }


}
