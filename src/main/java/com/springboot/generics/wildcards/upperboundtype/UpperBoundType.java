package com.springboot.generics.wildcards.upperboundtype;

import java.util.ArrayList;
import java.util.List;

/**
 * @author prabhakar, @Date 31-12-2024
 */
// upper bound class
public class UpperBoundType {


    // upper bound type is <? extends Number>
    // Number is the upper class for every numeric Generic classes
    public static double sum(ArrayList<? extends Number> numbers){
        double sum =0;
        for (Number number: numbers){
            sum += number.doubleValue();
        }
        return sum;
    }

    public static double sum(List<? extends Number> numbers){
        double sum =0;
        for (Number number: numbers){
            sum += number.doubleValue();
        }
        return sum;
    }

}
