package com.springboot.designpatterns.structural.facade;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Facade
public class HomeTheaterFacade {

    private DvdPlayer dvdPlayer;
    private Amplifier amplifier;
    private Projector projector;

    public HomeTheaterFacade(DvdPlayer dvdPlayer, Amplifier amplifier, Projector projector) {
        this.dvdPlayer = dvdPlayer;
        this.amplifier = amplifier;
        this.projector = projector;
    }

    public void watchMovie(String movie) {
        System.out.println("\nGet ready to watch a movie...");
        projector.on();
        amplifier.on();
        amplifier.setVolume(10);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("\nShutting down movie theater...");
        dvdPlayer.off();
        amplifier.off();
        projector.off();
    }
}

// Usage
// public class FacadeDemo {
//     public static void main(String[] args) {
//         DvdPlayer dvd = new DvdPlayer();
//         Amplifier amp = new Amplifier();
//         Projector proj = new Projector();
//
//         HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvd, amp, proj);
//
//         homeTheater.watchMovie("The Matrix");
//         homeTheater.endMovie();
//     }
// }
