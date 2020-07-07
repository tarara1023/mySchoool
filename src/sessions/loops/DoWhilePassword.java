package sessions.loops;

import java.util.Scanner;

public class DoWhilePassword {

    public static void main(String[] args) {

        //there is a chance that while loop wont run at all
        boolean run = false;
        while (run) {
            System.out.println("Run forest run"); //not gonna fun
        }

        boolean run1 = false;
        do {
            System.out.println("Run Forest Run [Do While]");

        }
        while (run1);

        int counterForLoop = 1;
        do {
            System.out.println("SDET" + counterForLoop);
            counterForLoop++;
        } while (counterForLoop <= 10); //


        //print out "Study" infinite time

        int i = 10;

        while (i > 0) {
            System.out.println("Study");
            i--;
        }
        //only difference between while and do while that do while runs the body
        //at least once no matter where
        //if the password id right it will log you in

        //please enter your password;

        int expectedPassword = 1234;
        Scanner inp = new Scanner(System.in);
        int pasword = 0;
        int count = 0;
        do {
            System.out.println("Enter  a password");
            pasword = inp.nextInt(); //update statement;
            if (expectedPassword != pasword) {
                if (count >= 2)
                    System.out.println("Your account is blocked");
            } else {
                System.out.println("You successfully logged in");
            }
            count++;


    }
            while(expectedPassword !=pasword &&count<3);


    }
}