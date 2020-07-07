package homeworks;

import java.util.Scanner;

public class InputsFromUser {

    public static void main(String[] args) {
        int n = 0;
        int sum = 0;
        double avg = 0;
        int i = 0;

        System.out.println("Input the 5 numbers: ");

        for (i = 1; i <=5; i++) {
            Scanner in = new Scanner(System.in);
            n = in.nextInt();

            sum += n;
            avg = (double)sum/i;

        }

        System.out.println("The sum of 5 numbers: " + sum);
        System.out.println("The average is: " + avg);
    }
}
