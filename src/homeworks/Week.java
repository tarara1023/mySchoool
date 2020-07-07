package homeworks;

import java.util.Scanner;

public class Week {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter number: ");
        int numberDay = input.nextInt();

        if (numberDay == 1) {
            System.out.println("Monday");
        }
        else if (numberDay == 2) {
            System.out.println("Tuesday");
        }
        else if (numberDay == 3) {
            System.out.println("Wednesday");
        }
        else if (numberDay == 4) {
            System.out.println("Thursday");
        }
        else if (numberDay == 5) {
            System.out.println("Friday");
        }
        else if (numberDay == 6) {
            System.out.println("Saturday");
        }
        else if (numberDay == 7) {
            System.out.println("Sunday");
        }else{
            System.out.println("Please enter a number between 1-7");
        }
    }
}

class WeekSwitch {

    public static void main(String[] args) {
        Scanner input2 = new Scanner(System.in);
        System.out.println("Please enter number: ");

        int numberDay2 = input2.nextInt();

        switch (numberDay2) {
            case 1:
                System.out.println("Monday");
                break; // we have no reason to go to rest of program if case 1
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Please enter number between 1-7 ");
                break;


        }
    }


}
