package org.example.g2_structural.p7_Bridge.way2.implementor;

public class TV implements Device {
    private int volume = 10;

    public void turnOn() {
        System.out.println("TV is ON");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("TV volume set to " + volume);
    }
}
