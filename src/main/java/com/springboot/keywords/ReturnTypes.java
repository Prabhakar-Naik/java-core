package com.springboot.keywords;

import java.util.*;

/**
 * @author prabhakar, @Date 24-12-2024
 */
public class ReturnTypes {


    // return type is mandate for a method at least void type

    void init(){
        // it does not return anything
    }

    // apart from void every return type expect exact return type.
    byte aByte(){
        // it must accept byte return type only
        return 12;
    }

    char aChar(){
        // it must accept char return type only
        return 'A';
    }

    short aShort(){
        // it must accept short return type only
        return 1234;
    }

    int anInt(){
        // it must accept int return type only
        return 2;
    }

    long aLong(){
        // it must accept long return type only
        return 45678909876L;
    }

    float aFloat(){
        // it must accept float return type only
        return 34.7f;
    }

    double aDouble(){
        // it must accept double return type only
        return 234.466;
    }

    boolean aBoolean(){
        // it must accept boolean return type only
        return true;
    }

    AccessControlKeywords publicClass(){
        // it must accept PublicClass return type only
        return new AccessControlKeywords();
    }

    String string(){
        // it must accept String return type only
        return "abcd";
    }

    List<Integer> integerList(){
        // it must accept List<Integer> return type only
        return List.of(1,2,3,4,5);
    }

    // here just I express the examples that's why I mentioned here recursive methods
    Queue<String> stringQueue(){
        // it must accept Queue<String> return type only
        return stringQueue();
    }

    Set<Integer> integerSet(){
        // it must accept Set<Integer> return type only
        return Set.of(1,2,3,4,5,5);
    }

    Map<Integer,String> stringMap(){
        // it must accept Map<Integer,String> return type only
        return stringMap();
    }


    ReturnTypes returnType(){
        return new ReturnTypes();
    }

    // we can return the type of generic type.
    public <T extends Number> Number add(T type){
        return type;
    }

}
