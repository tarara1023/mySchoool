package myextras.practice;

import java.util.Scanner;

public class Practice1 {

    public static void main(String[] args) {
        boolean isContinue;
        String yesOrNo = "";
        int counterPositive = 0;
        int counterNegative = 0;
        int counter0 = 0;

        do {
            System.out.println("Enter a number:" );
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            System.out.println("Do you want to continue?:");
            yesOrNo = input.next();
            if (yesOrNo.equals("yes")) {
                isContinue = true;
            }else {
                isContinue = false;
            }

            if (num > 0)
                counterPositive++;
            else if (num < 0)
                counterNegative++;
            else
                counter0++;



        }while (isContinue);
        System.out.println("Positive numbers: " + counterPositive);
        System.out.println("Negative numbers: " + counterNegative);
        System.out.println("Zero numbers: " + counter0);

    }




}
