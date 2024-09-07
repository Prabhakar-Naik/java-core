package com.springboot.core.whileloop;

/**
 * @author prabhakar, @Date 23-08-2024
 */
public class WhileDemo {

    public static void main(String[] args) {
        int i=1;


        // loop 1 to 100
//		while ( i<=100) {
//			System.out.println(i);
//			i++;
//		}

        //Even 200 to 500
//		i=200;
//		while(i<=500) {
//			if(i%2==0) {
//				System.out.println(i);
//			}
//			i++;
//		}

        //Divisible by 7
//		i=150;
//		while (i<=200) {
//			if(i%7==0)
//				System.out.println(i);
//			i++;
//		}
//
        //Prime 50 to 150
//		i=50;
//		while (i<=150) {
//			int count=0;
//			int n=i;
//			for(int j=1;j<=n;j++) {
//				if(n%j==0)
//					count++;
//			}
//			if(count==2)
//				System.out.println(i);
//
//			count=0;
//			i++;
//
//		}

        //sum of even numbers 40 to 80
//		i=40;
//		int sum=0;
//		while(i<=80) {
//
//			if(i%2==0)
//				sum = sum + i;
//			i++;
//		}
//		System.out.println(sum);

        // odd numbers 200 to 25 reverse order
        i=200;
        while(i>=25) {
            if(i%2==1)
                System.out.println(i);
            i--;
        }

        //all those above assignments using for loop

    }
}
