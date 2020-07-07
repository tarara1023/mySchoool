package mentorings;

import java.util.Scanner;

public class IfElse {

//    Assignments 1:
//    Write a Java program that accepts three numbers and prints “All numbers are equal” if all three numbers are equal, “All numbers are different” if all three numbers are different and “Neither all are equal or different” otherwise.
//    Test Data 1
//    Input first number: 1
//    Input second number: 2
//    Input third number: 3
//    OUTPUT: All numbers are different
//    Test Data 2
//    Input first number: 1
//    Input second number: 1
//    Input third number: 3
//    OUTPUT: Neither all are equal or different
//    Test Data 3
//    Input first number: 1
//    Input second number: 1
//    Input third number: 1
//    OUTPUT: All numbers are equal

    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number ");
        int num1 = input.nextInt();
        System.out.println("Enter first number ");
        int num2 = input.nextInt();
        System.out.println("Enter first number ");
        int num3 = input.nextInt();

        if (num1 != num2 && num2 != num3 && num1 != num3) {
            System.out.println("All numbers are different");
        }else if (num1 == num2 && num2 == num3 && num1 == num3) {
            System.out.println("All numbers are equal");
        }else  {
            System.out.println("Neither all are equal or different");
        }

    }
}
class IncrementingDecrementing {

    public static void main(String[] args) {

//        Assignments 2:
//        Write a program that accepts three numbers from the user and prints “
//        increasing” if the numbers are in increasing order,
//        “decreasing” if the numbers are in decreasing order,
//        and “Neither increasing or decreasing order” otherwise.
//                Test Data;
//        Input first number: 1
//        Input second number: 2
//        Input third number: 3
//        Expected Output :
//        Increasing order

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number ");
        int num1 = input.nextInt();
        System.out.println("Enter first number ");
        int num2 = input.nextInt();
        System.out.println("Enter first number ");
        int num3 = input.nextInt();

        if (num1 < num2 && num2 < num3) {
            System.out.println("increasing order");
        }else if (num1 > num2 && num2 > num3) {
            System.out.println("decreasing order");
        }else {
            System.out.println("Neither increasing or decreasing order” otherwise.");
        }
    }
}