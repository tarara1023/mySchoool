package mentorings;

import java.util.Scanner;

public class IfBasic {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter num ");

        int num1 = input.nextInt();

        if(num1 < 10) { // logical statement is a statement that evaluates
                        //to true or false
            System.out.println("Less than 10");
        }else {
            System.out.println("More than 10");

            // %

            System.out.println("Please enter any number...");
            int numb = input.nextInt();

            int answer = numb%2;
            if (answer == 1) {
                System.out.println("Your number is odd..");
            }else{
                System.out.println("Your number is even");
            }

            int i = 11;
            if ( !(i / 10 == 0)) { // ! true to false or i /10
                System.out.println("MORE than 1 digit");
            }




        }
    }
}

