package org.example.g2_structural.p7_Bridge.way2.abstraction;

import org.example.g2_structural.p7_Bridge.way2.implementor.Device;

public class VoiceRemoteControl extends RemoteControl {

    public VoiceRemoteControl(Device device) {
        super(device);
    }

    public void manage() {
        device.turnOn();
        device.setVolume(50);
    }
}
