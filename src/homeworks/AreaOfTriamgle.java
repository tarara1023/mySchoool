package homeworks;

import java.util.Scanner;

public class AreaOfTriamgle {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the width of the triangle:" );
        int width = inp.nextInt();
        System.out.println("enter the height of the triangle");
        int height = inp.nextInt();
        int area = (height * width) / 2;
        System.out.println("Area of Triangle is: " + area);
    }
}
