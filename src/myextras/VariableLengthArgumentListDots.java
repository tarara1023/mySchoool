package myextras;

import java.util.Scanner;

public class VariableLengthArgumentListDots {

    public static void main(String[] args) {

        System.out.println(average(12, 14, 56, 87));
        }



    public static int average (int ... numbers) {
        int total =0;
         for (int numb: numbers) {
             total += numb;
         }
         return total/numbers.length;
    }
}

