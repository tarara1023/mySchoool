package myextras;

import java.util.Random;

public class Random1 {

    public static void main(String[] args) {

        Random dice = new Random();
        int number;

        for (int i = 1; i <= 10; i++) {
            number = 1 + dice.nextInt(6); //adding 1 because 6 ->0-5
            System.out.println(number) ;
        }

        int freq [] = new int [7];

        for (int i = 1; i < 1000; i++) {
            freq[1 + dice.nextInt(6)]++;
        }
        System.out.println("Face\tFrequency");

        for (int face = 1; face < freq.length; face++) {
            System.out.println(face + "\t\t" + freq[face]);
        }
    }
}
