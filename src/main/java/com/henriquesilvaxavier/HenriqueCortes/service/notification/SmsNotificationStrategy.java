package com.henriquesilvaxavier.HenriqueCortes.service.notification;

import org.springframework.stereotype.Component;

@Component("sms")
public class SmsNotificationStrategy implements NotificationStrategy {

    @Override
    public void send(String customerName) {
        System.out.println("SMS enviado para " + customerName);
    }
}