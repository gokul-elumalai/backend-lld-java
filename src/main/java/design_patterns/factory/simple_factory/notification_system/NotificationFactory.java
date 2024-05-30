package main.java.design_patterns.factory.simple_factory.notification_system;


public class NotificationFactory {

    public static Notification createNotification(
            NotificationType notificationType,
            String message,
            String recipient,
            String sender) {
        switch (notificationType) {
            case EMAIL: return new EmailNotification(recipient, sender, message);
            case PUSH: return new PushNotification(recipient, message);
            case SMS: return new SmsNotification(recipient, message);
        }
        return null;
    }
}
