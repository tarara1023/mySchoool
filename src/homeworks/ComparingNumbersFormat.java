package homeworks;

import java.util.Scanner;

public class ComparingNumbersFormat {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int first = input.nextInt();
        int second = input.nextInt();

        if (first == second)
            System.out.printf( "%d == %d\n", first, second);
        if (first >= second)
            System.out.printf("%d >= %d\n", first, second);
        if (first <= second)
            System.out.printf("%d <= %d\n", first, second);
        if (first != second)
            System.out.printf("%d != %d\n", first, second);



    }
}
class ComparingNumbersRegular {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " > " + num2);
            System.out.println("The first number is greater");
        }
        else if (num1 < num2) {
            System.out.println(num1 + " < " + num2);
            System.out.println("The first number is smaller");
        }
        else if (num1 == num2) {
            System.out.println(num1 + " = " + num2);
            System.out.println("The numbers are equal");
        }

    }
}
