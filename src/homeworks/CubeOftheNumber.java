package homeworks;

import java.util.Scanner;

public class CubeOftheNumber {

    public static void main(String[] args) {
        System.out.println("Please enter a number of terms: ");
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println("Number is: " + i + " and cube of " + i + " is " + (int)Math.pow(i, 3));

        }
    }
}
