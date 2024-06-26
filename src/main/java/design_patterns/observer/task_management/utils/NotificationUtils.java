package main.java.design_patterns.observer.task_management.utils;

public class NotificationUtils {
    public static void sendEmail(String subject, String content) {
        System.out.println("Send email to " + subject + " with content " + content);
    }

    public static void sendSlack(String subject, String content) {
        System.out.println("Send email to " + subject + " with content " + content);
    }

    public static void sendPush(String subject, String content) {
        System.out.println("Send email to " + subject + " with content " + content);
    }
}
