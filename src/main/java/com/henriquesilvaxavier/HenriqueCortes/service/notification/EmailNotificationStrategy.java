package com.henriquesilvaxavier.HenriqueCortes.service.notification;

import org.springframework.stereotype.Component;

@Component("email")
public class EmailNotificationStrategy implements NotificationStrategy {

    @Override
    public void send(String customerName) {
        System.out.println("Email enviado para " + customerName);
    }
}