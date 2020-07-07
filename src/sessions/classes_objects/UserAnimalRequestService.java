package sessions.classes_objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserAnimalRequestService {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Animal> stock = new ArrayList<>();
        //1.Call employee method to create animals
        //add animal to list of animals
        //do above until user says done
        String answer = "";
        System.out.println("DO you have duration and weight");
        String answer2 = sc.next();
        do {
            if(!answer2.equalsIgnoreCase("yes")) {
                System.out.println("Do you have age and injury info?");
                String answ2er = sc.next();
                if (answ2er.equalsIgnoreCase("yes")) {
                    Animal animal = EmployeeAnimalCreateService.withoutDuration();
                    stock.add(animal);
                }else {
                    Animal animal = EmployeeAnimalCreateService.createAnimalTypeBreedGender();
                    stock.add(animal);
                }
            }else {
                Animal animal = EmployeeAnimalCreateService.createAnimal();
                stock.add(animal);
            }
            System.out.println("Ar you done?");
            answer = sc.next();
        }while (!answer.equalsIgnoreCase("done"));
        //2.Ask user to input what they are looking for
        //a. animal type
        //b.animal breed
        //c.gender
        sc.nextLine();
        System.out.println("//////////////////");
        System.out.println("User App");
        System.out.println("//////////////////");

        System.out.println("Enter animal type");
        String type = sc.next();

        System.out.println("ENter " + type + "breed");
        String breed = sc.next();
        System.out.println("Enter gender");

        char gender = sc.next().charAt(0);



        for (Animal animal: stock) {
            if(animal.getType().equalsIgnoreCase(type) && animal.getBreed().equalsIgnoreCase(breed) && animal.getGender() == gender)
                System.out.println(animal);
        }



        //Print out all animals info that match the request


    }
}
