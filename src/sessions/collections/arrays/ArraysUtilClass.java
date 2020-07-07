package sessions.collections.arrays;

import java.util.Arrays;

public class ArraysUtilClass {

    public static void main(String[] args) {

        String [] bugs = {"Beetle", "LadyBug", "Cricet"};
        System.out.println(Arrays.toString(bugs));

        int [] studentAges = {20, 21, 22, 34, 44, 25, 32, 33, 35};
        System.out.println(Arrays.toString(studentAges));

        studentAges = new int [0];
        System.out.println(Arrays.toString(studentAges));

        int [] studentAges2 = {33, 31, 30, 25, 29, 28};
        System.out.println(Arrays.toString(studentAges2));


    }
}
