package com.springboot.java17;

/**
 * @author prabhakar, @Date 02-12-2025
 */

public final class FinalClass {

    public String youCanNotExtendFinalClass() {
        return "you can not extend final class";
    }

    // can not access the functions
    public String youCanNotOverrideFinalClassImplementations() {
        return "you can not override final class implementations";
    }
}


//class Sample extends FinalClass{
//
//}