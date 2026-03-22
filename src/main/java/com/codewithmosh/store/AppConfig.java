// The Bean of the classes in notification packaged is created and managed from here

package com.codewithmosh.store;

import com.codewithmosh.store.assignment_notificationFeature.EmailService;
import com.codewithmosh.store.assignment_notificationFeature.NotificationManager;
import com.codewithmosh.store.assignment_notificationFeature.NotificationService;
import com.codewithmosh.store.assignment_notificationFeature.SmsService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Value("${notification.gateway.option}")
    private String notificationGateway;

    @Bean
    public NotificationService sms(){
        return new SmsService();
    }

    @Bean
    public NotificationService email(){
        return new EmailService();
    }

    @Bean
    public NotificationManager notificationManager(){
        if (notificationGateway.equals("sms")){
            return new NotificationManager(sms());
        }
        return new NotificationManager(email());
    }
}
