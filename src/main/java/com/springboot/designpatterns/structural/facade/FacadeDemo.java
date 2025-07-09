package com.springboot.designpatterns.structural.facade;

/**
 * @author prabhakar, @Date 05-07-2025
 */

public class FacadeDemo {

    public static void main(String[] args) {
        System.out.println("""
                Concept: Provides a simplified interface to a complex subsystem.
                Example: A HomeTheaterFacade that simplifies operations like watching a movie, listening to music.
                """);
        DvdPlayer dvd = new DvdPlayer();
         Amplifier amp = new Amplifier();
         Projector proj = new Projector();

         HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvd, amp, proj);

         homeTheater.watchMovie("The Matrix");
         homeTheater.endMovie();
    }
}
