package sessions.classes_objects;

import java.util.Scanner;

/*
*this class is responsible for creating animal
* and adding to the stock
 */
public class EmployeeAnimalCreateService {

    //get info for the animal and create animal object
    //and return this animal

    public static Animal createAnimal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter animal type?");
        String type = sc.nextLine();

        System.out.println("Enter" + type + "breed");
        String breed = sc.nextLine();

        System.out.println("Enter age");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter duration");
        int duration = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter gender(F/M)");
        char gender = sc.nextLine().charAt(0);
        System.out.println("Enter weight");
        double weight = sc.nextDouble();
        sc.nextLine();
        System.out.println("Is animal injured(true/false)");
        boolean isInjured = sc.nextBoolean();

        Animal animal  = new Animal(type, breed, age, duration, gender, weight, isInjured);

        return animal;
    }
    public static Animal withoutDuration() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter animal type?");
        String type = sc.nextLine();

        System.out.println("Enter" + type + "breed");
        String breed = sc.nextLine();

        System.out.println("Enter age");
        int age = sc.nextInt();

        System.out.println("Enter gender(F/M)");
        char gender = sc.next().charAt(0);
        sc.nextLine();
        System.out.println("Is animal injured(true/false)");
        boolean isInjured = sc.nextBoolean();

        Animal animal  = new Animal(type, breed, age, gender, isInjured);

        return animal;
    }
    public static Animal createAnimalTypeBreedGender() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter animal type?");
        String type = sc.nextLine();

        System.out.println("Enter" + type + "breed");
        String breed = sc.nextLine();

        System.out.println("Enter gender(F/M)");
        char gender = sc.next().charAt(0);
        sc.nextLine();

        Animal animal  = new Animal(type, breed, gender);

        return animal;
    }
}
