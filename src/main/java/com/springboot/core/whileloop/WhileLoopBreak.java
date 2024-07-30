package com.springboot.core.whileloop;

import java.util.Scanner;

/**
 * @author prabhakar, @Date 30-07-2024
 */
public class WhileLoopBreak {

    public static void main(String[] args) {
        int num;

        Scanner input = new Scanner(System.in);

        /*while (true) {
            System.out.println("Input an integer");
            num = input.nextInt();

            if (num == 0) {
                break;
            }
            System.out.println("You entered " + num);
        }*/
        System.out.println("Input an integer");
        num = input.nextInt();

        while (true){
            if (num == 5)
                break;
            else
                System.out.println(num);
            num--;
        }

    }
}
