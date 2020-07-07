package homeworks;

import java.util.Scanner;

public class Assignment4A {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double radius = input.nextDouble();
        double perimeter = 2 * radius * 3.14159265359;
        double area = 3.14159265359 * radius * radius;

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);

    }
}
