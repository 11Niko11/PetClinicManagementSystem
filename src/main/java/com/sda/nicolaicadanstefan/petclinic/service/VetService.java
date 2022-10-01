package com.sda.nicolaicadanstefan.petclinic.service;

import com.sda.nicolaicadanstefan.petclinic.model.Vet;

import java.util.List;

public interface VetService {
    void createVet(
            String firstNmae,
            String lastName,
            String address,
            String speciality
    );

    List<Vet> getAllVets();
}
