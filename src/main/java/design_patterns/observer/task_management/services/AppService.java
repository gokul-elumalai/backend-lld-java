package main.java.design_patterns.observer.task_management.services;

import main.java.design_patterns.observer.task_management.Observer;
import main.java.design_patterns.observer.task_management.utils.NotificationUtils;

public class AppService implements Observer {

    @Override
    public void notify(Long taskId, Long id) {
        String subject = "New task assigned";
        String message = "Task %s assigned to user %s";
        NotificationUtils.sendPush(subject, message.formatted(taskId, id));
    }

}