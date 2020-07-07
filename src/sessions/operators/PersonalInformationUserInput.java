package sessions.operators;

import java.util.Scanner;

public class PersonalInformationUserInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter following information");
        System.out.println("First Name: ");
        String firstName = input.next();
        System.out.println("Last Name: ");
        String LastName = input.next();

        System.out.println("Gender: ");
        char gender = input.next().charAt(0);

        System.out.println("First Name " + firstName);
        System.out.println("Last Name : " + LastName);
        System.out.println("Gender " + gender);



    }
}
