package com.example.demo.Doctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/doctor")


public class DoctorController {

    private final DoctorService DoctorService;

    @Autowired
    public DoctorController(com.example.demo.Doctor.DoctorService doctorService) {
        DoctorService = doctorService;
    }


    @GetMapping
    public List<Doctor> getDoctor() {
        return DoctorService.getDoctor();
    }
}
