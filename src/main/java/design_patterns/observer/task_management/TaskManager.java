package main.java.design_patterns.observer.task_management;

import main.java.design_patterns.observer.task_management.services.AppService;
import main.java.design_patterns.observer.task_management.services.EmailService;
import main.java.design_patterns.observer.task_management.services.SlackService;

public class TaskManager {

    private EmailService emailService = new EmailService();
    private SlackService slackService = new SlackService();
    private AppService appService = new AppService();


    public void assignTask(Long taskId, Long userId) {
        emailService.sendEmail(userId, taskId);
        slackService.sendSlack(userId, taskId);
        appService.sendPush(userId, taskId);

    }
}
