package com.henriquesilvaxavier.HenriqueCortes.DTO;

import java.time.LocalDate;
import java.time.LocalTime;

public class AppointmentRequest {

    private String customerName;
    private String service;
    private LocalDate date;
    private LocalTime time;

    public String getCustomerName() {
        return customerName;
    }

    public String getService() {
        return service;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setService(String service) {
        this.service = service;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }
}
