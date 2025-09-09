package org.example.g2_structural.p7_Bridge.way1.abstraction;

import org.example.g2_structural.p7_Bridge.way1.implementor.NotificationSender;

public class HtmlNotification extends AbstractNotification {
    public HtmlNotification(NotificationSender sender) {
        super(sender);
    }

    @Override
    public void notifyUser(String message) {
        sender.sendNotification("<html><body>" + message + "</body></html>");
    }
}
