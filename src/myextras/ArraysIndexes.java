package myextras;

import javax.crypto.spec.PSource;

public class ArraysIndexes {

    public static void main(String[] args) {

        int[] bucky = {2, 3, 4, 9, 3}; //0,1,2,3,4 -> 4

        System.out.println(bucky [2]);

        System.out.println("Index\tValue");

        int [] bucky1 = {32, 12, 18, 54, 2};

        for (int i = 0; i < bucky1.length; i++) {
            System.out.println(i + "\t\t" + bucky1[i]);
        }
        int sum = 0;
        double avarage = 0;

        for (int i = 0; i < bucky1.length; i++) {
            sum += bucky1[i];
            avarage = (double)sum / bucky1.length;
            System.out.println(sum);
            System.out.println(avarage);

        }
        System.out.println("The sum og this numbers is: " + sum);
        System.out.println(avarage);


    }

}
