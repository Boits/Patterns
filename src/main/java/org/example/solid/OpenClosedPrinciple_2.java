package org.example.solid;

public class OpenClosedPrinciple_2 {
}

/**
 * Нарушение OCP
 */
class NotificationService {
    public void sendNotification(String type) {
        if (type.equals("email")) {
            // отправка email
        } else if (type.equals("sms")) {
            // отправка SMS
        }
        // Если нужно добавить новый тип уведомления (например, push), нужно будет изменить этот код
    }
}
/**
 * Можно добавлять новые уведомления, не изменяя существующий код.
 */
interface Notification {
    void send();
}

class EmailNotification implements Notification {
    public void send() { /* отправка email */ }
}

class SmsNotification implements Notification {
    public void send() { /* отправка SMS */ }
}

