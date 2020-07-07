package sessions.if_then;

import java.util.Scanner;

public class FirstIfThenClass {

    public static void main(String[] args) {

        //Write a program which will tell me if i passed the exam
        //passing score is 70


        Scanner input = new Scanner(System.in);
        System.out.println("What is your exam score? ");
        double score = input.nextDouble();

        if(score >= 70) {

            System.out.println("Great! You passed the exam!");
        }
        if (score < 70) {
            System.out.println("Try again! Keep working hard!");

        }

        //Tell me if the temperature outside is too hot
        //print out "Too hot" the temp is hotter the 80F
        //Turn on your AC
        System.out.println("What is temperature outside?");
        double temp = input.nextDouble();

        if(temp >= 80) {
            System.out.println("\"Too Hot\"");
            System.out.println("Turn on your AC");
        }
        if(temp <= 30) {
            System.out.println("Freaking Cold Chicago!");
        }
        if (temp < 80 && temp >30) {
            System.out.println("Good weather outside");

        }

        //
        System.out.println("What is the current hour?");
        int currentHour = input.nextInt();

        if(currentHour < 11)
            System.out.println("Good Morning!");
            System.out.println("Go Knockout some goals");


    }
}
