package sessions.swich_statments;

import java.util.Scanner;

public class NestedSwitch {

    public static void main(String[] args) {

        //What classes does a student need to take?
        //ask for the nth year?
        //for first year(freshman) printout (AdvancedEnglish and Algebra)
        //for second, third or 4th years
        //we have three majors. ask user to input the major
        //CS -> print out (CS Fundamentals, Java 1, Java 2)
        //ACC -> print out (Statistics, Excel)
        //BA -> print out (Marketing, Read some good books)

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the year you are on ");
        int year = input.nextInt();

        switch (year) {
            case 1:
                System.out.println("Freshmen curriculum:\n 1. Advance English \n 2. Algebra");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("Please enter your major ");
                input.nextLine();
                String major = input.next();
                switch (major.toUpperCase()) {
                    case "CS":
                        System.out.println("CS Fundamentals\nJava 1\nJava 2");
                        break;
                    case "ACC":
                        System.out.println("Statistics\nExcel");
                        break;
                    case "BA":
                        System.out.println("Marketing\nRead some good books");

                }
                break;
            default:
                if (year < 1)
                    System.out.println("Too early");
                else
                System.out.println("It's time to work");
        }

    }

}

