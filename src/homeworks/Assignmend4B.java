package homeworks;

import java.util.Scanner;

public class Assignmend4B {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter number: ");

        int number = input.nextInt();
        int firstDigit = number / 10;
        int secondDigit = number % 10;
        int sum = firstDigit + secondDigit;

        System.out.println("The sum of the digits is: " + sum);
    }
}
