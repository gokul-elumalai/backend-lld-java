package main.java.design_patterns.observer.task_management.services;

import main.java.design_patterns.observer.task_management.utils.NotificationUtils;

public class EmailService {
    public void sendEmail(Long id, Long taskId) {
        String subject = "New task assigned";
        String message = "Task %s assigned to user %s";
        NotificationUtils.sendEmail(subject, String.format(message, taskId, id));
    }
}
