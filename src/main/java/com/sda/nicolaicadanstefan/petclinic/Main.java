package com.sda.nicolaicadanstefan.petclinic;

import com.sda.nicolaicadanstefan.petclinic.controller.VetController;
import com.sda.nicolaicadanstefan.petclinic.repository.VetRepositoryImpl;
import com.sda.nicolaicadanstefan.petclinic.service.VetServiceImpl;

public class Main {
    public static void main(String[] args) {
        VetController vetController = new VetController(new VetServiceImpl(new VetRepositoryImpl()));
        vetController.createVet();
    }
}