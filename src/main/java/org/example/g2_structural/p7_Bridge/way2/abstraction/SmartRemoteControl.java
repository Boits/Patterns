package org.example.g2_structural.p7_Bridge.way2.abstraction;

import org.example.g2_structural.p7_Bridge.way2.implementor.Device;

public class SmartRemoteControl extends RemoteControl {

    public SmartRemoteControl(Device device) {
        super(device);
    }

    public void manage() {
        device.turnOn();
        device.setVolume(30);
    }
}

