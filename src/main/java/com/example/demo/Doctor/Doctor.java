package com.example.demo.Doctor;

import java.time.LocalDate;

public class Doctor {
    private int id;
    private String name;
    private LocalDate dateOfBirth;
    private String email;
    private char sex;

    public Doctor() {
    }
    public Doctor(int id, String name, LocalDate dateOfBirth, String email, char sex) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.sex = sex;
    }
    public Doctor(String name, LocalDate dateOfBirth, String email, char sex) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.sex = sex;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
