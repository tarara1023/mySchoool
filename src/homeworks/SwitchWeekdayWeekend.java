package homeworks;

import java.util.Scanner;

public class SwitchWeekdayWeekend {
    public static void main(String[] args) {
        Scanner input2 = new Scanner(System.in);
        System.out.println("Please enter day: ");

        String day = input2.nextLine();

        switch (day.toLowerCase()) {
            case "1":
            case "monday":
            case "2":
            case "tuesday":
            case "3":
            case "wednesday":
            case "4":
            case "thursday":
            case "5":
            case "friday":
                System.out.println("Week Day");
                break;
            case "6":
            case "saturday":
            case "7":
            case "sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Wrong number or day ");
                break;

        }

    }

}