package com.codewithmosh.store.assignment_notificationFeature;

//@Service
public class NotificationManager {

    private final NotificationService notificationService;

    public NotificationManager(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void sendNotification(String message){
        notificationService.send(message);
    }
}
