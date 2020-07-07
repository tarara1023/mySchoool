package homeworks.loops;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        System.out.println("Please enter number of terms: ");
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();

        for (int i = 0; i <= num; i++) {

            System.out.println(num + " X " + i + " = " + num * i);
        }
    }
}
