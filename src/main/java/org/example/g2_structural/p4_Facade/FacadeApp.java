package org.example.g2_structural.p4_Facade;


import org.example.g2_structural.p4_Facade.way1.DVDPlayer;
import org.example.g2_structural.p4_Facade.way1.HomeTheaterFacade;
import org.example.g2_structural.p4_Facade.way1.SoundSystem;
import org.example.g2_structural.p4_Facade.way1.TV;

public class FacadeApp {

    public static void call() {
        // Создание фасада
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(new TV(), new SoundSystem(), new DVDPlayer());

        // Включение домашнего кинотеатра
        homeTheater.watchMovie();

        // Остановка домашнего кинотеатра
        homeTheater.endMovie();
    }
}
