package com.springboot.exceptions.scenario2;

import static com.springboot.exceptions.scenario2.Exceptions.divide;

/**
 * @author prabhakar, @Date 25-12-2024
 */
// Program will run except some cases some we will handle those exceptions
public class ExceptionHandling {

    /*
    The Exception Handling is a way to handle the runtime errors
    so that the normal flow of the application can be maintained.
    */

    // Hierarchy
    /*
    java.lang.Object
    |---java.lang.Throwable
        |---java.lang.Error                       ______|
        |   |---java.lang.VirtualMachineError           |
        |   |   |---java.lang.OutOfMemoryError          |
        |   |   |---java.lang.StackOverflowError        |----Errors (Managed by JVM)
        |   |---java.lang.LinkageError                  |
        |   |   |---java.lang.ClassFormatError          |
        |   |   |---java.lang.NoClassDefFoundError______|
        |---java.lang.Exception                        _|
            |---java.lang.RuntimeException              |
            |   |---java.lang.ArithmeticException       |---UnChecked Exceptions ==>|
            |   |---java.lang.NullPointerException      |                           |
            |   |---java.lang.IndexOutOfBoundsException |                           |
            |   |---java.lang.IllegalArgumentException _|                           |
            |---java.io.IOException                     |______     Handled By Developers
            |   |---java.io.FileNotFoundException       |      |                    |
            |   |---java.io.EOFException                |      |                    |
            |---java.sql.SQLException                   |      |-Checked Exceptions=|
            |---java.lang.reflect.InvocationTargetException    |
            |---java.net.SocketException                |      |
            |---java.net.UnknownHostException           |______|
    */


    public static void main(String[] args) {

        try {
            level1();
        } catch (Exception e) {
            //e.printStackTrace();
            StackTraceElement[] stackTrace = e.getStackTrace();
            for (int j = 0; j < stackTrace.length; j++) {
                System.out.println(stackTrace[j]);
            }
        }
        System.out.println("Good Job :)");
    }

    public static void level3() {
        int[] array = new int[5];
        array[5] = 10;
    }

    public static void level2() {
        level3();
    }

    public static void level1() {
        level2();
    }

}
