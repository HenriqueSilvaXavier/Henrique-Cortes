package com.henriquesilvaxavier.HenriqueCortes.service.singleton;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.henriquesilvaxavier.HenriqueCortes.model.Appointment;

@Component
public class BarberScheduler {

    private final List<Appointment> appointments = new ArrayList<>();

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void add(Appointment appointment) {
        appointments.add(appointment);
    }
}