package myextras;

import java.util.Random;

public class ArrayElementsAsCounter {

    public static void main(String[] args) {
        Random rand = new Random();
        int freq[] = new int [7];

        for (int i = 1; i < 1000; i++) {
            ++freq[1+rand.nextInt(6)];

        }
        System.out.println("Face\tFrequency");

        for (int face = 1; face < freq.length; face++) {
            System.out.println(face + "\t" + freq[face]);
        }
    }
}
