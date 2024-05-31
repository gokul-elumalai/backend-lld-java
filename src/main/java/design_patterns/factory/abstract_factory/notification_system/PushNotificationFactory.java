package main.java.design_patterns.factory.abstract_factory.notification_system;

import main.java.design_patterns.factory.abstract_factory.notification_system.notification.Notification;
import main.java.design_patterns.factory.abstract_factory.notification_system.notification.PushNotification;
import main.java.design_patterns.factory.abstract_factory.notification_system.sender.NotificationSender;
import main.java.design_patterns.factory.abstract_factory.notification_system.sender.PushNotificationSender;
import main.java.design_patterns.factory.abstract_factory.notification_system.template.NotificationTemplate;
import main.java.design_patterns.factory.abstract_factory.notification_system.template.PushNotificationTemplate;

public class PushNotificationFactory extends NotificationFactory {

    @Override
    public NotificationType notificationType() {
        return NotificationType.PUSH;
    }

    @Override
    public Notification createNotification(String recipient, String sender, NotificationTemplate notificationTemplate) {
        return new PushNotification(recipient, notificationTemplate);
    }

    @Override
    public NotificationSender createNotificationSender(Notification notification) {
        return new PushNotificationSender(notification);
    }

    @Override
    public NotificationTemplate createNotificationTemplate(String message) {
        return new PushNotificationTemplate(message);
    }
}
