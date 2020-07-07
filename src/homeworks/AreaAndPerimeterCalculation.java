package homeworks;
 import java.text.DecimalFormat;
 import java.util.Scanner;

public class AreaAndPerimeterCalculation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter width  ");
        double width = input.nextDouble();

        System.out.println("Please enter height  ");
        double height = input.nextDouble();

        double area = width * height;
        double perimeter = 2 * (width + height);

        DecimalFormat formatter = new DecimalFormat(".00");


        System.out.println("Area is " + formatter.format(width) + " * " + formatter. format(height) + " = " + formatter.format(area));
        System.out.println("Perimeter is 2 * (" + formatter.format(width) + " + " + formatter. format(height) + ") = "  + formatter.format(perimeter));
    }
}
