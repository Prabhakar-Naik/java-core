package com.springboot.generics.wildcards.lowerboundtype;

import java.util.List;

/**
 * @author prabhakar, @Date 31-12-2024
 */
// Lower bound class
public class LowerBoundType {

    // lower bound type
    // Integer, Double, Float, Short, Byte Numeric Generic classes all are child of Number Parent
    public static void printIntNumbers(List<? super Integer> list){
        for (Object o: list){
            System.out.print(o+" ");
        }
        System.out.println();
    }

}
