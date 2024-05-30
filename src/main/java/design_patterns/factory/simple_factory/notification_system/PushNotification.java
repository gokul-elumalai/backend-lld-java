package main.java.design_patterns.factory.simple_factory.notification_system;


public class PushNotification extends Notification {

    public PushNotification(String recipient, String message) {
        this.recipient = recipient;
        this.message = message;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getMessage() {
        return message;
    }

    public void sendNotification() {
        // Logic to send a push notification
        System.out.println("Push notification sent to device " + recipient);
        System.out.println("Message: " + message);
    }

    public NotificationType notificationType() {
        return NotificationType.PUSH;
    }
}
