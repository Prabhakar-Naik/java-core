package com.springboot.context;

/**
 * @author prabhakar, @Date 06-03-2025
 */

public class ConditionalStatements {

    // Conditional Statements
    // Relational Operators     <,   >,  <=, >=, ==, !=
    // Logical Operators        &&-->(AND),  ||-->(OR),    !-->(NOT)
    // They return a boolean result     true / false

        /*
            Operand 1       Operand 2     Operand1 && Operand2
              true            true              true
              true            false             false
              false           true              false
              false           false             false

            Operand 1       Operand 2     Operand1 || Operand2
              true            true              true
              true            false             true
              false           true              true
              false           false             false

        */

    public static void main(String[] args) {

        int value = 5;
        int value2 = 10;
        int value3 = 5;

        // Relational Operators     <,   >,  <=, >=, ==, !=

        System.out.println(value);
        System.out.println(value2);
        System.out.println(value3);

        // Operator > (greater than)
        System.out.println(value > value2);     // 5 > 10   false
        System.out.println(value > value3);     // 5 > 5    false

        // Operator < (less than)
        System.out.println(value < value2);     // 5 < 10   true
        System.out.println(value < value3);     // 5 < 5    false

        System.out.println(value2 > value3);    // 10 > 5   true
        System.out.println(value3 > value2);    // 5 > 5    false

        // Operator >= (greater than equals to)
        System.out.println(value >= value2);    // 5 >= 10  false
        System.out.println(value2 >= value3);   // 10 >= 5  true

        // Operator <= (less than equals to)
        System.out.println(value <= value2);    // 5 <= 10  true
        System.out.println(value <= value3);    // 5 <= 5   true
        System.out.println(value2 <= value3);   // 10 <= 5  false

        // Operator == (double equals to)
        System.out.println(value == value2);    // 5 == 10  false
        System.out.println(value == value3);    // 5 == 5   true
        System.out.println(value2 == value3);   // 10 == 5  false

        // Operator != (not equals to)
        System.out.println(value != value2);    // 5 != 10  true
        System.out.println(value != value3);    // 5 != 5   false
        System.out.println(value2 != value3);   // 10 != 5  true


        // Logical Operators        &&-->(AND),  ||-->(OR),    !-->(NOT)
        // we are combines the conditions on Logical operators

        // Operator &&-->(AND)
        System.out.println(value != value2 && value != value3); // 5 != 10  true && 5 != 5   false --> false

        // Operator ||-->(OR)
        System.out.println(value != value2 || value != value3); // 5 != 10  true || 5 != 5   false --> true

        // !-->(NOT)
        System.out.println(value != value2 && !(value != value3));// 5 != 10  true && !(5 != 5)  not false --> true

        System.out.println(5 == 5 && 10 == 5 && true || true);      // true
        System.out.println(5 == 5 && 10 == 5 && false || true);     // true
        System.out.println((5 == 5 && 10 == 5 ) && (true || true)); // false
        System.out.println((5 == 5 && 10 == 5 ) && (false || true));// false


        // play with boolean values
        boolean isSunny = true;
        boolean isWarm = false;
        System.out.println(isSunny && isWarm);      // false

        System.out.println((isSunny && isWarm) || (isSunny || isWarm));     //true
        System.out.println((isSunny && !isWarm) || (!isSunny || isWarm));   //true


    }
}
