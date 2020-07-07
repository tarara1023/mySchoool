package sessions.collections.arrays;

import java.util.Arrays;

public class ArraysClassClass {

    public static void main(String[] args) {

        int [] carYears = {2011, 2020, 2012, 2019};
        System.out.println(Arrays.toString(carYears));

        String [] names = {"John", "Elon", "Jeff", "Melanie"};
        System.out.println(Arrays.toString(names));

        //SORT
        double [] prices = {10.99, 23.99, 44.6, 1.99, 1.98};
        double [] pricesDuplicate = Arrays.copyOf(prices, prices.length);
        Arrays.sort(prices);
        System.out.println(Arrays.toString(prices));
        //Arrays.sort(answers); => no implemenation to sort boolean

        String [] cars = {"Mazda", "Bugatti", "Lambo"};
        cars[1] = cars[1].toUpperCase();
        Arrays.sort(cars);
        System.out.println(Arrays.toString(cars));
        //Uppercases come before lower cases.
        //ASCII table order
        //numbers come before the letters.
        //reference to ASCII table.

        //123 => 132 - interview question

        //BINARY SEARCH
        int [] shoesSizes = {12, 6, 7, 4, 5};
        Arrays.sort(shoesSizes);
        System.out.println(Arrays.toString(shoesSizes));
        int index = Arrays.binarySearch(shoesSizes, 7);
        System.out.println(index);

        String [] product = {"apple", "orange", "watermelon", "papaya"};
        Arrays.sort(product);
        System.out.println(Arrays.toString(product));
        System.out.println(Arrays.binarySearch(product, "oranges"));// -2 + -1












    }
}
