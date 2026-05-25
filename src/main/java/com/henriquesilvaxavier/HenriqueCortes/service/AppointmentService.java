package com.henriquesilvaxavier.HenriqueCortes.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.henriquesilvaxavier.HenriqueCortes.model.Appointment;
import com.henriquesilvaxavier.HenriqueCortes.service.singleton.BarberScheduler;

@Service
public class AppointmentService {

    private final BarberScheduler scheduler;

    public AppointmentService(BarberScheduler scheduler) {
        this.scheduler = scheduler;
    }

    public void save(Appointment appointment) {
        scheduler.add(appointment);
    }

    public List<Appointment> findAll() {
        return scheduler.getAppointments();
    }
}