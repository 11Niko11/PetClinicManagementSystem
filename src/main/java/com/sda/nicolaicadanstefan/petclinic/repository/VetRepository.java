package com.sda.nicolaicadanstefan.petclinic.repository;

import com.sda.nicolaicadanstefan.petclinic.model.Vet;

import java.util.List;

public interface VetRepository {
    void createVet(
            String firstNmae,
            String lastName,
            String address,
            String speciality
    );
    List<Vet> getAllVets();
}
