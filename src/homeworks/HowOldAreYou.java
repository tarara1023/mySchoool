package homeworks;

import java.util.Scanner;

public class HowOldAreYou {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = input.next();
        System.out.println("Please enter your age ");
        int age = input.nextInt();

        if (age < 16)
            System.out.println("You can't drive, " + name);
        if (age >= 16 && age <=17)
            System.out.println("You can drive but not vote, " + name);
        if (age >= 18 && age <= 24)
            System.out.println("You can vote but not rent a car, " + name);
        if (age >= 25)
            System.out.println("You can do pretty much anything, " + name);

    }
}
