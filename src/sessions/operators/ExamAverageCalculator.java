package sessions.operators;

import java.util.Scanner;

public class ExamAverageCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);


        System.out.println("Please enter first number: ");
        int exam1 = input.nextInt();

        System.out.println("Please enter second number: ");
        int exam2 = input.nextInt();

        System.out.println("Please enter third number: ");
        int exam3 = input.nextInt();

        double average = (double)(exam1 + exam2 + exam3) / 3;

        System.out.println("Your average score: " + average);
    }
}
