package homeworks;

import java.util.Scanner;

public class Swap2Integers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1, number2, number3;
        System.out.println("Enter first integer: ");
         number1 = input.nextInt();
        System.out.println("Enter second integer: ");
         number2 = input.nextInt();

         number3 = number1;
         number1 = number2;
         number2 = number3;

        System.out.println("After the swap, first integer is: " + number1 + " the second integer is " + number2);




    }
}
