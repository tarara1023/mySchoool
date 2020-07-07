package sessions.if_then;

import java.util.Scanner;

public class CanISleep {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Is it weekday ?");

        boolean isWeekday = input.nextBoolean();

        System.out.println("Is it vacation?");

        boolean isVacation = input.nextBoolean();

        if (!isWeekday && isVacation) {
            System.out.println("Get up!");
        } else {
            System.out.println("You can sleep");

        }
    }

}
