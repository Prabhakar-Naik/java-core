package com.springboot.coding_lyf;

import java.util.List;

/**
 * @author prabhakar, @Date 12-11-2025
 */
// type-safe reusable code; understand erasure and wildcards.
final class Pair<A,B> {
    public final A first; public final B second;
    public Pair(A a,B b){ first=a; second=b; }

    public static double sumNumbers(List<? extends Number> nums) {
        double s = 0;
        for (Number n : nums) s += n.doubleValue();
        return s;
    }

}

public class GenericsHere {


}
