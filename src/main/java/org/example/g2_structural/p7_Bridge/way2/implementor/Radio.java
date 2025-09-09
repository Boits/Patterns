package org.example.g2_structural.p7_Bridge.way2.implementor;

public class Radio implements Device {
    private int volume = 5;

    public void turnOn() {
        System.out.println("Radio is ON");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Radio volume set to " + volume);
    }
}
