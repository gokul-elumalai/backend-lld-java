package main.java.design_patterns.observer.task_management.services;

import main.java.design_patterns.observer.task_management.utils.NotificationUtils;

public class AppService {
    public void sendPush(Long id, Long taskId) {
        String subject = "New task assigned";
        String message = "Task %s assigned to user %s";
        NotificationUtils.sendPush(subject, String.format(message, taskId, id));
    }
}