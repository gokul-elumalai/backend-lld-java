package main.java.design_patterns.factory.abstract_factory.notification_system.sender;

import main.java.design_patterns.factory.abstract_factory.notification_system.NotificationType;
import main.java.design_patterns.factory.abstract_factory.notification_system.notification.Notification;

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
