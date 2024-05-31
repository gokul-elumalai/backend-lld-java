package main.java.design_patterns.factory.abstract_factory.notification_system;

import main.java.design_patterns.factory.abstract_factory.notification_system.notification.Notification;
import main.java.design_patterns.factory.abstract_factory.notification_system.sender.NotificationSender;
import main.java.design_patterns.factory.abstract_factory.notification_system.template.NotificationTemplate;

public abstract class NotificationFactory {
    public abstract NotificationType notificationType();

    public abstract Notification createNotification(String recipient, String sender, NotificationTemplate notificationTemplate);
    public abstract NotificationSender createNotificationSender(Notification notification);
    public abstract NotificationTemplate createNotificationTemplate(String message);
}
