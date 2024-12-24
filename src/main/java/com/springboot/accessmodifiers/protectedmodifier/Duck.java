package com.springboot.accessmodifiers.protectedmodifier;

/**
 * @author prabhakar, @Date 23-12-2024
 */
public class Duck extends Bird{

    public Duck(String name){
        super(name, "Beck Beck");
    }

    public void waveBody(){
        System.out.println(getName()+ " is waving its body.");
    }

    private String getName(){
        return getClass().getSimpleName();
    }


    public void setDuckSound(String buckBuck) {
        changeSound(buckBuck);
    }
}
