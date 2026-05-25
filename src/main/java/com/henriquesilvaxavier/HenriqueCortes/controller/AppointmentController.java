package com.henriquesilvaxavier.HenriqueCortes.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.henriquesilvaxavier.HenriqueCortes.DTO.AppointmentRequest;
import com.henriquesilvaxavier.HenriqueCortes.DTO.AppointmentResponse;
import com.henriquesilvaxavier.HenriqueCortes.facade.AppointmentFacade;
import com.henriquesilvaxavier.HenriqueCortes.model.Appointment;
import com.henriquesilvaxavier.HenriqueCortes.service.AppointmentService;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {

    private final AppointmentFacade facade;
    private final AppointmentService service;

    public AppointmentController(
            AppointmentFacade facade,
            AppointmentService service) {

        this.facade = facade;
        this.service = service;
    }

    @PostMapping
    public AppointmentResponse create(
            @RequestBody AppointmentRequest request,
            @RequestParam(defaultValue = "email")
            String notification) {

        facade.create(request, notification);

        return new AppointmentResponse(
                "Agendamento criado com sucesso"
        );
    }

    @GetMapping
    public List<Appointment> list() {
        return service.findAll();
    }
}