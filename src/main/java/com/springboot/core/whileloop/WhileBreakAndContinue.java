package com.springboot.core.whileloop;

import java.util.Scanner;

/**
 * @author prabhakar, @Date 30-07-2024
 */
public class WhileBreakAndContinue {

    public static void main(String[] args) {

        int num, n=1;

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Input an integer");
            num = input.nextInt();

            if (num != 0) {
                System.out.println("You entered " + num);
                continue;
            }
            else {
                break;
            }
        }

        /*System.out.println("Input an integer");
        num = input.nextInt();

        while (n <= num){
            if (num == 5)
                continue;
            else if (num == 2)
                break;
            else
                System.out.println(num);
            num--;
        }*/

    }
}
