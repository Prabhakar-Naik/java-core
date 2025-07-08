package com.springboot.designpatterns.structural.bridge;

/**
 * @author prabhakar, @Date 05-07-2025
 */

public class BridgeDemo {

    public static void main(String[] args) {
        System.out.println("""
                Concept: Decouples an abstraction from its implementation so that the two can vary independently.
                Example: Controlling different types of devices (TV, Radio) with different remote controls (Basic, Advanced).
                """);
        Device tv = new Tv();
         Device radio = new Radio();

         Remote basicTvRemote = new BasicRemote(tv);
         basicTvRemote.togglePower();
         basicTvRemote.togglePower();

         Remote advancedRadioRemote = new AdvancedRemote(radio);
         advancedRadioRemote.togglePower();
         advancedRadioRemote.channelUp();
         advancedRadioRemote.channelUp();
         advancedRadioRemote.togglePower();
    }
}
