package homeworks;

import java.util.Scanner;

public class GreatestNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number ");
        int num1 = input.nextInt();
        System.out.println("Enter second number");
        int num2 = input.nextInt();
        System.out.println("Enter third number");
        int num3 = input.nextInt();

        if (num1 > num2 && num1 > num3 ){
            System.out.println("The greatest number is "+ num1);
        }
        if (num2 > num1 && num2> num3) {
            System.out.println("The greatest number is "+ num2);
        }
        if (num3 > num1 && num3 >num2){
            System.out.println("The greatest number is "+ num3);
        }
        if (num3 == num2 && num2 == num1&& num1==num3){
            System.out.println("The greatest numbers are " + num1 + " " + num2 + " " + num3);
        }
        if (num1 == num2 && num2 > num3 ){
            System.out.println("The greatest numbers are " + num1 + " " + num2);
        }
        if (num1 == num3 && num2 < num3 ){
            System.out.println("The greatest numbers are " + num1 + " " + num3);
        }
        if (num2 == num3 && num2 > num1){
            System.out.println("The greatest numbers are " + num2 + " " + num3);
        }

    }
}
