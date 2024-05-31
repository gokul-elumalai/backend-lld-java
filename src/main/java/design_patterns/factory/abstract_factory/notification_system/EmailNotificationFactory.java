package main.java.design_patterns.factory.abstract_factory.notification_system;

import main.java.design_patterns.factory.abstract_factory.notification_system.notification.EmailNotification;
import main.java.design_patterns.factory.abstract_factory.notification_system.notification.Notification;
import main.java.design_patterns.factory.abstract_factory.notification_system.sender.EmailNotificationSender;
import main.java.design_patterns.factory.abstract_factory.notification_system.sender.NotificationSender;
import main.java.design_patterns.factory.abstract_factory.notification_system.template.EmailNotificationTemplate;
import main.java.design_patterns.factory.abstract_factory.notification_system.template.NotificationTemplate;


public class EmailNotificationFactory extends NotificationFactory{

    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }

    @Override
    public Notification createNotification(String recipient, String sender, NotificationTemplate notificationTemplate) {
        return new EmailNotification(recipient, sender, notificationTemplate);
    }

    @Override
    public NotificationSender createNotificationSender(Notification notification) {
        return new EmailNotificationSender(notification);
    }

    @Override
    public NotificationTemplate createNotificationTemplate(String message) {
        return new EmailNotificationTemplate(message);
    }
}
