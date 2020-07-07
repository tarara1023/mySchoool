package myextras;

import java.util.Scanner;

public class Fibonacci {

    //Write a program to print Fibonacci series of n terms where n is input by user :
    //        0 1 1 2 3 5 8 13 24 .....

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int i = 1;
        int a = 0, b = 0, c = 1;


       for (i = 1; i <=n; i++) {
           a = b;
           b = c;
           c = a + b;
           System.out.println(a);



        }
//
//        System.out.print("Please enter a number: ");
//        int number = input.nextInt();
//        int fibonacci = 1;
//        int num1 = 1;
//        int sum = 0;
//        while (fibonacci < number) {
//            num1 = num1 + sum;//1..1+1 = 2
//            sum = sum + num1;//1 + 2 = 3
//            System.out.print(num1 + " " + sum);
//            fibonacci++;
//

        }
    }

