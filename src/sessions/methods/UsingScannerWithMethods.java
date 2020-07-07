package sessions.methods;

import java.util.Scanner;

public class UsingScannerWithMethods {

    public static void main(String[] args) {
        //ask user to give you his car kilometreage
        //then return the mileage
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your km");
        int km = input.nextInt();

        //We can pass hard coded values to method params
        //and variables that are of the same data type.
        double mileageResult = getMeCarMileage(km);
        System.out.println(mileageResult);
    }

    public static double getMeCarMileage (int km) {
        return km / 1.60934;
    }
}
