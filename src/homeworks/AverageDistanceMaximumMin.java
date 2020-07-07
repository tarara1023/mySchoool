package homeworks;

import java.util.Scanner;

public class AverageDistanceMaximumMin {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();

        int num2 = input.nextInt();

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double average = (double)(num1 + num2) / 2;
        double distance = Math.abs(num1 - num2);
        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);

        System.out.println("Sum of two integers: " + sum);
        System.out.println("Difference of two integers: " + difference);
        System.out.println("Product of two integers: " + product);
        System.out.println("Average of two integers: " + average);
        System.out.println("Distance of two integers: " + distance);
        System.out.println("Max integer: " + max);
        System.out.println("Min integer: " + min);




    }

}
