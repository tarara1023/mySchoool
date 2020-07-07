package sessions.swich_statments;

import java.util.Scanner;

public class TestApplication {

    public static void main(String[] args) {

        //Printout a question
        //print out 4 answers
        // ex: What is the cutoff for air pollution?
        //a) 1.2
        //b) 2.2
        //c) 3.5 => correct answer
        //d) 0
        //user input(choice)
        //c => correct answer
        System.out.println("What is the cutoff for air pollution?");
        System.out.println("a) 1.2");
        System.out.println("b) 2.2");
        System.out.println("c) 3.5");
        System.out.println("d) 0");

        Scanner input = new Scanner(System.in);

        char answer = input.next().charAt(0);

        switch (answer) {
            case 'a':
            case 'A':
            case 'B':
            case 'b':
            case 'd':
            case 'D':
                System.err.println("Wrong answer");
                break;
            case 'C':
            case 'c':
                System.out.println("Correct");
                break;
            default:
                System.out.println("Invalid input");

        }


    }
}
