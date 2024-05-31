package main.java.design_patterns.factory.abstract_factory.notifications.sender;


import main.java.design_patterns.factory.abstract_factory.notifications.NotificationType;
import main.java.design_patterns.factory.abstract_factory.notifications.notification.Notification;

public class EmailNotificationSender extends NotificationSender {

    public EmailNotificationSender(Notification notification) {
        super(notification);
    }

    @Override
    public void send() {
        System.out.println("Sending Email notification to " + getNotification().getRecipient());
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }
}