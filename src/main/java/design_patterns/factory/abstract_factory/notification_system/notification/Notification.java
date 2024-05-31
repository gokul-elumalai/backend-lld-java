package main.java.design_patterns.factory.abstract_factory.notification_system.notification;


import main.java.design_patterns.factory.abstract_factory.notification_system.NotificationType;
import main.java.design_patterns.factory.abstract_factory.notification_system.template.NotificationTemplate;

public abstract class Notification {

    private String recipient;
    private NotificationTemplate template;

    public Notification(String recipient, NotificationTemplate template) {
        this.recipient = recipient;
        this.template = template;
    }

    public String getRecipient() {
        return recipient;
    }

    public NotificationTemplate getTemplate() {
        return template;
    }

    public abstract NotificationType notificationType();

    public abstract void sendNotification();
}
