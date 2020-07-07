package homeworks;

import java.util.Scanner;

public class IfConditionMedium {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please input three numbers: ");
        int firstNum = input.nextInt();
        int secondNum = input.nextInt();
        int thirdNum = input.nextInt();

        if (firstNum + secondNum == thirdNum) {
            System.out.println("The result is: true");
        } else {
            System.out.println("The result is: false");
        }
    }
}
