package com.henriquesilvaxavier.HenriqueCortes.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Appointment {

    private Long id;
    private String customerName;
    private String service;
    private LocalDate date;
    private LocalTime time;

    public Appointment() {}

    public Appointment(Long id, String customerName, String service,
                       LocalDate date, LocalTime time) {
        this.id = id;
        this.customerName = customerName;
        this.service = service;
        this.date = date;
        this.time = time;
    }

    public Long getId() {
        return id;
    }

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

    public void setId(Long id) {
        this.id = id;
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