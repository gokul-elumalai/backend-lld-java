package main.java.design_patterns.factory.abstract_factory.notifications;

import main.java.design_patterns.factory.abstract_factory.notifications.notification.Notification;
import main.java.design_patterns.factory.abstract_factory.notifications.sender.NotificationSender;
import main.java.design_patterns.factory.abstract_factory.notifications.template.NotificationTemplate;

public abstract class NotificationFactory {
    public abstract NotificationType notificationType();

    public abstract Notification createNotification(String recipient, String sender, NotificationTemplate notificationTemplate);
    public abstract NotificationSender createNotificationSender(Notification notification);
    public abstract NotificationTemplate createNotificationTemplate(String message);
}
