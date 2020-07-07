package homeworks.loops;

import java.util.Scanner;

public class AddingValues {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Number: ");
        int num = inp.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i ++) {
            System.out.print(i + " ");
            sum += i;

        }
        System.out.println("\nThe sum is: " + sum);
    }
}
