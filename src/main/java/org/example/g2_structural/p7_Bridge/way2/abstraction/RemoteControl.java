package org.example.g2_structural.p7_Bridge.way2.abstraction;

import org.example.g2_structural.p7_Bridge.way2.implementor.Device;

public abstract class RemoteControl {
    protected Device device;  // <--- Мост (Bridge)

    protected RemoteControl(Device device) {
        this.device = device;
    }

    public abstract void manage();
}

