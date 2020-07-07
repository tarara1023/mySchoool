package homeworks.methods;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Numbers calculation = new Numbers();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int num1 = input.nextInt();
        System.out.println("Enter second integer: ");
        int num2 = input.nextInt();
        calculation.add2Integers(num1, num2);

    }

    public void add2Integers (int num1, int num2) {

        System.out.println("The sum is: " + (num1 + num2));
    }
}
