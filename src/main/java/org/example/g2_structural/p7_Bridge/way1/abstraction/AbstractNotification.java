package org.example.g2_structural.p7_Bridge.way1.abstraction;

import org.example.g2_structural.p7_Bridge.way1.implementor.NotificationSender;

/**
 * Абстракция для уведомлений
 */
public abstract class AbstractNotification {
    protected NotificationSender sender; // <--- Мост (Bridge)

    protected AbstractNotification(NotificationSender sender) {
        this.sender = sender;
    }

    public abstract void notifyUser(String message);
}
