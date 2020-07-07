package sessions.swich_statments;

import java.util.Scanner;

public class WeekdaysOrNot {

    public static void main(String[] args) {

        // Ask user to input an integer value that will represent
        //the day of the week.
        //ex: 1 - 7
        //Program should tell me if it's a weekday or a weekend

        Scanner input = new Scanner(System.in);

        System.out.println(" ENTER WEEK DAY NUMBER");

        int day = input.nextInt();

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("It is a weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Wrong day");
                break;


        }
    }
}
