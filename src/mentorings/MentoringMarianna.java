package mentorings;

import java.util.Scanner;

public class MentoringMarianna {

    public static void main(String[] args) {


        int a = 5;
        int b = 5;

        boolean check = (a == b);


        System.out.println (check);

    }

}

class Mentoring {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter hr  ");
        int hr = input.nextInt();

        System.out.println("Please enter min  ");
        int min = input.nextInt();

        System.out.println("Please enter sec  ");
        int sec = input.nextInt();

        System.out.println(hr + ":" + min + ":" + sec + " AM");
    }

}
class MenA {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter change ...");
        int change = input.nextInt(); // 89

        int quarters, dimes, nickels, pennies, changeLeft;

        quarters = change / 25; // 3
        changeLeft = change % 25; //14
        dimes = changeLeft / 10; // 1
        changeLeft %= 10; // 4
        nickels = changeLeft / 5; // 0
        pennies = changeLeft % 5; // 4

        System.out.println("Your change of " + change + " was converted to ");
        System.out.println("Quarters " + quarters);
        System.out.println("Dimes " + dimes);
        System.out.println("Nickels " + nickels);
        System.out.println("Pennies " + pennies);











    }
}


