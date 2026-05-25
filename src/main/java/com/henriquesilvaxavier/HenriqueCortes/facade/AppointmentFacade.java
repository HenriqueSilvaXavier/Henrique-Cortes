package com.henriquesilvaxavier.HenriqueCortes.facade;

import java.util.Map;

import org.springframework.stereotype.Component;

import com.henriquesilvaxavier.HenriqueCortes.DTO.AppointmentRequest;
import com.henriquesilvaxavier.HenriqueCortes.model.Appointment;
import com.henriquesilvaxavier.HenriqueCortes.service.AppointmentService;
import com.henriquesilvaxavier.HenriqueCortes.service.notification.NotificationStrategy;

@Component
public class AppointmentFacade {

    private final AppointmentService service;
    private final Map<String, NotificationStrategy> strategies;

    public AppointmentFacade(
            AppointmentService service,
            Map<String, NotificationStrategy> strategies) {

        this.service = service;
        this.strategies = strategies;
    }

    public void create(AppointmentRequest request, String notificationType) {

        Appointment appointment = new Appointment(
                System.currentTimeMillis(),
                request.getCustomerName(),
                request.getService(),
                request.getDate(),
                request.getTime()
        );

        service.save(appointment);

        NotificationStrategy strategy =
                strategies.get(notificationType);

        if (strategy != null) {
            strategy.send(request.getCustomerName());
        }
    }
}