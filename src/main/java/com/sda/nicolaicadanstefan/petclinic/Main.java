package com.sda.nicolaicadanstefan.petclinic;

import com.sda.nicolaicadanstefan.petclinic.utils.SessionManager;

public class Main {
    public static void main(String[] args) {
        SessionManager.getSessionFactory();
        SessionManager.shutDown();
    }
}