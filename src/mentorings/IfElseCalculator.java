package mentorings;

import java.util.Scanner;

public class IfElseCalculator {

    public static void main(String [] args) {

        double fNum, sNum, result;
        char operator;

        Scanner input = new Scanner(System.in);

        System.out.println("1st number: ");

        fNum = input.nextDouble();

        System.out.println("Operator: ");
        operator = input.next().charAt(0);
        System.out.println("2nd number: ");
        sNum = input.nextDouble();

        // if-else
        if (operator == '+') {
            result = Double.sum(fNum, sNum);
        } else if (operator == '-') {
            result = fNum - sNum;

        } else if (operator == '*') {
            result = fNum * sNum;

        } else if (operator == '/' && sNum != 0) {
            result = fNum / sNum;
        } else if (operator == '/' && sNum == 0) {

            System.out.println("Cant divide by 0");
            return;
        } else if (operator == '%') {
            System.out.println("Invalid input");
            return;
        }


     ;


    }
}
