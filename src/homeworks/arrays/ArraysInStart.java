package homeworks.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysInStart {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Declare variables
        System.out.println("Enter number of items: ");
        int numItems = in.nextInt();
        int[] items = new int[numItems];
        System.out.println("enter the values of all items");
        // Declare array name, to be allocated after numItems is known
        for (int i = 0; i < items.length; i++) {
            items[i] = in.nextInt();
        }




        // Print array in "index: number of stars" using a nested-loop
        // Take note that rows are the array indexes and columns are the value in that index
        for (int idx = 0; idx < items.length; ++idx) {  // row
            System.out.print(idx + ": ");
            // Print value as the number of stars
            for (int starNo = 1; starNo <= items[idx]; ++starNo) {  // column
                System.out.print("*");
            }
            System.out.println("(" + items[idx] + ")");
        }



    }
}
