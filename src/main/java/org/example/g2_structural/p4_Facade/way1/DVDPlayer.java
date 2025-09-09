package org.example.g2_structural.p4_Facade.way1;

public class DVDPlayer { //extends Worker

    public void turnOn() {
        System.out.println("DVD player is turned on.");
    }

    public void turnOff() {
        System.out.println("DVD player is turned off.");
    }

    public void playMovie(String movie) {
        System.out.println("Playing movie: " + movie);
    }
}
