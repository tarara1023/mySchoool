package homeworks;

import java.util.Scanner;

public class RevenueFromASale {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.println("Enter unit price: ");
        int price = inp.nextInt();
        System.out.println("Enter quantity: ");
        int quantity = inp.nextInt();

        discount(price, quantity);


    }
    public static void discount (int price, int quantity) {

        double discount = 0;
        double withoutSale = price * quantity;
        double revenue = 0;
        double percent = 0;

        if (quantity >= 100 && quantity <=120) {
            percent = 10.0;
            discount = withoutSale*percent / 100;

        }else if (quantity > 120) {
            percent = 15.0;
            discount = withoutSale * percent/ 100;

        }else {
            percent = 0.0;
            discount = withoutSale;

        }

        revenue = withoutSale - discount;

        System.out.println("The revenue from sale: " + revenue + "\n"
                           + "After discount: " + discount + "$(" + percent + "%)");





    }

    }


