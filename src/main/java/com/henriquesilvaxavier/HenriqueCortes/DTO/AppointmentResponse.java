package com.henriquesilvaxavier.HenriqueCortes.DTO;

public class AppointmentResponse {

    private String message;

    public AppointmentResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}