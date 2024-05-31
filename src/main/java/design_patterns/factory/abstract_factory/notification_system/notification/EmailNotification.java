package main.java.design_patterns.factory.abstract_factory.notification_system.notification;


import main.java.design_patterns.factory.abstract_factory.notification_system.NotificationType;
import main.java.design_patterns.factory.abstract_factory.notification_system.template.NotificationTemplate;

public class EmailNotification extends Notification{
    private String sender;

    public EmailNotification(String recipient, String sender, NotificationTemplate template) {
        super(recipient, template);
        this.sender = sender;
    }


    public String getSender() {
        return sender;
    }

    @Override
    public void sendNotification() {
        // Logic to send an email
        System.out.println("Email sent to " + getRecipient() + " from " + sender);
        System.out.println("Message: " + getTemplate().getMessage());
    }

    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }
}
