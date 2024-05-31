package main.java.design_patterns.factory.abstract_factory.notifications.sender;

import main.java.design_patterns.factory.abstract_factory.notifications.NotificationType;
import main.java.design_patterns.factory.abstract_factory.notifications.notification.Notification;

public class PushNotificationSender extends NotificationSender {

    public PushNotificationSender(Notification notification) {
        super(notification);
    }

    @Override
    public void send() {
        System.out.println("Sending Push notification to " + getNotification().getRecipient());
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.PUSH;
    }
}
