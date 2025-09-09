package org.example.g2_structural.p4_Facade.way1;

public class SoundSystem { //extends Worker

    public void turnOn() {
        System.out.println("Sound system is turned on.");
    }

    public void turnOff() {
        System.out.println("Sound system is turned off.");
    }

    public void setVolume(int level) {
        System.out.println("Sound volume is set to " + level);
    }
}
