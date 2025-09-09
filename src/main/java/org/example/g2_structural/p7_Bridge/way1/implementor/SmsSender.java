package org.example.g2_structural.p7_Bridge.way1.implementor;

public class SmsSender implements NotificationSender {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS notification: " + message);
    }
}
