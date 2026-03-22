package com.codewithmosh.store.assignment_notificationFeature;

//@Service("sms")
public class SmsService implements NotificationService{

    @Override
    public void send(String message) {
        System.out.println("SMS sent: " + message);
    }
}
