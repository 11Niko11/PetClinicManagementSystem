package com.sda.nicolaicadanstefan.petclinic.service;

import com.sda.nicolaicadanstefan.petclinic.model.Vet;

import java.util.List;
import java.util.Optional;

public interface VetService {
    void createVet(
            String firstNmae,
            String lastName,
            String address,
            String speciality
    );

    List<Vet> getAllVets();

    Optional<Vet> findById(int id);

    void updateVetById(
            int id,
            String firstname,
            String lastname,
            String address,
            String speciality
    );
}
