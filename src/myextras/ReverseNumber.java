package myextras;

import java.util.Scanner;

public class ReverseNumber {
    //Write a program that prompts the user to input
    // an integer and then outputs the number with the digits reversed.
    // For example, if the input is 12345, the output should be 54321

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int result = 0;

        int temp = num;


        while (num > 0) {


            result = result * 10 + num % 10;//6
            num = num / 10;
            System.out.print(result);
            System.out.println("\n");





        }
        System.out.print(result);

    }

}
