package com.codewithmosh.store.assignment_notificationFeature;

//@Service("email")
//@Primary
public class EmailService implements NotificationService{
    @Override
    public void send(String message) {
        System.out.println("Email Sent: " + message);
    }
}
