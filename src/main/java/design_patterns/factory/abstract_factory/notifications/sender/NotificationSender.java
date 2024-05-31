package main.java.design_patterns.factory.abstract_factory.notifications.sender;

import main.java.design_patterns.factory.abstract_factory.notifications.NotificationType;
import main.java.design_patterns.factory.abstract_factory.notifications.notification.Notification;

public abstract class NotificationSender {
    private final Notification notification;

    public NotificationSender(Notification notification) {
        this.notification = notification;
    }

    public Notification getNotification() {
        return notification;
    }

    public abstract void send();

    public abstract NotificationType notificationType();

}
