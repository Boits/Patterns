package org.example.g2_structural.p4_Facade.way1;

public class TV { //extends Worker

    public void turnOn() {
        System.out.println("TV is turned on.");
    }

    public void turnOff() {
        System.out.println("TV is turned off.");
    }

    public void setChannel(int channel) {
        System.out.println("TV channel is set to " + channel);
    }
}
