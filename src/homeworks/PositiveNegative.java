package homeworks;

import java.util.Scanner;

public class PositiveNegative {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number ");

        int num = input.nextInt();

        if (num >= 0) {
            System.out.println("Number is positive");
        }else {
            System.out.println("Number is negative");
        }

    }


}
class InputNumbers {
    public static void main(String[] args) {
        Scanner input2 = new Scanner(System.in);

        System.out.println("Please enter two numbers: ");

        int num1 = input2.nextInt();
        int num2 = input2.nextInt();

        int greatest = Math.max(num1, num2);

        System.out.println("The greatest number is " + greatest);




    }
}
