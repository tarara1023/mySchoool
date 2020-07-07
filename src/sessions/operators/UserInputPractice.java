package sessions.operators;


import java.util.Scanner;

public class UserInputPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a  price: ");

        //it will wait for the user to give a double value
        double num1 = input.nextDouble();

        System.out.println("Number Entered: " + num1);

        System.out.println("Please Enter Your Full Name....");
        String name = input.next();
        System.out.print("Your First Name: " + name);
        String lastName = input.next();
        System.out.println("Your Last Name: " + lastName);

        System.out.println("Enter a gender: ");
        char gender = input.next().charAt(0);
        System.out.println("Your gender is: " + gender);

        System.out.println("Enter your full name: ");
        input.nextLine();
        String fullName = input.nextLine();

        System.out.println("Full Name: " + fullName);




    }
}


