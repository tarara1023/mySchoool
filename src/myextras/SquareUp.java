package myextras;

import java.util.Arrays;

public class SquareUp {
    public static void main(String[] args) {

        int n = 3;
        System.out.println(Arrays.toString(squareUp(n)));
    }




    public static int[] squareUp(int n) {
        int[] squareUp = new int[n * n];

//        for (int i = squareUp.length - 1; i >= 0; i--) {
//            for (int j = n; j > 0; j--) {
                for (int j = n; j > 0; j--) {
            for (int i = squareUp.length - 1; i > 0; i--) {
                squareUp[i] = i;

            }

        }
        return squareUp;
    }
}