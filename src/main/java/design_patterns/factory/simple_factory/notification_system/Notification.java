package main.java.design_patterns.factory.simple_factory.notification_system;


public abstract class Notification {

    public String recipient;
    public String message;

    public abstract NotificationType notificationType();

    public abstract void sendNotification();

}
