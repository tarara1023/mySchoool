package sessions.swich_statments;

import java.util.Scanner;

public class SwitchIntro {

    public static void main(String[] args) {

        //Will have a list of animals.
        //User will input some animal //dog cat tiger bear
        //Program will tell me if it's a domestic animal
        //or wild animal

        Scanner input = new Scanner(System.in);
        System.out.println("Enter animal: ");
        String animal = input.next();

//        if (animal.equalsIgnoreCase("DOG") || animal.equalsIgnoreCase("CAT")) {
//            System.out.println("It is domestic animal");
//        } else if (animal.equalsIgnoreCase("Bear") || animal.equalsIgnoreCase("tiger")) {
//            System.out.println("Wild Animal");
//        } else {
//            System.out.println("Unknown Animal");
//        }
                //only variable
        switch (animal.toLowerCase()) { // converting the whole String to LowerCases. if input  WAS DOG  at this line its dog
            case "dog":
                System.out.println("It is domestic animal");
                break;
            case "cat":
                System.out.println("It is domestic animal");
                break;
            case "tiger":
                System.out.println("Wild animal");
                break;
            case "bear":
                System.out.println("Wild animal");
                break;
            default:
                System.out.println("unknown animal");
                break;

        }
//        String favAnimal = "Tiger";
//        System.out.println("Fav animal: " + favAnimal.toUpperCase());
//        System.out.println("Fav animal: " + favAnimal.toLowerCase());


        //rewrite the above example to simplify

        final String chicken = "chicken"; //we can use this variable only because its final
        final String hippo = "Hippopotamus";
        switch(animal.toLowerCase()) {

            case "dog":
            case "cat":
            case "mouse":
            case chicken:
                System.out.println("domestic animal");
                break;
            case "bear":
            case "tiger":
            case "leopard":
            case hippo:
                System.out.println("wild animal");
                break;
            default:
                System.out.println("unknown animal");
        }


    }


}
