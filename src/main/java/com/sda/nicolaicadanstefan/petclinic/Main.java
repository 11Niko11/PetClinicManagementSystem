package com.sda.nicolaicadanstefan.petclinic;

import com.sda.nicolaicadanstefan.petclinic.controller.VetController;
import com.sda.nicolaicadanstefan.petclinic.repository.VetRepositoryImpl;
import com.sda.nicolaicadanstefan.petclinic.service.VetServiceImpl;
import com.sda.nicolaicadanstefan.petclinic.utils.SessionManager;
import com.sda.nicolaicadanstefan.petclinic.utils.UserOption;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SessionManager.getSessionFactory();
        VetController vetController = new VetController(new VetServiceImpl(new VetRepositoryImpl()));

        UserOption userOption;
        Scanner scanner = new Scanner(System.in);
        do{
            UserOption.displayAllOptions();
            System.out.println("Please select an option: ");
            int numericOption = scanner.nextInt();
            userOption = UserOption.findByNumericOption(numericOption);
            switch (userOption){
                case ADD_VET:
                    vetController.createVet();
                    break;
                case VIEW_ALL_VETS:
                    System.out.println("Not implemented!");
                    break;
                case UNKNOWN:
                    System.err.println("!INVALID OPTION SELECTED!");
                    break;
                case EXIT:
                    System.out.println("Bye!");
                    break;
            }
        }while (userOption != UserOption.EXIT);
        SessionManager.shutDown();
    }
}