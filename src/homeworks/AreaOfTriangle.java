package homeworks;

import java.util.Scanner;

public class AreaOfTriangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter width of the Triangle: ");
        int width = input.nextInt();
        System.out.println("Please enter height of the Triangle: ");
        int height = input.nextInt();

        double area = (double)(width * height) / 2;

        System.out.println("Area of Triangle is: " + area);
    }
}
