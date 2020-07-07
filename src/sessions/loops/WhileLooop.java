package sessions.loops;

import java.util.Scanner;

public class WhileLooop {

    public static void main(String[] args) {

        int numOfHello = 10;
        int loopCount = 0;

        while (loopCount < numOfHello) {
            System.out.println("Hello");
            loopCount++;
        }

        //Count the sum of numbers starting from 1 till 12

        int loopCount1 = 1;
        int num1 = 12;
        int result = 0;
        while (loopCount1 <= num1) {
            result += loopCount1;
            System.out.println(result);
            loopCount1++;

        }
        System.out.println(result);


        //Write a program to enter test results.
        //user should define if he wants to enter another test results


        String answer = "yes";
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int numOfTest = 0;


        while (answer.equalsIgnoreCase("yes")) {

            System.out.println("Please enter test result");
            int testScore = sc.nextInt();
            sum += testScore;
            numOfTest++;
            System.out.println("Do you want to enter another test result");
            answer = sc.next();

        }
        System.out.println(sum/numOfTest);
    }

}
