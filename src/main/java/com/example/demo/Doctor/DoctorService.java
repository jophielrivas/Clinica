package com.example.demo.Doctor;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class DoctorService {
    public List<Doctor> getDoctor() {
        return List.of( new Doctor(1,
                        "Bryan Vargas",
                        LocalDate.of(2000, Month.APRIL, 16),
                        "yayan@gmail.com",
                        'm'
                )
        );
    }
}
