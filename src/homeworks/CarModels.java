package homeworks;

import java.util.Scanner;

public class CarModels {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Plese Choose on of the following ");
        System.out.println(" 1. SUV");
        System.out.println(" 2. Sports Cars");
        System.out.println(" 3. Economy ");
        System.out.println(" 4. Luxury");
        String classWord = input.nextLine();
        String model = "";
        if (classWord.equals("1") || classWord.equalsIgnoreCase("SUV")) {
            System.out.println("1.Ford Explore");
            System.out.println("2.Honda CR-V");
            System.out.println("3.Toyota RAV4");
            System.out.println("4.Chevrolet Tahoe");
            System.out.println("Choose Model: ");
            model = input.nextLine();
            if (model.equalsIgnoreCase("Ford Explorer") || model.equalsIgnoreCase("1"))
                System.out.flush();
            System.err.println("Ford Explorer The price is $$ 25_000");



        }
    }
}
