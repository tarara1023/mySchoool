package myextras;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double fnum, snum, answer;
        System.out.println("Enter first num: ");
        fnum = scan.nextDouble();
        System.out.println("Enter second num: ");
        snum = scan.nextDouble();
        answer = fnum * snum;
        System.out.println(answer);
    }
}
