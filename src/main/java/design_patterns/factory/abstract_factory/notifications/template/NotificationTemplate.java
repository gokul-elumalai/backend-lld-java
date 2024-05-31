package main.java.design_patterns.factory.abstract_factory.notifications.template;

import main.java.design_patterns.factory.abstract_factory.notifications.NotificationType;

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
