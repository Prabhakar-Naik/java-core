package com.springboot.generics.wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static com.springboot.generics.wildcards.lowerboundtype.LowerBoundType.printIntNumbers;
import static com.springboot.generics.wildcards.upperboundtype.UpperBoundType.sum;

/**
 * @author prabhakar, @Date 31-12-2024
 */
public class MainSigma {

    public <T> T getFirst(ArrayList<T> list) {
        return list.get(0);
    }

    public <T> ArrayList<T> copy(ArrayList<T> source, ArrayList<T> destination) {

        //destination.addAll(source);

        for (T o : source) {
            destination.add(o);
        }
        return destination;
    }

    public <T> void print(ArrayList<T> source) {

        for (T o : source) {
            System.out.println(o);
        }
    }

    public static int sumInt(ArrayList<?> arrayList){
        int sum = 0;
        for (Object i: arrayList){
            sum += (int)i;
        }
        return sum;
    }


    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1234);
        list.add(23);
        list.add(45);
        list.add(30);
        MainSigma sigma = new MainSigma();
        System.out.println(sigma.getFirst(list));

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList = sigma.copy(list, arrayList);

        System.out.println(arrayList);
        sigma.print(arrayList);


        //UpperBoundType
        System.out.println(sumInt(arrayList));

        System.out.println(sum(arrayList.stream().toList()));

        System.out.println(sum(Arrays.asList(1,2,3,4,5)));


        List<? extends Number> numbers = Arrays.asList(10,20,30,40,50);
//        numbers.add(null);  // upper Bound addition not possible only it will take null
//        numbers.add(23);    // it doesn't take

        List<? super Integer> nums = Arrays.asList(10,20,30,40,50);
//        nums.add(23);       // addition is possible with lower Bound type
//        nums.add(null);     // it will also

        // LowerBoundType
        printIntNumbers(nums);
    }

}
