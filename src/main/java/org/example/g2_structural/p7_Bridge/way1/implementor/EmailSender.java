package org.example.g2_structural.p7_Bridge.way1.implementor;

public class EmailSender implements NotificationSender {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending email notification: " + message);
    }
}
