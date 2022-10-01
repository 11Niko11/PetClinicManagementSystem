package com.sda.nicolaicadanstefan.petclinic.service;

public interface VetService {
    void createVet(
            String firstNmae,
            String lastName,
            String address,
            String speciality
    );
}
