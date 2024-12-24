package com.springboot.accessmodifiers.protectedmodifier;

import com.springboot.accessmodifiers.privatemodifier.Animal;

/**
 * @author prabhakar, @Date 23-12-2024
 */
public class Bird {

    private String name;
    private String sound;


    public Bird(String name, String sound){
        this.name = name;
        this.sound = sound;
    }

    public void makeSound(){
        System.out.println(name+" make a sound: "+sound);
    }

    protected void changeSound(String newSound){
        this.sound = newSound;
    }



}
