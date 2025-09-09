package org.example.g2_structural.p4_Facade.way1;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class HomeTheaterFacade {

    private final TV tv;
    private final SoundSystem soundSystem;
    private final DVDPlayer dvdPlayer;

    public void watchMovie() {
        System.out.println("Get ready to watch a movie...");
        tv.turnOn();
        tv.setChannel(1);

        soundSystem.turnOn();
        soundSystem.setVolume(5);

        dvdPlayer.turnOn();
        dvdPlayer.playMovie("Мстители");
    }

    public void endMovie() {
        System.out.println("Shutting down the home theater...");
        dvdPlayer.turnOff();
        soundSystem.turnOff();
        tv.turnOff();
    }
}
