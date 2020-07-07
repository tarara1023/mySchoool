package sessions.operators;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TakeInputFromUser {

    //We can write programs and make them dynamic
    //so that one algorithms(logic) works for
    //many different inputs(values)

    //Write a program for grocery store check points
    // Good Program: without having to change the code
    // Program should be able to run for many different scenarios;
    public static void main(String[] args) {

        //we need to initialize Scanner class
        //in order to be able to take input from user
        //from console
        Scanner input = new Scanner(System.in);

        double productPrice, taxPercent, tax,  total, productPrice2;

        System.out.println("Please Enter Product Price: ");
        System.out.println("Please Enter Second Product ");

        productPrice = input.nextDouble();
        productPrice2 = input.nextDouble();
        taxPercent = 10.25;
        tax = (productPrice2 + productPrice) * taxPercent / 100;
        total = productPrice + productPrice2 + tax;

        //Make sure you have import java.text.DecimalFormat
        //Round to two decimal points

        DecimalFormat decimalFormatter = new DecimalFormat (".00");


        System.out.println("Your Total: $" + decimalFormatter.format(total));

        System.out.println("Enter your full name: ");
        input.nextLine();
        String fullName = input.nextLine();

        System.out.println("Full Name: " + fullName);






    }
}
