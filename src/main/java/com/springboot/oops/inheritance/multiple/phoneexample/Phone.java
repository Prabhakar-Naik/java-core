package com.springboot.oops.inheritance.multiple.phoneexample;

import java.util.List;

/**
 * @author prabhakar, @Date 24-12-2024
 */
public interface Phone {

    String makeCall(String number);

    void endCall();

    default List<String> phoneBook(){
        return List.of("100","108","104","111");
    }

}
