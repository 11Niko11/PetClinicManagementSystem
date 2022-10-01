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
            try {
                UserOption.displayAllOptions();
                System.out.println("Please select an option: ");
                int numericOption = Integer.parseInt(scanner.nextLine().trim());
                userOption = UserOption.findByNumericOption(numericOption);
            }catch (NumberFormatException e){
                userOption = UserOption.UNKNOWN;
            }
            switch (userOption){
                case ADD_VET:
                    vetController.createVet();
                    break;
                case VIEW_ALL_VETS:
                    vetController.showAllVets();
                    break;
                case VIEW_VET_BY_ID:
                    vetController.showVetById();
                    break;
                case UPDATE_VET_BY_ID:
                    vetController.updateVetById();
                    break;
                case DELETE_VET_BY_ID:
                    vetController.deleteVetById();
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