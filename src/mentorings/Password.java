package mentorings;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        String correctPassword = "Mentoring";
        String userPassword;

        do {
            System.out.println("Please enter password: ");
            userPassword = input.nextLine();
            if (!userPassword.equals(correctPassword))
                System.out.println("Try again");



        }while (!userPassword.equals(correctPassword));

        System.out.println("correct");
    }

}
