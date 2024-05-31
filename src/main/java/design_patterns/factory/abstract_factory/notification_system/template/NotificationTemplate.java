package main.java.design_patterns.factory.abstract_factory.notification_system.template;

import main.java.design_patterns.factory.abstract_factory.notification_system.NotificationType;

public abstract class NotificationTemplate {
    private String message;

    public NotificationTemplate(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public abstract String applyTemplate();
    public abstract NotificationType notificationType();

}
