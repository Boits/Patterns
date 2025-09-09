package org.example.g3_behavioral.p1_Command;

/**
 * Получатель (Receiver):
 * Объект, который знает, как выполнить связанные с командой операции.
 * Знает, как выполнять операции (включать и выключать свет).
 */
public class LightReceiver {

    public void turnOn() {
        System.out.println("The light is ON");
    }

    public void turnOff() {
        System.out.println("The light is OFF");
    }
}
