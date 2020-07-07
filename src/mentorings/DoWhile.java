package mentorings;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        //Write a program to enter the numbers till the
        // user wants and at the end the program
        // should display the largest and smallest numbers entered.
        int num;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        char choise;
        do {
            System.out.println("Enter a number: ");
            Scanner inp = new Scanner(System.in);
            num = inp.nextInt();
            if (num > max)
                max = num;
            if (num < min)
                min = num;


            System.out.println("Do you want add number? ");
            choise = inp.next().charAt(0);



        }while (choise == 'y' || choise == 'Y');
        System.out.println(max);
        System.out.println(min);
    }
}
