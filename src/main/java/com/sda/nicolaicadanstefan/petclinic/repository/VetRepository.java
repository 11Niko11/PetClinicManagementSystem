package com.sda.nicolaicadanstefan.petclinic.repository;

public interface VetRepository {
    void createVet(
            String firstNmae,
            String lastName,
            String address,
            String speciality
    );
}
