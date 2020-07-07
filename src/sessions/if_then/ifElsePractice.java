package sessions.if_then;

// List Cars and car price

import java.util.Scanner;

//ask the user to enter car type. EX: SUV
//list all SUVs in the shop
// user can make selection of a certain suv by entering either th e number or the model
//print out price of the car
public class ifElsePractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your car type: \n -SUV \n -Sports Car \n -Luxury \n -Economy ");
        String carType = input.nextLine();
        String model = "";
        boolean isCustomerInterested = false;

        if (carType.equalsIgnoreCase("SUV")) {
            System.out.println(" 1. Suburban \n 2. MB G-Class \n 3. Range Rover Vogue");
            System.out.println("Please enter car model: ");
            model = input.nextLine();
            if(model.equalsIgnoreCase("Suburban") || model.equalsIgnoreCase("1"))
                System.out.println("Suburban price: 20K");

            else if (model.equalsIgnoreCase("MB G-Class") || model.equalsIgnoreCase("2"))
                System.out.println(" $80K");

            else if (model.equalsIgnoreCase("Range Rover Vogue") || model.equalsIgnoreCase("3"))
                System.out.println(" $40K ");


            else
                System.out.println("Invalid choice");

        }
        else if (carType.equalsIgnoreCase("Sports Car")) {
            System.out.println(" 1. Porsche 911 \n 2. Nissan GTR \n 3. Toyota Supra ");
            System.out.println("Please enter car model: ");
            model = input.nextLine();
            if(model.equalsIgnoreCase("Porsche 91") || model.equalsIgnoreCase("1")){
                System.out.println("Porsche 91 price: 200K");
                isCustomerInterested = true;
            }
            else if (model.equalsIgnoreCase("Nissan GTR") || model.equalsIgnoreCase("2")) {
                System.out.println("Nissan GTR $60K");
            }
            else if (model.equalsIgnoreCase("Toyota Supra") || model.equalsIgnoreCase("3")) {
                System.out.println("Toyota Supra $80K ");
            }
            else {
                System.out.println("Invalid choice");
            }
        }
        else if (carType.equalsIgnoreCase("Luxury")) {
            System.out.println(" 1. Rolls Royce \n 2. MB - S class \n 3. BMW 7 series");
            System.out.println("Please enter car model: ");
            model = input.nextLine();
            if(model.equalsIgnoreCase("Rolls Royce") || model.equalsIgnoreCase("1")){
                System.out.println("Rolls Royce: 200K");
            }
            else if (model.equalsIgnoreCase("MB - S class") || model.equalsIgnoreCase("2")) {
                System.out.println("MB - S class $150K");
            }
            else if (model.equalsIgnoreCase("BMW 7 series") || model.equalsIgnoreCase("3")) {
                System.out.println("BMW  $100K ");
            }
            else {
                System.out.println("Invalid choice");
            }

        }
        else if (carType.equalsIgnoreCase("Economy")) {
            System.out.println(" 1. Toyota Camry \n 2. Mazda 6 \n 3. Nissan Altima");

        }else {
            System.out.println("We don't have " + carType + " car type");
        }

        System.out.println(isCustomerInterested);


        int numOne = 4;
        System.out.println("Is " + numOne + " a even number? ");
        if (numOne%2 == 0) {
            System.out.println(numOne + " is even");
            System.out.println("It's divisible by 2 without any remainder");
        }


        //Do I want to see the forecast for right now?
        //if true than show
        //otherwise dont show anything

        System.out.println("Do you want to see the forecast for right now?");
        System.out.println("Please answer yes or no");
        boolean isShow = input.nextBoolean();





    }
}
