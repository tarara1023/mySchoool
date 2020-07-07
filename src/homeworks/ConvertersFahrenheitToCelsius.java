package homeworks;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConvertersFahrenheitToCelsius {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Please enter degree in F ");

        double degreeF = input.nextDouble();

        double degreeC = (degreeF - 32) * 5 / 9;

        DecimalFormat formatter = new DecimalFormat(".0");

        System.out.println (degreeF + " degree Fahrenheit is equal to " + formatter.format(degreeC) + " in Celsius");
    }
}

class InchesToMeters {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter inches ");

        double inches = input.nextDouble();

        double meters = inches * 0.0254;

        System.out.println(inches + " is " + meters + " meters");
    }
}
