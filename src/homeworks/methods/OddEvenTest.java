package homeworks.methods;

import java.util.Scanner;

public class OddEvenTest {

    public boolean isOdd (int number) {
        return number % 2 != 0;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        OddEvenTest myObject = new OddEvenTest();
        boolean toContinue;
          do {
        System.out.println("Enter a number ");
        int number = input.nextInt();


            if (myObject.isOdd(number))
                System.out.println(number + " is an odd number");
            else
                System.out.println(number + " is an even number");
            System.out.println("Would you want to try again?");
            toContinue = input.nextBoolean();
        }while (toContinue);

    }
}
